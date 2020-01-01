import Vue from 'vue'
import Router from 'vue-router'
import login from '@/views/login'
import install from '@/views/install'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'login',
      component: login
    },{
      path: '/install',
      name: 'install',
      component: install
    }
  ]
})
