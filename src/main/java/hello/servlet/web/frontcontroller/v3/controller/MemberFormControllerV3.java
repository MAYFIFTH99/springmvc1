package hello.servlet.web.frontcontroller.v3.controller;
import hello.servlet.web.frontcontroller.ModelView;
import hello.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberFormControllerV3 implements ControllerV3 {

 @Override
 public ModelView process(Map<String, String> paramMap) {
    return new ModelView("new-form");
  }
    /**
     * 프론트 컨트롤러가 구체적인 컨트롤러의 process 메서드를 호출
     * 이때, 매개변수로 request에 들어있는 파라미터들을 map에 담아서 전달
     * 회원 등록 폼은 페이지만 띄워주면 되기 때문에 바로 템플릿의 논리 주소 반환
     */
}