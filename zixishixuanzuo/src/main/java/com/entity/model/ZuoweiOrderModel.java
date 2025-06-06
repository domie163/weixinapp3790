package com.entity.model;

import com.entity.ZuoweiOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 座位订单
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZuoweiOrderModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 订单号
     */
    private String zuoweiOrderUuidNumber;


    /**
     * 座位
     */
    private Integer zuoweiId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 实付价格
     */
    private Double zuoweiOrderTruePrice;


    /**
     * 订单类型
     */
    private Integer zuoweiOrderTypes;


    /**
     * 支付类型
     */
    private Integer zuoweiOrderPaymentTypes;


    /**
     * 购买的座位
     */
    private String buyZuoweiNumber;


    /**
     * 订购日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date buyZuoweiTime;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3
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
	 * 获取：订单号
	 */
    public String getZuoweiOrderUuidNumber() {
        return zuoweiOrderUuidNumber;
    }


    /**
	 * 设置：订单号
	 */
    public void setZuoweiOrderUuidNumber(String zuoweiOrderUuidNumber) {
        this.zuoweiOrderUuidNumber = zuoweiOrderUuidNumber;
    }
    /**
	 * 获取：座位
	 */
    public Integer getZuoweiId() {
        return zuoweiId;
    }


    /**
	 * 设置：座位
	 */
    public void setZuoweiId(Integer zuoweiId) {
        this.zuoweiId = zuoweiId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：实付价格
	 */
    public Double getZuoweiOrderTruePrice() {
        return zuoweiOrderTruePrice;
    }


    /**
	 * 设置：实付价格
	 */
    public void setZuoweiOrderTruePrice(Double zuoweiOrderTruePrice) {
        this.zuoweiOrderTruePrice = zuoweiOrderTruePrice;
    }
    /**
	 * 获取：订单类型
	 */
    public Integer getZuoweiOrderTypes() {
        return zuoweiOrderTypes;
    }


    /**
	 * 设置：订单类型
	 */
    public void setZuoweiOrderTypes(Integer zuoweiOrderTypes) {
        this.zuoweiOrderTypes = zuoweiOrderTypes;
    }
    /**
	 * 获取：支付类型
	 */
    public Integer getZuoweiOrderPaymentTypes() {
        return zuoweiOrderPaymentTypes;
    }


    /**
	 * 设置：支付类型
	 */
    public void setZuoweiOrderPaymentTypes(Integer zuoweiOrderPaymentTypes) {
        this.zuoweiOrderPaymentTypes = zuoweiOrderPaymentTypes;
    }
    /**
	 * 获取：购买的座位
	 */
    public String getBuyZuoweiNumber() {
        return buyZuoweiNumber;
    }


    /**
	 * 设置：购买的座位
	 */
    public void setBuyZuoweiNumber(String buyZuoweiNumber) {
        this.buyZuoweiNumber = buyZuoweiNumber;
    }
    /**
	 * 获取：订购日期
	 */
    public Date getBuyZuoweiTime() {
        return buyZuoweiTime;
    }


    /**
	 * 设置：订购日期
	 */
    public void setBuyZuoweiTime(Date buyZuoweiTime) {
        this.buyZuoweiTime = buyZuoweiTime;
    }
    /**
	 * 获取：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：订单创建时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
