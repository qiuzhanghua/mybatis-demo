package com.example.web;

import com.example.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by qiuzhanghua on 16/2/24.
 */
@Controller
@RequestMapping(value="/")
public class HomeController {

  @Autowired
  private CityMapper cityMapper;

  @RequestMapping(value="")
  String index() {
    System.out.println("+++++++++++++++++++++++++++++++++");
    System.out.println(this.cityMapper.selectCityById(1));
    System.out.println("+++++++++++++++++++++++++++++++++");
    return "index";
  }

}
