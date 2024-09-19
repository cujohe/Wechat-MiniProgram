package com.it.demo.service;

import com.it.demo.domain.Goods;
import com.it.demo.util.MyException;
import com.it.demo.util.Result;

import java.util.List;

public interface IGoodsService {

    List<Goods> queryGoodsByType(Integer id) throws MyException;

    Result queryGoodsById(Integer id);
}
