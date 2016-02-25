package com.example.mapper

import com.example.domain.City
import org.mybatis.spring.SqlSessionTemplate
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

/**
 * Created by qiuzhanghua on 16/2/24.
 */
@Component
class CityMapper {

  @Autowired
  private val sqlSessionTemplate: SqlSessionTemplate? = null

  fun selectCityById(id: Long): City {
    return this.sqlSessionTemplate!!.selectOne<City>("selectCityById", id)
  }

}