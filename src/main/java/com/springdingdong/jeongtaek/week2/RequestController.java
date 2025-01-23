package com.springdingdong.jeongtaek.week2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("request")
@RequiredArgsConstructor
public class RequestController {

    @PersistenceContext
    private final EntityManager entityManager;

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @PostMapping("/member")
    @Transactional
    public Long testPost(@RequestBody final Member member) {
        System.out.println("member:" + member);
        entityManager.persist(member);
        return member.getId();
    }
}
