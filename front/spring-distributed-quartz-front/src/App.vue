<template>
      <a-config-provider :locale="locale">
    <div id="app">
      <quartz />
    </div>
   </a-config-provider>
</template>

<script>
import Quartz from './pages/Quartz.vue'
import zhCN from 'ant-design-vue/lib/locale-provider/zh_CN';

export default {
  name: 'App',
  components: {
    Quartz
  },
  data: function () {
    return {
      locale: zhCN
    }
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
