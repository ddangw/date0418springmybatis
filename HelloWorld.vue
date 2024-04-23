<template>
  <div>
      <!-- <p><el-input v-model="bh" style="width: 240px" placeholder="Please input" /></p>
      <p><el-input v-model="xm" style="width: 240px" placeholder="Please input" /></p>
      <p><el-button @click="dayin()" type="success" round>Success</el-button></p>
      <P>=<s></s>=====g===ff=====zz=uu==ff=====oo==</P> -->
      <div >
        <p><el-input v-model="bhq" style="width: 240px" placeholder="Please input" /></p>
        <p><el-button @click="qz()" type="success" round>Success</el-button></p>
        <el-table :data="tableData" style="width: 100%">
        <el-table-column prop="bh" label="Date" width="180" />
        <el-table-column prop="xm" label="Name" width="180" />
        <!-- <el-table-column prop="address" label="Address" /> -->
        </el-table>
      </div>
  </div>
</template>
<script setup>
import { ref,inject } from 'vue'
import{stringify} from 'querystring'
const axios =inject("axios")
const bh = ref('')
const xm = ref('')
const bhq= ref('')
const dayin=()=>{
  console.log(bh.value,"-----------------",xm.value)
  axios.post("api/txl_add",stringify({
    bh:bh.value,
    xm:xm.value,
  }))
  alert(xm.value,"提交成功了")//alert只弹出第一个变量的值
}
const tableData=ref([])
const qz=()=>{

    axios.post("api/select",stringify({
    bh:bhq.value
  })).then((result)=>{
    console.log("====================================")
    tableData.value=result.data.data
    console.log(result.data.data)
    console.log("------==========================-----")
  })

}

</script>

<style lang="scss" scoped>

</style>
