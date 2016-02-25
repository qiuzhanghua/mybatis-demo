package com.example.domain

import java.io.Serializable

/**
 * Created by qiuzhanghua on 16/2/24.
 */
class City() : Serializable {

  var id: Long? = null

  var name: String? = null

  var state: String? = null

  var country: String? = null

  override fun toString(): String {
    return "City{" +
        "id=" + this.id +
        ", name='" + this.name + '\'' +
        ", state='" + this.state + '\'' +
        ", country='" + this.country + '\'' +
        '}'
  }
}

