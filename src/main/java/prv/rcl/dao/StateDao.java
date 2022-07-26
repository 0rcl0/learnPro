package prv.rcl.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import prv.rcl.entity.State;

import java.util.List;

@Mapper
public interface StateDao {

    List<State> queryByCountryId(@Param("country_id")long countryId);

    State selectById(@Param("state_id")long stateId);

}
