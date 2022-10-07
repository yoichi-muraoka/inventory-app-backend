package com.example.app.mapper;

import java.sql.JDBCType;
import java.util.Date;

import javax.annotation.Generated;

import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class ItemDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0255755+09:00", comments="Source Table: inventory_app_db..items")
    public static final Item item = new Item();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0255755+09:00", comments="Source field: inventory_app_db..items.id")
    public static final SqlColumn<Integer> id = item.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0255755+09:00", comments="Source field: inventory_app_db..items.name")
    public static final SqlColumn<String> name = item.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0255755+09:00", comments="Source field: inventory_app_db..items.amount")
    public static final SqlColumn<Integer> amount = item.amount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0255755+09:00", comments="Source field: inventory_app_db..items.place_id")
    public static final SqlColumn<Integer> placeId = item.placeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0255755+09:00", comments="Source field: inventory_app_db..items.note")
    public static final SqlColumn<String> note = item.note;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0255755+09:00", comments="Source field: inventory_app_db..items.registered_at")
    public static final SqlColumn<Date> registeredAt = item.registeredAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0255755+09:00", comments="Source Table: inventory_app_db..items")
    public static final class Item extends AliasableSqlTable<Item> {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> amount = column("amount", JDBCType.INTEGER);

        public final SqlColumn<Integer> placeId = column("place_id", JDBCType.INTEGER);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public final SqlColumn<Date> registeredAt = column("registered_at", JDBCType.DATE);

        public Item() {
            super("inventory_app_db.items", Item::new);
        }
    }
}