package com.example.app.mapper;

import static com.example.app.mapper.PlaceDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.example.app.domain.Place;
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
public interface PlaceMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<Place>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0055862+09:00", comments="Source Table: inventory_app_db..places")
    BasicColumn[] selectList = BasicColumn.columnList(id, name);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:13.9865868+09:00", comments="Source Table: inventory_app_db..places")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PlaceResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR)
    })
    List<Place> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:13.9905897+09:00", comments="Source Table: inventory_app_db..places")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PlaceResult")
    Optional<Place> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:13.991587+09:00", comments="Source Table: inventory_app_db..places")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, place, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:13.9935831+09:00", comments="Source Table: inventory_app_db..places")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, place, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:13.9955866+09:00", comments="Source Table: inventory_app_db..places")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:13.9965766+09:00", comments="Source Table: inventory_app_db..places")
    default int insert(Place row) {
        return MyBatis3Utils.insert(this::insert, row, place, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0015832+09:00", comments="Source Table: inventory_app_db..places")
    default int insertMultiple(Collection<Place> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, place, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0035876+09:00", comments="Source Table: inventory_app_db..places")
    default int insertSelective(Place row) {
        return MyBatis3Utils.insert(this::insert, row, place, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(name).toPropertyWhenPresent("name", row::getName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0075901+09:00", comments="Source Table: inventory_app_db..places")
    default Optional<Place> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, place, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0095862+09:00", comments="Source Table: inventory_app_db..places")
    default List<Place> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, place, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0105835+09:00", comments="Source Table: inventory_app_db..places")
    default List<Place> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, place, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0115862+09:00", comments="Source Table: inventory_app_db..places")
    default Optional<Place> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0125718+09:00", comments="Source Table: inventory_app_db..places")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, place, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0145855+09:00", comments="Source Table: inventory_app_db..places")
    static UpdateDSL<UpdateModel> updateAllColumns(Place row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(name).equalTo(row::getName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.015576+09:00", comments="Source Table: inventory_app_db..places")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Place row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(name).equalToWhenPresent(row::getName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0175857+09:00", comments="Source Table: inventory_app_db..places")
    default int updateByPrimaryKey(Place row) {
        return update(c ->
            c.set(name).equalTo(row::getName)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-07T13:06:14.0195862+09:00", comments="Source Table: inventory_app_db..places")
    default int updateByPrimaryKeySelective(Place row) {
        return update(c ->
            c.set(name).equalToWhenPresent(row::getName)
            .where(id, isEqualTo(row::getId))
        );
    }
}