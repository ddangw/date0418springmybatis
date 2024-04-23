package com.qd.controller;

import com.qd.entity.ResultData;
import com.qd.entity.Txl;
import com.qd.service.ITxlServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@CrossOrigin
public class TxlController {
    @Autowired
    private ITxlServie txlServie;
    @RequestMapping("/txl_add")
    public ResultData add(Txl txl){
        //思路是插入数据之前要查询在数据表中有没有重的记录
        //通过查询的范围值,来判断是错误还是重复了，还是异常

        //查询语句
        Txl chacun=txlServie.chaxun(txl);
//        System.out.println(chacun.getBh()+"=============");
        ResultData fhz=null;
        if (chacun==null){
            //向数据库中增加数据
            int xx=txlServie.addsev(txl);
            if (xx==1){
                fhz= ResultData.addcg("数据插入成功");
            }else  if (xx==-1){
                fhz=ResultData.addsjk("数据库连接异常");
            }
        }else {
            if (chacun.getBh()==null){
                fhz=ResultData.addsjk("数据库连接异常");
            }else {
                fhz=ResultData.addsb("数据插入失败,编号重复");
            }
        }

        return fhz;
    }
    //查询数据
    @RequestMapping("/select")
    public ResultData select(String bh){
        ResultData fhz=null;
        List<Txl> sh=txlServie.select(bh);

        if (sh==null){
            fhz= ResultData.selectsb("查询失败",null);
        }else {
            fhz =ResultData.selectcg("查询成功",sh);
        }
//        System.out.println(sh);
//        System.out.println(fhz.getData()+"ddddd");
        System.out.println("====================================");
        return fhz;
    }
}
