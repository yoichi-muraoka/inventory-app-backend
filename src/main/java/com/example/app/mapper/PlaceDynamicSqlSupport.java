package com.example.app.mapper;

import java.sql.JDBCType;

import javax.annotation.Generated;

import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class PlaceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:13.9795713+09:00", comments="Source Table: inventory_app_db..places")
    public static final Place place = new Place();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:13.9805877+09:00", comments="Source field: inventory_app_db..places.id")
    public static final SqlColumn<Integer> id = place.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:13.9825784+09:00", comments="Source field: inventory_app_db..places.name")
    public static final SqlColumn<String> name = place.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:13.9795713+09:00", comments="Source Table: inventory_app_db..places")
    public static final class Place extends AliasableSqlTable<Place> {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public Place() {
            super("inventory_app_db.places", Place::new);
        }
    }
}