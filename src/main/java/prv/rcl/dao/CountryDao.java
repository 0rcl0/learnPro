package prv.rcl.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import prv.rcl.entity.Countries;

@Mapper
public interface CountryDao {

    Countries queryByCode(@Param("code") String code);

}
