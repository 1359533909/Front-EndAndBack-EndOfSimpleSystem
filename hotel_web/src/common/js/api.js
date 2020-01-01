/*
 * api接口统一管理
 */

// 环境配置
const environment = {
    // onLine: 'http://www.build.com:8080/', //生产环境请求地址
    dev: 'http://127.0.0.1:8081/', //开发环境请求地址
    // text: 'http://innovationcenter.cloudbae.cn:8301/'
}

// 接口前缀
// let host = location.host,
//     baseHost = '/',
//     baseURL = '';

// if (host.indexOf('www.build.com') > -1) {
//     // 线上环境
//     baseHost = environment.onLine;
// } else {
//     // 1.1测试环境
//     baseHost = environment.dev;
// }

//baseURL = baseHost;
var baseURL = environment.dev;

// 接口集合
export const apiUrl = {
    baseURL: baseURL,

    login: baseURL + 'login',
    //登陆
    install: baseURL + 'install',
    //注册

}
