package com.springdingdong.jeongtaek.assignment2;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("developer")
@RequiredArgsConstructor
public class DeveloperController {

    private final DeveloperService developerService;

    // 개발자 등록
    @PostMapping("")
    public String registerDeveloper(@RequestBody DeveloperReqDTO reqDto) {
        return developerService.registerDeveloper(reqDto.getName(), reqDto.getPart(), reqDto.getAge());
    }

    // 개발자 퇴사
    @DeleteMapping("/{name}/{part}")
    public String deleteDeveloper(@PathVariable (value = "name") String name,
                                  @PathVariable (value = "part") String part) {
        return developerService.deleteDeveloper(name, part);
    }

    // 개발자 파트 변경
    @PutMapping("")
    public String changePart(@RequestBody DeveloperUpdateDTO updateDTO) {
        return developerService.changePart(updateDTO.getName(), updateDTO.getPart(), updateDTO.getNewPart());
    }

    // 개발자 조회
    @GetMapping("/{name}/{part}")
    public Developer getDeveloper(@PathVariable (value = "name") String name,
                               @PathVariable (value = "part") String part) {
        return developerService.getDeveloper(name, part);
    }
}
