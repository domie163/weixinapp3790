package com.entity.view;

import com.entity.ZuoweiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 座位
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zuowei")
public class ZuoweiView extends ZuoweiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 座位类型的值
		*/
		private String zuoweiValue;



	public ZuoweiView() {

	}

	public ZuoweiView(ZuoweiEntity zuoweiEntity) {
		try {
			BeanUtils.copyProperties(this, zuoweiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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









}
