package com.springdingdong.jeongtaek.week2;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @PostMapping("member")
    public String postMember(@RequestBody final Member member) {
        return member.getName();
    }

    @PostMapping("test")
    public String postTest(@RequestBody final Member member) {
        return member.getName();
    }
}
