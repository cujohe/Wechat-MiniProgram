package com.it.demo.controller;

import com.it.demo.domain.Goods;
import com.it.demo.service.IGoodsService;
import com.it.demo.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
@RestController
@RequestMapping("/goods")
public class GoodsController {


    @Autowired
    IGoodsService iGoodsService;

    @RequestMapping("/queryGoodsByType")
    public Object queryGoodsByType(Integer typeid){
        System.out.println("--"+typeid);
        HashMap<String,Object> map = new HashMap<>();
        List<Goods> goods = null;
        try{
            goods= iGoodsService.queryGoodsByType(typeid);
            map.put("code",200);
            map.put("msg","success");
            map.put("data",goods);

        } catch (Exception e) {
            map.put("code",202);
            map.put("msg",e.getMessage());
            map.put("data",null);
        }
        return map;
    }

    @RequestMapping("/queryGoodsById")
    public Object queryGoodsById(Integer id){
        System.out.println("--"+id);

        Result result = iGoodsService.queryGoodsById(id);

        return result;
    }
}
