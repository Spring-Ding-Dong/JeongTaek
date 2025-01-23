package com.springdingdong.jeongtaek.assignment2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeveloperService {

    private final DeveloperRepository developerRepository;

    @Autowired
    public DeveloperService(DeveloperRepository developerRepository) {
        this.developerRepository = developerRepository;
    }

    public String registerDeveloper(String name, String part, int age) {

        Developer developer = Developer
                .builder()
                .name(name)
                .part(part)
                .age(age)
                .build();

        developerRepository.save(developer);

        return part + " " + name + " 개발자가 등록되었습니다.";
    }

    public String deleteDeveloper(String name, String part) {
        Developer developer = developerRepository.findByNameAndPart(name, part);

        developerRepository.delete(developer);

        return developer.getName() + "개발자가 퇴사하였습니다.";
    }

    public String changePart(String name, String part, String newPart) {
        Developer developer = developerRepository.findByNameAndPart(name, part);
        developer.setPart(newPart);

        developerRepository.save(developer);

        return name + "개발자의 파트가 " + newPart + "로 변경되었습니다.";
    }

    public Developer getDeveloper(String name, String part) {
        return developerRepository.findByNameAndPart(name, part);
    }
}
