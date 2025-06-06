
<template>
    <view class="content">
        <form class="app-update-pv">
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}'
                      class="title">座位名称</view>
                <input   disabled
                         :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#008761","borderRadius":"16rpx","color":"#008761","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                         :disabled="ro.zuoweiName" type="text" v-model="ruleForm.zuoweiName" placeholder="座位名称"></input>
            </view>
                <view
                        :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(218, 220, 219, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"108rpx"}'
                        class="cu-form-group" @tap="zuoweiPhotoTap">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}'
                          class="title">座位照片</view>
                    <view class="right-input" style="padding:0;textAlign:left">
                        <image
                                :style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
                                class="avator" v-if="ruleForm.zuoweiPhoto" :src="ruleForm.zuoweiPhoto" mode="aspectFill">
                        </image>
                        <image  :style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
                                class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
                    </view>
                </view>
					                <view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                      class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}'
                          class="title">座位类型</view>
                    <picker @change="zuoweiTypesChange" :value="zuoweiTypesIndex" :range="zuoweiTypesOptions" range-key="indexName">
                        <view
                                :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#008761","borderRadius":"16rpx","color":"#008761","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                                class="uni-input">{{ruleForm.zuoweiTypes?ruleForm.zuoweiValue:"请选择座位类型"}}</view>
                    </picker>
                </view>
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}'
                      class="title">开始时间</view>
                <input   disabled
                         :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#008761","borderRadius":"16rpx","color":"#008761","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                         :disabled="ro.zuoweiShijian" type="text" v-model="ruleForm.zuoweiShijian" placeholder="开始时间"></input>
            </view>
                <view
                        :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                        class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}'
                          class="title">座位</view>
                    <input   disabled
                             :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#008761","borderRadius":"16rpx","color":"#008761","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                             :disabled="ro.zuoweiNumber" type="number" v-model="ruleForm.zuoweiNumber" placeholder="座位"></input>
                </view>
                <view
                        :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                        class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}'
                          class="title">点击次数</view>
                    <input   disabled
                             :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#008761","borderRadius":"16rpx","color":"#008761","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                             :disabled="ro.zuoweiClicknum" type="number" v-model="ruleForm.zuoweiClicknum" placeholder="点击次数"></input>
                </view>
<!-- text后缀 -->
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"210rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}'
                      class="title">座位简介</view>
                <textarea :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#008761","borderRadius":"16rpx","color":"#008761","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx","height":"200rpx"}'
                          :disabled="ro.zuoweiContent" v-model="ruleForm.zuoweiContent" placeholder="座位简介"/>
            </view>

            <view class="btn">
                <button
                        :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"#008761","borderColor":"#409EFF","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0","width":"70%","fontSize":"32rpx","borderStyle":"solid","height":"80rpx"}'
                        @tap="onSubmitTap" class="bg-red">提交</button>
            </view>
        </form>

					<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="createTimeConfirm"
                              ref="createTime" themeColor="#333333"></w-picker>


    </view>
</template>

<script>
    import wPicker from "@/components/w-picker/w-picker.vue";

    export default {
        data() {
            return {
                cross: '',
                ro:{
					zuoweiName: false,
					zuoweiPhoto: false,
					zuoweiTypes: false,
					zuoweiShijian: false,
					zuoweiNewMoney: false,
					zuoweiNumber: false,
					zuoweiClicknum: false,
					zuoweiDelete: false,
					zuoweiContent: false,
					createTime: false,
        },
            ruleForm: {
					zuoweiName: '',
					zuoweiPhoto: '',
					zuoweiTypes: '',//数字
					zuoweiValue: '',//数字对应的值
					zuoweiShijian: '',
					zuoweiNewMoney: '',
					zuoweiNumber: '',
					zuoweiClicknum: '',
					zuoweiDelete: '',
					zuoweiContent: '',
					createTime: '',
            },
            // 登陆用户信息
            user: {},
				zuoweiTypesOptions: [],
							zuoweiTypesIndex : 0,

        }
        },
        components: {
            wPicker
        },
        computed: {
            baseUrl() {
                return this.$base.url;
            },
        },
        async onLoad(options) {

		/*下拉框*/
			let zuoweiTypesParams = {
                page: 1,
                limit: 100,
                dicCode: 'zuowei_types',
            }
			let zuoweiTypes = await this.$api.page(`dictionary`, zuoweiTypesParams);
			this.zuoweiTypesOptions = zuoweiTypes.data.list


            // 如果是更新操作
            if (options.id) {
                this.ruleForm.id = options.id;
                // 获取信息
                let res = await this.$api.info(`zuowei`, this.ruleForm.id);
                this.ruleForm = res.data;
            }
            if(options.zuoweiId){
                this.ruleForm.zuoweiId = options.zuoweiId;
            }
            // 跨表
            // this.styleChange()
        },
        methods: {
            // 下拉变化
            zuoweiTypesChange(e) {
                this.zuoweiTypesIndex = e.target.value
                this.ruleForm.zuoweiValue = this.zuoweiTypesOptions[this.zuoweiTypesIndex].indexName
                this.ruleForm.zuoweiTypes = this.zuoweiTypesOptions[this.zuoweiTypesIndex].codeIndex
            },


            // styleChange() {
            // 	this.$nextTick(() => {
            // 		// document.querySelectorAll('.app-update-pv .cu-form-group .uni-yaoxianStyle-yaoxianStyle').forEach(el=>{
            // 		//   el.style.backgroundColor = this.addUpdateForm.yaoxianStyle.content.backgroundColor
            // 		// })
            // 	})
            // },


			zuoweiPhotoTap() {
                let _this = this;
                this.$api.upload(function(res) {
                    _this.ruleForm.zuoweiPhoto = _this.$base.url + 'upload/' + res.file;
                    _this.$forceUpdate();
                    _this.$nextTick(() => {
                        // _this.styleChange()
                    })
                });
            },
			// 日期控件
			createTimeConfirm(val) {
                console.log(val)
                this.ruleForm.createTime = val.result;
                this.$forceUpdate();
            },




            getUUID() {
                return new Date().getTime();
            },
            async onSubmitTap() {
				if ((!this.ruleForm.zuoweiName)) {
                    this.$utils.msg(`座位名称不能为空`);
                    return
                }
				if ((!this.ruleForm.zuoweiPhoto)) {
                    this.$utils.msg(`座位照片不能为空`);
                    return
                }
				if ((!this.ruleForm.zuoweiShijian)) {
                    this.$utils.msg(`开始时间不能为空`);
                    return
                }
				if ((!this.ruleForm.zuoweiNumber) && (!this.$validate.isIntNumer(this.ruleForm.zuoweiNumber)) && this.ruleForm.zuoweiNumber >0) {
                    this.$utils.msg(`座位不能为空，不能小于0 格式为数字`);
                    return
                }
				if ((!this.ruleForm.zuoweiClicknum) && (!this.$validate.isIntNumer(this.ruleForm.zuoweiClicknum)) && this.ruleForm.zuoweiClicknum >0) {
                    this.$utils.msg(`点击次数不能为空，不能小于0 格式为数字`);
                    return
                }
                if (this.ruleForm.id) {
                    await this.$api.update(`zuowei`, this.ruleForm);
                } else {
                    await this.$api.save(`zuowei`, this.ruleForm);
                }
                uni.setStorageSync('pingluenStateState', true);
                this.$utils.msgBack('提交成功');
            },
            getDate(type) {
                const date = new Date();
                let year = date.getFullYear();
                let month = date.getMonth() + 1;
                let day = date.getDate();
                if (type === 'start') {
                    year = year - 60;
                } else if (type === 'end') {
                    year = year + 2;
                }
                month = month > 9 ? month : '0' + month;;
                day = day > 9 ? day : '0' + day;
                return `${year}-${month}-${day}`;
            },
            toggleTab(str) {
                this.$refs[str].show();
            }
        }
    }
</script>

<style lang="scss" scoped>
    .container {
        padding: 20upx;
    }

    .content:after {
        position: fixed;
        top: 0;
        right: 0;
        left: 0;
        bottom: 0;
        content: '';
        background-attachment: fixed;
        background-size: cover;
        background-position: center;
    }

    textarea {
        border: 1upx solid #EEEEEE;
        border-radius: 20upx;
        padding: 20upx;
    }

    .title {
        width: 180upx;
    }

    .avator {
        width: 150upx;
        height: 60upx;
    }

    .right-input {
        flex: 1;
        text-align: left;
        padding: 0 24upx;
    }

    .cu-form-group.active {
        justify-content: space-between;
    }

    .btn {
        display: flex;
        align-items: center;
        justify-content: center;
        flex-wrap: wrap;
        padding: 20upx 0;
    }

    .cu-form-group {
        padding: 0 24upx;
        background-color: transparent;
        min-height: inherit;
    }

    .cu-form-group+.cu-form-group {
        border: 0;
    }

    .cu-form-group uni-input {
        padding: 0 30upx;
    }

    .uni-input {
        padding: 0 30upx;
    }

    .cu-form-group uni-textarea {
        padding: 30upx;
        margin: 0;
    }

    .cu-form-group uni-picker::after {
        line-height: 68rpx;
    }

    .select .uni-input {
        line-height: 68rpx;
    }

    .input .right-input {
        line-height: 68rpx;
    }
</style>