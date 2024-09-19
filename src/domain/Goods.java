package com.it.demo.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Goods {

    Integer id;
    String name;
    Integer realPrice;
    Integer discountPrice;
    String imageUrl;
    String norms;
    Integer stock;
    String description;
    Integer isShow;
    Date createTime;
    Date updateTime;
    Integer typeId;
    Integer businessId;

}
