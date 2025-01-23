package com.springdingdong.jeongtaek.assignment1;
public interface Developer {
    // 상수 -> 연봉
    long MAX_SALARY = 2000000000;

    // 추상 메서드 ->
    void develop();
    void rest();
    long getSalary();
    void setSalary(long salary);

    // 디폴트 메서드 -> 퇴사
    default void quit() {
        System.out.println("참지 못하고 퇴사해버렸습니다.");
    }

    // 정적 메서드 -> 연봉인상
    static long raiseSalary(long salary, int percent) {
        float value = 1 + (percent / 100.0f);
        return Math.round(salary * value);
    }
}
