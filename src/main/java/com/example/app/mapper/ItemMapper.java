package com.example.app.mapper;

import static com.example.app.mapper.ItemDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.example.app.domain.Item;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface ItemMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<Item>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0265773+09:00", comments="Source Table: inventory_app_db..items")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, amount, placeId, note, registeredAt);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0255755+09:00", comments="Source Table: inventory_app_db..items")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ItemResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="amount", property="amount", jdbcType=JdbcType.INTEGER),
        @Result(column="place_id", property="placeId", jdbcType=JdbcType.INTEGER),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="registered_at", property="registeredAt", jdbcType=JdbcType.DATE)
    })
    List<Item> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0265773+09:00", comments="Source Table: inventory_app_db..items")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ItemResult")
    Optional<Item> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0265773+09:00", comments="Source Table: inventory_app_db..items")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, item, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0265773+09:00", comments="Source Table: inventory_app_db..items")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, item, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0265773+09:00", comments="Source Table: inventory_app_db..items")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0265773+09:00", comments="Source Table: inventory_app_db..items")
    default int insert(Item row) {
        return MyBatis3Utils.insert(this::insert, row, item, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(amount).toProperty("amount")
            .map(placeId).toProperty("placeId")
            .map(note).toProperty("note")
            .map(registeredAt).toProperty("registeredAt")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0265773+09:00", comments="Source Table: inventory_app_db..items")
    default int insertMultiple(Collection<Item> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, item, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(amount).toProperty("amount")
            .map(placeId).toProperty("placeId")
            .map(note).toProperty("note")
            .map(registeredAt).toProperty("registeredAt")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0265773+09:00", comments="Source Table: inventory_app_db..items")
    default int insertSelective(Item row) {
        return MyBatis3Utils.insert(this::insert, row, item, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(name).toPropertyWhenPresent("name", row::getName)
            .map(amount).toPropertyWhenPresent("amount", row::getAmount)
            .map(placeId).toPropertyWhenPresent("placeId", row::getPlaceId)
            .map(note).toPropertyWhenPresent("note", row::getNote)
            .map(registeredAt).toPropertyWhenPresent("registeredAt", row::getRegisteredAt)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0265773+09:00", comments="Source Table: inventory_app_db..items")
    default Optional<Item> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, item, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0265773+09:00", comments="Source Table: inventory_app_db..items")
    default List<Item> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, item, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0275731+09:00", comments="Source Table: inventory_app_db..items")
    default List<Item> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, item, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0275731+09:00", comments="Source Table: inventory_app_db..items")
    default Optional<Item> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0275731+09:00", comments="Source Table: inventory_app_db..items")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, item, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0275731+09:00", comments="Source Table: inventory_app_db..items")
    static UpdateDSL<UpdateModel> updateAllColumns(Item row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(name).equalTo(row::getName)
                .set(amount).equalTo(row::getAmount)
                .set(placeId).equalTo(row::getPlaceId)
                .set(note).equalTo(row::getNote)
                .set(registeredAt).equalTo(row::getRegisteredAt);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0275731+09:00", comments="Source Table: inventory_app_db..items")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Item row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(name).equalToWhenPresent(row::getName)
                .set(amount).equalToWhenPresent(row::getAmount)
                .set(placeId).equalToWhenPresent(row::getPlaceId)
                .set(note).equalToWhenPresent(row::getNote)
                .set(registeredAt).equalToWhenPresent(row::getRegisteredAt);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0275731+09:00", comments="Source Table: inventory_app_db..items")
    default int updateByPrimaryKey(Item row) {
        return update(c ->
            c.set(name).equalTo(row::getName)
            .set(amount).equalTo(row::getAmount)
            .set(placeId).equalTo(row::getPlaceId)
            .set(note).equalTo(row::getNote)
            .set(registeredAt).equalTo(row::getRegisteredAt)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0275731+09:00", comments="Source Table: inventory_app_db..items")
    default int updateByPrimaryKeySelective(Item row) {
        return update(c ->
            c.set(name).equalToWhenPresent(row::getName)
            .set(amount).equalToWhenPresent(row::getAmount)
            .set(placeId).equalToWhenPresent(row::getPlaceId)
            .set(note).equalToWhenPresent(row::getNote)
            .set(registeredAt).equalToWhenPresent(row::getRegisteredAt)
            .where(id, isEqualTo(row::getId))
        );
    }
}