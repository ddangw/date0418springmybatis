package com.qd.mapper;

import com.qd.entity.Txl;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TxlMapper {

    int addmap(Txl txl);

    Txl chacun(Txl txl);

    List<Txl> select(String bh);
}
