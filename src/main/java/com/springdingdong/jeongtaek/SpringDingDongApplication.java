package com.springdingdong.jeongtaek;

import com.springdingdong.jeongtaek.assignment1.Developer;
import com.springdingdong.jeongtaek.assignment1.DeveloperJava;
import com.springdingdong.jeongtaek.assignment1.DeveloperPython;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDingDongApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDingDongApplication.class, args);
        // 자바 개발자
        Developer javaDeveloper = new DeveloperJava(60000000);
        // 파이썬 개발자
        Developer pythonDeveloper = new DeveloperPython(50000000);

        System.out.println("Before");
        System.out.println("자바 개발자 연봉 = " + javaDeveloper.getSalary());
        System.out.println("파이썬 개발자 연봉 = " + pythonDeveloper.getSalary());
        System.out.println();

        javaDeveloper.develop();
        pythonDeveloper.develop();
        System.out.println();

        long newSalary = Developer.raiseSalary(javaDeveloper.getSalary(), 20);
        javaDeveloper.setSalary(newSalary);

        newSalary = Developer.raiseSalary(pythonDeveloper.getSalary(), 40);
        pythonDeveloper.setSalary(newSalary);

        System.out.println("After");
        System.out.println("자바 개발자 연봉 = " + javaDeveloper.getSalary());
        System.out.println("파이썬 개발자 연봉 = " + pythonDeveloper.getSalary());
        System.out.println();

        javaDeveloper.develop();
        pythonDeveloper.develop();
    }

}
