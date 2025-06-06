const base = {
    get() {
        return {
            url : "http://localhost:8080/zixishixuanzuo/",
            name: "zixishixuanzuo",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/zixishixuanzuo/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "研学自习室选座与门禁系统"
        } 
    }
}
export default base
