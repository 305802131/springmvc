package org.spring.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.City;

/**
 * 城市 DAO 接口类
 *
 */
public interface CityDao {
	
	City findById(@Param("id") Long id);

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
    City findByName(@Param("cityName") String cityName);
    
    List<City> findAllCity();
    Long saveCity(City city);

    Long updateCity(City city);

    Long deleteCity(Long id);
    
    //aaaa
   //v1.0
    //v2.0
    //R_v1.0.1
    //R_v1.0.2
}
