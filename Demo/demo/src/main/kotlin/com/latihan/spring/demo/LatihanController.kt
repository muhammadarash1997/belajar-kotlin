package com.latihan.spring.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

import com.latihan.spring.demo.no.User

@RestController
class LatihanController {

    @GetMapping("/hello")
    fun haloSpring(): String{
        return "Ini adalah sample"
    }

    @GetMapping("/User")
    fun haloUser(@RequestParam("nama")nama: String): User{
        return User(
                123,
                nama,
                "arash@gmail.com"
        )
    }
}