package hello.hello_spring.controller;

import hello.hello_spring.repository.MemberRepository;
import hello.hello_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {


    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
