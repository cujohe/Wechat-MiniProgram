package com.it.demo.mapper;


import com.it.demo.domain.Goods;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GoodsMapper {

    @Select("select * from tb_goods where business_id=#{typeid}")
    List<Goods> queryGoodsByType(Integer typeid);

    @Select("select * from tb_goods ")
    List<Goods> queryGoods();

    @Select("select * from tb_goods where id=#{id}")
    Goods queryGoodsById(Integer id);
}
