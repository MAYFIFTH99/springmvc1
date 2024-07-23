package hello.servlet.web.frontcontroller.v3.controller;
import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import hello.servlet.web.frontcontroller.ModelView;
import hello.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberSaveControllerV3 implements ControllerV3 {

 private MemberRepository memberRepository = MemberRepository.getInstance();


 @Override
 public ModelView process(Map<String, String> paramMap) {

  String username = paramMap.get("username");
  int age = Integer.parseInt(paramMap.get("age"));

  Member member = new Member(username, age);
  memberRepository.save(member);
  //여기까지 Repository의 로직 완료


// viewName을 생성자에 넣어주고, mv에 Model을 추가
  ModelView mv = new ModelView("save-result");
  mv.getModel().put("member", member);
  return mv;
  }
}