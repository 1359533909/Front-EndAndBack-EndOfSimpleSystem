<template>
      <div class="container">
        <div class="right1"></div>
        <div class="left">
            <div class="header">
                <h2 class="animation a1">注册账号</h2>
                <h4 class="animation a2">请填写完整个人信息</h4>
            </div>
            <el-form class="form" :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmit()" status-icon>
                <el-form-item prop="userName">
                <input type="text"  v-model="dataForm.userName" placeholder="帐号" class="animation a3">
                </el-form-item>
                <el-form-item prop="password">
                <input type="password" v-model="dataForm.password" placeholder="密码" class="animation a3">
                </el-form-item>
                <el-form-item prop="password">
                <input type="password" v-model="dataForm.password2" placeholder="确认密码" class="animation a3">
                </el-form-item>
                <el-form-item prop="name">
                <input type="name" v-model="dataForm.name" placeholder="姓名" class="animation a3">
                </el-form-item>
                <el-form-item prop="idcard">
                <input type="idcard" v-model="dataForm.idcard" placeholder="身份证号" class="animation a3">
                </el-form-item>
                <el-form-item prop="phonenumber">
                <input type="phonenumber" v-model="dataForm.phonenumber" placeholder="手机号" class="animation a3">
                </el-form-item>
                <el-form-item prop="email">
                <input type="email" v-model="dataForm.email" placeholder="邮箱号" class="animation a3">
                </el-form-item>
                <el-form-item prop="captcha">
                </el-form-item>
                <el-button class="but1 animation a6" @click="dataFormSubmit()">完成注册</el-button>
            </el-form>
        </div>
  </div>
</template>

<script>
import { ajaxPost } from '@/common/js/public.js'
import { apiUrl } from '@/common/js/api.js'

export default {
    data () {
      return {
        dataForm: {
          userName: '',
          password: '',
          password2: '',
          name: '',
          idcard: '',
          phonenumber: '',
          email: ''
        },
        dataRule: {
          userName: [
            { required: true, message: '帐号不能为空', trigger: 'blur' }
          ],
          password: [
            { required: true, message: '密码不能为空', trigger: 'blur' }
          ],
          password2: [
            { required: true, message: '确认密码不能为空', trigger: 'blur' }
          ],
          name: [
            { required: true, message: '姓名不能为空', trigger: 'blur' }
          ],
          idcard: [
            { required: true, message: '身份证不能为空', trigger: 'blur' }
          ],
          phonenumber: [
            { required: true, message: '手机号不能为空', trigger: 'blur' }
          ],
          email: [
            { required: true, message: '邮箱不能为空', trigger: 'blur' }
          ]
        }
      }
    },
    methods: {
      // 提交表单
      dataFormSubmit() {
          this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            if(this.dataForm.password === this.dataForm.password2){
              var test = {
                "userName": this.dataForm.userName,
                "password": this.dataForm.password,
                "name": this.dataForm.name,
                "idcard": this.dataForm.idcard,
                "phonenumber": this.dataForm.phonenumber,
                "email": this.dataForm.email
              }
                ajaxPost(apiUrl.install, this.$qs.stringify(test), res => {
                    alert("注册成功！")
                    this.$router.push(`/`);
                })
            }else{
                alert("两次密码输入不正确，请重新输入！")
            }
          }
        })
      }
    }
  }
</script>

<style lang='less' scoped>
* {
  box-sizing: border-box;
}

body {
  font-family: 'Rubik', sans-serif;
  margin:0;
  padding:0;
}

.container {
  display: flex;
  height: 100vh;
}

.left {
  overflow: hidden;
  display: flex;
  flex-wrap: wrap;
  flex-direction: column;
  justify-content: center;
  -webkit-animation-name: left;
          animation-name: left;
  -webkit-animation-duration: 1s;
          animation-duration: 1s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-delay: 1s;
          animation-delay: 1s;
}

.right1 {
  flex: 1;
  background-color: black;
  transition: 1s;
  background-image: url(~@/assets/img/photo4.jpg);
  background-size: cover;
  background-repeat: no-repeat;
  background-position: center;
}


h2{
  text-align: center;
  color: #0097ff;
}
h4{
  text-align: center;
  color: #0097ff;
}
.h24{
  margin: 0;
  color: #0097ff;
}


.header > h4 {
  margin-top: 10px;
  font-weight: normal;
  font-size: 15px;
  color: rgba(0, 0, 0, 0.4);
}

.form {
  max-width: 100%;
  display: flex;
  flex-direction: column;
}

.form > p {
  text-align: right;
}

.form > p > a {
  color: #000;
  font-size: 14px;
}

input {
  width: 100%;
  height: 46px;
  padding: 0 16px;
  border: 2px solid #ddd;
  border-radius: 4px;
  font-family: 'Rubik', sans-serif;
  outline: 0;
  transition: .2s;
  margin: 10px;
}
.form-field{
  width: 100%;
  height: 60px;
  padding: 0 16px;
  border: 2px solid #ddd;
  border-radius: 4px;
  outline: 0;
  transition: .2s;
  margin-top: 20px;
}

input:focus {
  border-color: #0f7ef1;
}
.form > button {
  width: 100%;
  margin: 10px;
  padding: 12px 10px;
  border: 0;
  border-radius: 3px;
  color: #fff;
  letter-spacing: 1px;
  font-family: 'Rubik', sans-serif;
  cursor:pointer;
}
.but1{
  background: linear-gradient(to right, #0097ff 0%, #bbb 100%);
}


.animation {
  -webkit-animation-name: move;
          animation-name: move;
  -webkit-animation-duration: .4s;
          animation-duration: .4s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-delay: 2s;
          animation-delay: 2s;
}

.a1 {
  -webkit-animation-delay: 2s;
          animation-delay: 2s;
}

.a2 {
  -webkit-animation-delay: 2.1s;
          animation-delay: 2.1s;
}

.a3 {
  -webkit-animation-delay: 2.2s;
          animation-delay: 2.2s;
}

.a4 {
  -webkit-animation-delay: 2.3s;
          animation-delay: 2.3s;
}

.a5 {
  -webkit-animation-delay: 2.4s;
          animation-delay: 2.4s;
}

.a6 {
  -webkit-animation-delay: 2.5s;
          animation-delay: 2.5s;
}

@-webkit-keyframes move {
  0% {
    opacity: 0;
    visibility: hidden;
    -webkit-transform: translateY(40px);
            transform: translateY(40px);
  }
  100% {
    opacity: 1;
    visibility: visible;
    -webkit-transform: translateY(0);
            transform: translateY(0);
  }
}

@keyframes move {
  0% {
    opacity: 0;
    visibility: hidden;
    -webkit-transform: translateY(40px);
            transform: translateY(40px);
  }
  100% {
    opacity: 1;
    visibility: visible;
    -webkit-transform: translateY(0);
            transform: translateY(0);
  }
}
@-webkit-keyframes left {
  0% {
    opacity: 0;
    width: 0;
  }
  100% {
    opacity: 1;
    padding: 20px 40px;
    width: 440px;
  }
}
@keyframes left {
  0% {
    opacity: 0;
    width: 0;
  }
  100% {
    opacity: 1;
    padding: 20px 40px;
    width: 440px;
  }
}
</style>

