
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 座位
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/zuowei")
public class ZuoweiController {
    private static final Logger logger = LoggerFactory.getLogger(ZuoweiController.class);

    @Autowired
    private ZuoweiService zuoweiService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service

    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        params.put("zuoweiDeleteStart",1);params.put("zuoweiDeleteEnd",1);
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = zuoweiService.queryPage(params);

        //字典表数据转换
        List<ZuoweiView> list =(List<ZuoweiView>)page.getList();
        for(ZuoweiView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ZuoweiEntity zuowei = zuoweiService.selectById(id);
        if(zuowei !=null){
            //entity转view
            ZuoweiView view = new ZuoweiView();
            BeanUtils.copyProperties( zuowei , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ZuoweiEntity zuowei, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,zuowei:{}",this.getClass().getName(),zuowei.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<ZuoweiEntity> queryWrapper = new EntityWrapper<ZuoweiEntity>()
            .eq("zuowei_name", zuowei.getZuoweiName())
            .eq("zuowei_types", zuowei.getZuoweiTypes())
            .eq("zuowei_shijian", zuowei.getZuoweiShijian())
            .eq("zuowei_number", zuowei.getZuoweiNumber())
            .eq("zuowei_clicknum", zuowei.getZuoweiClicknum())
            .eq("zuowei_delete", zuowei.getZuoweiDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ZuoweiEntity zuoweiEntity = zuoweiService.selectOne(queryWrapper);
        if(zuoweiEntity==null){
            zuowei.setZuoweiClicknum(1);
            zuowei.setZuoweiDelete(1);
            zuowei.setCreateTime(new Date());
            zuoweiService.insert(zuowei);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ZuoweiEntity zuowei, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,zuowei:{}",this.getClass().getName(),zuowei.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<ZuoweiEntity> queryWrapper = new EntityWrapper<ZuoweiEntity>()
            .notIn("id",zuowei.getId())
            .andNew()
            .eq("zuowei_name", zuowei.getZuoweiName())
            .eq("zuowei_types", zuowei.getZuoweiTypes())
            .eq("zuowei_shijian", zuowei.getZuoweiShijian())
            .eq("zuowei_number", zuowei.getZuoweiNumber())
            .eq("zuowei_clicknum", zuowei.getZuoweiClicknum())
            .eq("zuowei_delete", zuowei.getZuoweiDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ZuoweiEntity zuoweiEntity = zuoweiService.selectOne(queryWrapper);
        if("".equals(zuowei.getZuoweiPhoto()) || "null".equals(zuowei.getZuoweiPhoto())){
                zuowei.setZuoweiPhoto(null);
        }
        if(zuoweiEntity==null){
            zuoweiService.updateById(zuowei);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        ArrayList<ZuoweiEntity> list = new ArrayList<>();
        for(Integer id:ids){
            ZuoweiEntity zuoweiEntity = new ZuoweiEntity();
            zuoweiEntity.setId(id);
            zuoweiEntity.setZuoweiDelete(2);
            list.add(zuoweiEntity);
        }
        if(list != null && list.size() >0){
            zuoweiService.updateBatchById(list);
        }
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<ZuoweiEntity> zuoweiList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            ZuoweiEntity zuoweiEntity = new ZuoweiEntity();
//                            zuoweiEntity.setZuoweiName(data.get(0));                    //座位名称 要改的
//                            zuoweiEntity.setZuoweiPhoto("");//详情和图片
//                            zuoweiEntity.setZuoweiTypes(Integer.valueOf(data.get(0)));   //座位类型 要改的
//                            zuoweiEntity.setZuoweiShijian(data.get(0));                    //开始时间 要改的
//                            zuoweiEntity.setZuoweiNewMoney(data.get(0));                    //现价 要改的
//                            zuoweiEntity.setZuoweiNumber(Integer.valueOf(data.get(0)));   //座位 要改的
//                            zuoweiEntity.setZuoweiClicknum(Integer.valueOf(data.get(0)));   //点击次数 要改的
//                            zuoweiEntity.setZuoweiDelete(1);//逻辑删除字段
//                            zuoweiEntity.setZuoweiContent("");//详情和图片
//                            zuoweiEntity.setCreateTime(date);//时间
                            zuoweiList.add(zuoweiEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        zuoweiService.insertBatch(zuoweiList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = zuoweiService.queryPage(params);

        //字典表数据转换
        List<ZuoweiView> list =(List<ZuoweiView>)page.getList();
        for(ZuoweiView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ZuoweiEntity zuowei = zuoweiService.selectById(id);
            if(zuowei !=null){

                //点击数量加1
                zuowei.setZuoweiClicknum(zuowei.getZuoweiClicknum()+1);
                zuoweiService.updateById(zuowei);

                //entity转view
                ZuoweiView view = new ZuoweiView();
                BeanUtils.copyProperties( zuowei , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody ZuoweiEntity zuowei, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,zuowei:{}",this.getClass().getName(),zuowei.toString());
        Wrapper<ZuoweiEntity> queryWrapper = new EntityWrapper<ZuoweiEntity>()
            .eq("zuowei_name", zuowei.getZuoweiName())
            .eq("zuowei_types", zuowei.getZuoweiTypes())
            .eq("zuowei_shijian", zuowei.getZuoweiShijian())
            .eq("zuowei_number", zuowei.getZuoweiNumber())
            .eq("zuowei_clicknum", zuowei.getZuoweiClicknum())
            .eq("zuowei_delete", zuowei.getZuoweiDelete())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ZuoweiEntity zuoweiEntity = zuoweiService.selectOne(queryWrapper);
        if(zuoweiEntity==null){
            zuowei.setZuoweiDelete(1);
            zuowei.setCreateTime(new Date());
        zuoweiService.insert(zuowei);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}
