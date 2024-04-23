package com.qd.service;

import com.qd.entity.Txl;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface ITxlServie {
    int addsev(Txl txl);

    Txl chaxun(Txl txl);


    List<Txl> select(String bh);
}
