package com.it.demo.service.impl;

import com.it.demo.domain.Business;
import com.it.demo.domain.Goods;
import com.it.demo.mapper.GoodsMapper;
import com.it.demo.mapper.BusinessMapper;
import com.it.demo.service.IGoodsService;
import com.it.demo.util.MyException;
import com.it.demo.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class GoodsServiceImpl implements IGoodsService {

    @Autowired
    GoodsMapper goodsMapper;

    @Autowired
    BusinessMapper businessMapper;

    @Override
    public List<Goods> queryGoodsByType(Integer id) throws MyException {
        if (id == null) {
            throw new MyException("请传入正确的id");

        }else{
            if(id==0){
                return goodsMapper.queryGoods();
            }else{
                return goodsMapper.queryGoodsByType(id);
            }
        }
    }

    @Override
    public Result queryGoodsById(Integer id) {
        if(id==null){
            return new Result(201,"ID不存在，请输入ID",null);
        }else{
            Goods goods= goodsMapper.queryGoodsById(id);
            if(goods==null){
                return new Result(202,"商品不存在",null);
            }else {
                Integer businessId = goods.getBusinessId();
                Business business = businessMapper.queryById(businessId);

                HashMap<String, Object> map = new HashMap<>();
                map.put("goods", goods);
                map.put("business", business);
                return new Result(200, "查询成功", map);
            }
        }
    }
}
