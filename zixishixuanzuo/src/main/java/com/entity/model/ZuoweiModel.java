package com.entity.model;

import com.entity.ZuoweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 座位
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZuoweiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 座位名称
     */
    private String zuoweiName;


    /**
     * 座位照片
     */
    private String zuoweiPhoto;


    /**
     * 座位类型
     */
    private Integer zuoweiTypes;


    /**
     * 开始时间
     */
    private String zuoweiShijian;


    /**
     * 现价
     */
    private Double zuoweiNewMoney;


    /**
     * 座位
     */
    private Integer zuoweiNumber;


    /**
     * 点击次数
     */
    private Integer zuoweiClicknum;


    /**
     * 逻辑删除
     */
    private Integer zuoweiDelete;


    /**
     * 座位简介
     */
    private String zuoweiContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：座位名称
	 */
    public String getZuoweiName() {
        return zuoweiName;
    }


    /**
	 * 设置：座位名称
	 */
    public void setZuoweiName(String zuoweiName) {
        this.zuoweiName = zuoweiName;
    }
    /**
	 * 获取：座位照片
	 */
    public String getZuoweiPhoto() {
        return zuoweiPhoto;
    }


    /**
	 * 设置：座位照片
	 */
    public void setZuoweiPhoto(String zuoweiPhoto) {
        this.zuoweiPhoto = zuoweiPhoto;
    }
    /**
	 * 获取：座位类型
	 */
    public Integer getZuoweiTypes() {
        return zuoweiTypes;
    }


    /**
	 * 设置：座位类型
	 */
    public void setZuoweiTypes(Integer zuoweiTypes) {
        this.zuoweiTypes = zuoweiTypes;
    }
    /**
	 * 获取：开始时间
	 */
    public String getZuoweiShijian() {
        return zuoweiShijian;
    }


    /**
	 * 设置：开始时间
	 */
    public void setZuoweiShijian(String zuoweiShijian) {
        this.zuoweiShijian = zuoweiShijian;
    }
    /**
	 * 获取：现价
	 */
    public Double getZuoweiNewMoney() {
        return zuoweiNewMoney;
    }


    /**
	 * 设置：现价
	 */
    public void setZuoweiNewMoney(Double zuoweiNewMoney) {
        this.zuoweiNewMoney = zuoweiNewMoney;
    }
    /**
	 * 获取：座位
	 */
    public Integer getZuoweiNumber() {
        return zuoweiNumber;
    }


    /**
	 * 设置：座位
	 */
    public void setZuoweiNumber(Integer zuoweiNumber) {
        this.zuoweiNumber = zuoweiNumber;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getZuoweiClicknum() {
        return zuoweiClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setZuoweiClicknum(Integer zuoweiClicknum) {
        this.zuoweiClicknum = zuoweiClicknum;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getZuoweiDelete() {
        return zuoweiDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setZuoweiDelete(Integer zuoweiDelete) {
        this.zuoweiDelete = zuoweiDelete;
    }
    /**
	 * 获取：座位简介
	 */
    public String getZuoweiContent() {
        return zuoweiContent;
    }


    /**
	 * 设置：座位简介
	 */
    public void setZuoweiContent(String zuoweiContent) {
        this.zuoweiContent = zuoweiContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
