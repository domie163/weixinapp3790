package com.entity.view;

import com.entity.ZuoweiOrderEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 座位订单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zuowei_order")
public class ZuoweiOrderView extends ZuoweiOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 订单类型的值
		*/
		private String zuoweiOrderValue;
		/**
		* 支付类型的值
		*/
		private String zuoweiOrderPaymentValue;



		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

		//级联表 zuowei
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
				* 座位类型的值
				*/
				private String zuoweiValue;
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

	public ZuoweiOrderView() {

	}

	public ZuoweiOrderView(ZuoweiOrderEntity zuoweiOrderEntity) {
		try {
			BeanUtils.copyProperties(this, zuoweiOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 订单类型的值
			*/
			public String getZuoweiOrderValue() {
				return zuoweiOrderValue;
			}
			/**
			* 设置： 订单类型的值
			*/
			public void setZuoweiOrderValue(String zuoweiOrderValue) {
				this.zuoweiOrderValue = zuoweiOrderValue;
			}
			/**
			* 获取： 支付类型的值
			*/
			public String getZuoweiOrderPaymentValue() {
				return zuoweiOrderPaymentValue;
			}
			/**
			* 设置： 支付类型的值
			*/
			public void setZuoweiOrderPaymentValue(String zuoweiOrderPaymentValue) {
				this.zuoweiOrderPaymentValue = zuoweiOrderPaymentValue;
			}














				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}


				//级联表的get和set zuowei

					/**
					* 获取： 座位名称
					*/
					public String getZuoweiName() {
						return zuoweiName;
					}
					/**
					* 设置： 座位名称
					*/
					public void setZuoweiName(String zuoweiName) {
						this.zuoweiName = zuoweiName;
					}

					/**
					* 获取： 座位照片
					*/
					public String getZuoweiPhoto() {
						return zuoweiPhoto;
					}
					/**
					* 设置： 座位照片
					*/
					public void setZuoweiPhoto(String zuoweiPhoto) {
						this.zuoweiPhoto = zuoweiPhoto;
					}

					/**
					* 获取： 座位类型
					*/
					public Integer getZuoweiTypes() {
						return zuoweiTypes;
					}
					/**
					* 设置： 座位类型
					*/
					public void setZuoweiTypes(Integer zuoweiTypes) {
						this.zuoweiTypes = zuoweiTypes;
					}


						/**
						* 获取： 座位类型的值
						*/
						public String getZuoweiValue() {
							return zuoweiValue;
						}
						/**
						* 设置： 座位类型的值
						*/
						public void setZuoweiValue(String zuoweiValue) {
							this.zuoweiValue = zuoweiValue;
						}

					/**
					* 获取： 开始时间
					*/
					public String getZuoweiShijian() {
						return zuoweiShijian;
					}
					/**
					* 设置： 开始时间
					*/
					public void setZuoweiShijian(String zuoweiShijian) {
						this.zuoweiShijian = zuoweiShijian;
					}

					/**
					* 获取： 现价
					*/
					public Double getZuoweiNewMoney() {
						return zuoweiNewMoney;
					}
					/**
					* 设置： 现价
					*/
					public void setZuoweiNewMoney(Double zuoweiNewMoney) {
						this.zuoweiNewMoney = zuoweiNewMoney;
					}

					/**
					* 获取： 座位
					*/
					public Integer getZuoweiNumber() {
						return zuoweiNumber;
					}
					/**
					* 设置： 座位
					*/
					public void setZuoweiNumber(Integer zuoweiNumber) {
						this.zuoweiNumber = zuoweiNumber;
					}

					/**
					* 获取： 点击次数
					*/
					public Integer getZuoweiClicknum() {
						return zuoweiClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setZuoweiClicknum(Integer zuoweiClicknum) {
						this.zuoweiClicknum = zuoweiClicknum;
					}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getZuoweiDelete() {
						return zuoweiDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setZuoweiDelete(Integer zuoweiDelete) {
						this.zuoweiDelete = zuoweiDelete;
					}

					/**
					* 获取： 座位简介
					*/
					public String getZuoweiContent() {
						return zuoweiContent;
					}
					/**
					* 设置： 座位简介
					*/
					public void setZuoweiContent(String zuoweiContent) {
						this.zuoweiContent = zuoweiContent;
					}







}
