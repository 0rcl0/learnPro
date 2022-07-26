package prv.rcl.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import prv.rcl.entity.Region;

import java.util.List;

@Mapper
public interface RegionDao {

    List<Region> queryByStateId(@Param("state_id")long stateId);

    Region queryByCode(@Param("code_full")String fullCode);
}
