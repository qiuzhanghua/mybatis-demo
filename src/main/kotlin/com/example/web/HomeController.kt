package com.example.web

import com.example.mapper.CityMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by qiuzhanghua on 16/2/24.
 */
@Controller
@RequestMapping(value = "/")
class HomeController {

  @Autowired
  private val cityMapper: CityMapper? = null

  @RequestMapping(value = "")
  internal fun index(): String {
    println("+++++++++++++++++++++++++++++++++")
    println(this.cityMapper!!.selectCityById(1))
    println("+++++++++++++++++++++++++++++++++")
    return "index"
  }

}
