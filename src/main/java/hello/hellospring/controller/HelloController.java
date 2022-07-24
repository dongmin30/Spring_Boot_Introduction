package hello.hellospring.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * packageName    : hello.hellospring.controller
 * fileName       : HelloController
 * author         : dongm
 * date           : 2022-07-24
 * description    : 김영한 강사님의 스프링 강의 Controller
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-07-24        dongm       최초 생성
 */
@Controller
public class HelloController {
    //-- model을 통한 템플릿 엔진 동적 소스 호출
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        return "hello";
    }

    //-- required는 기본이 true 값을 가지고 있어 필수 값 체크를 한다.
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(name = "name", required = false) String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    //-- 템플릿 엔진을 통해 반환하는것이 아닌 문자 그대로를 반환한다.
    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name; //"hello spring"
    }

    //-- JSON 값으로 '객체'를 반환한다. (default = JSON)
    //-- 객체 = JsonConverter
    //-- 문자열 = StringConverter
    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    //-- 자바 빈 표준방식 Getter, Setter
    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
