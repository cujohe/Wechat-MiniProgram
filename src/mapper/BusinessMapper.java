package com.it.demo.mapper;

import com.it.demo.domain.Business;
import org.apache.ibatis.annotations.Select;

public interface BusinessMapper {

    @Select("select * from tb_business where id=#{businessId}")
    Business queryById(Integer businessId);
}
