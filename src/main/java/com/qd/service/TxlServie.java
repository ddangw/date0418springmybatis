package com.qd.service;
import com.qd.entity.Txl;
import com.qd.mapper.TxlMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class TxlServie implements ITxlServie {
    @Resource
    private TxlMapper txlMapper;
    //增加里面的查询方法
    @Override
    public Txl chaxun(Txl txl) {
        Txl chaxun=null;
        try {
            chaxun=txlMapper.chacun(txl);
        } catch (Exception e) {
            chaxun=new Txl();
        }
        return chaxun;
    }



    //add的增加方法
    @Override
    public int addsev(Txl txl){
        int x=0;
        try {
            x=txlMapper.addmap(txl);
        } catch (Exception e) {
            x=-1;
        }
        return x;
    }
    //查询数据
    @Override
    public List<Txl> select(String bh) {
        System.out.println(bh);
        List<Txl> list=txlMapper.select(bh);
//        System.out.println(list);
        return list;
    }

}
