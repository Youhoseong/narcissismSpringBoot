package hello.servlet.web.frontcontroller.v4.controller;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import hello.servlet.web.frontcontroller.v4.ControllerV4;

import java.util.List;
import java.util.Map;

public class MemberListControllerV4 implements ControllerV4 {


    MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    // map은 메모리 공유를 하나봐.
    public String process(Map<String, String> paraMap, Map<String, Object> model) {
        List<Member> memberList = memberRepository.findAll();
        model.put("members", memberList);
        return "members";
    }
}
