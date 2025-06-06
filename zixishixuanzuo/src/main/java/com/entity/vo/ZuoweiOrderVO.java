package com.entity.vo;

import com.entity.ZuoweiOrderEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 座位订单
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zuowei_order")
public class ZuoweiOrderVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 订单号
     */

    @TableField(value = "zuowei_order_uuid_number")
    private String zuoweiOrderUuidNumber;


    /**
     * 座位
     */

    @TableField(value = "zuowei_id")
    private Integer zuoweiId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 实付价格
     */

    @TableField(value = "zuowei_order_true_price")
    private Double zuoweiOrderTruePrice;


    /**
     * 订单类型
     */

    @TableField(value = "zuowei_order_types")
    private Integer zuoweiOrderTypes;


    /**
     * 支付类型
     */

    @TableField(value = "zuowei_order_payment_types")
    private Integer zuoweiOrderPaymentTypes;


    /**
     * 购买的座位
     */

    @TableField(value = "buy_zuowei_number")
    private String buyZuoweiNumber;


    /**
     * 订购日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "buy_zuowei_time")
    private Date buyZuoweiTime;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：订单号
	 */
    public String getZuoweiOrderUuidNumber() {
        return zuoweiOrderUuidNumber;
    }


    /**
	 * 获取：订单号
	 */

    public void setZuoweiOrderUuidNumber(String zuoweiOrderUuidNumber) {
        this.zuoweiOrderUuidNumber = zuoweiOrderUuidNumber;
    }
    /**
	 * 设置：座位
	 */
    public Integer getZuoweiId() {
        return zuoweiId;
    }


    /**
	 * 获取：座位
	 */

    public void setZuoweiId(Integer zuoweiId) {
        this.zuoweiId = zuoweiId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：实付价格
	 */
    public Double getZuoweiOrderTruePrice() {
        return zuoweiOrderTruePrice;
    }


    /**
	 * 获取：实付价格
	 */

    public void setZuoweiOrderTruePrice(Double zuoweiOrderTruePrice) {
        this.zuoweiOrderTruePrice = zuoweiOrderTruePrice;
    }
    /**
	 * 设置：订单类型
	 */
    public Integer getZuoweiOrderTypes() {
        return zuoweiOrderTypes;
    }


    /**
	 * 获取：订单类型
	 */

    public void setZuoweiOrderTypes(Integer zuoweiOrderTypes) {
        this.zuoweiOrderTypes = zuoweiOrderTypes;
    }
    /**
	 * 设置：支付类型
	 */
    public Integer getZuoweiOrderPaymentTypes() {
        return zuoweiOrderPaymentTypes;
    }


    /**
	 * 获取：支付类型
	 */

    public void setZuoweiOrderPaymentTypes(Integer zuoweiOrderPaymentTypes) {
        this.zuoweiOrderPaymentTypes = zuoweiOrderPaymentTypes;
    }
    /**
	 * 设置：购买的座位
	 */
    public String getBuyZuoweiNumber() {
        return buyZuoweiNumber;
    }


    /**
	 * 获取：购买的座位
	 */

    public void setBuyZuoweiNumber(String buyZuoweiNumber) {
        this.buyZuoweiNumber = buyZuoweiNumber;
    }
    /**
	 * 设置：订购日期
	 */
    public Date getBuyZuoweiTime() {
        return buyZuoweiTime;
    }


    /**
	 * 获取：订购日期
	 */

    public void setBuyZuoweiTime(Date buyZuoweiTime) {
        this.buyZuoweiTime = buyZuoweiTime;
    }
    /**
	 * 设置：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：订单创建时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
