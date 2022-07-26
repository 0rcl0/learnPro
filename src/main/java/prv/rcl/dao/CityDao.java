package prv.rcl.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import prv.rcl.entity.Cities;

import java.util.List;

@Mapper
public interface CityDao {
    /**
     * 通过 省份 ID 查找 所有市
     * @param stateId 省份 ID
     * @return {@link List} city
     */
    List<Cities> queryByStateId(@Param("state_id") long stateId);

    /**
     * code_full 找到 街道，街道往上找到城市
     * @param cityId 城市ID
     * @return {@link Cities}
     */
    Cities queryByCityId(@Param("city_id")long cityId);

}
