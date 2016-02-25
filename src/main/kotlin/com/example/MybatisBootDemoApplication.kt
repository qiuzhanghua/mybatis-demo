package com.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class MybatisBootDemoApplication {
}

fun main(args: Array<String>) {
  SpringApplication.run(MybatisBootDemoApplication::class.java, *args)
}
