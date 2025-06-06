package com.dao;

import com.entity.ZuoweiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuoweiView;

/**
 * 座位 Dao 接口
 *
 * @author 
 */
public interface ZuoweiDao extends BaseMapper<ZuoweiEntity> {

   List<ZuoweiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
