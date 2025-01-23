package com.springdingdong.jeongtaek.week2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(method = RequestMethod.GET, value = "study")
public class HelloController {

    @GetMapping("hello")
    public String hell() {
        return "Hello World";
    }

    @GetMapping("name/{name}")
    public String getName(@PathVariable(value = "name") final String name) {
        return name;
    }

    @PostMapping("/pda")
    public String getPart(
            @RequestParam(value = "part", defaultValue = "") final String part,
            @RequestParam(value = "age", defaultValue = "") final String age
    ) {
        return "파트는 " + part + "!! 나이는 " + age + "입니다.";
    }

}
