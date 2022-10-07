package com.example.app.domain;

import javax.annotation.Generated;

public class Place {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:13.948586+09:00", comments="Source field: inventory_app_db..places.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:13.9525733+09:00", comments="Source field: inventory_app_db..places.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:13.9515912+09:00", comments="Source field: inventory_app_db..places.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:13.9525733+09:00", comments="Source field: inventory_app_db..places.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:13.9525733+09:00", comments="Source field: inventory_app_db..places.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:13.9525733+09:00", comments="Source field: inventory_app_db..places.name")
    public void setName(String name) {
        this.name = name;
    }
}