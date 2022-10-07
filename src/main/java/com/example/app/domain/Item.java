package com.example.app.domain;

import java.util.Date;

import javax.annotation.Generated;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

public class Item {
	
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0235838+09:00", comments="Source field: inventory_app_db..items.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0245753+09:00", comments="Source field: inventory_app_db..items.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0245753+09:00", comments="Source field: inventory_app_db..items.amount")
    private Integer amount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0245753+09:00", comments="Source field: inventory_app_db..items.place_id")
    private Integer placeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0245753+09:00", comments="Source field: inventory_app_db..items.note")
    private String note;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0245753+09:00", comments="Source field: inventory_app_db..items.registered_at")
    private Date registeredAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0235838+09:00", comments="Source field: inventory_app_db..items.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0235838+09:00", comments="Source field: inventory_app_db..items.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0245753+09:00", comments="Source field: inventory_app_db..items.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0245753+09:00", comments="Source field: inventory_app_db..items.name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0245753+09:00", comments="Source field: inventory_app_db..items.amount")
    public Integer getAmount() {
        return amount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0245753+09:00", comments="Source field: inventory_app_db..items.amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0245753+09:00", comments="Source field: inventory_app_db..items.place_id")
    public Integer getPlaceId() {
        return placeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0245753+09:00", comments="Source field: inventory_app_db..items.place_id")
    public void setPlaceId(Integer placeId) {
        this.placeId = placeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0245753+09:00", comments="Source field: inventory_app_db..items.note")
    public String getNote() {
        return note;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0245753+09:00", comments="Source field: inventory_app_db..items.note")
    public void setNote(String note) {
        this.note = note;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0255755+09:00", comments="Source field: inventory_app_db..items.registered_at")
    public Date getRegisteredAt() {
        return registeredAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0255755+09:00", comments="Source field: inventory_app_db..items.registered_at")
    public void setRegisteredAt(Date registeredAt) {
        this.registeredAt = registeredAt;
    }
    
	@Getter
	@Setter
	private Place place;
	
}