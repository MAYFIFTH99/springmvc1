package hello.servlet.web.frontcontroller.v3;

import hello.servlet.web.frontcontroller.ModelView;
import hello.servlet.web.frontcontroller.MyView;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Map;

public interface ControllerV3 {
    ModelView process(Map<String, String> paramMap);
    // process 는 service 메서드와 동일


    /**
     * 다 좋은데, 항상 ModelView를 만들어서 반환해야 하는 것이 개발자 입장에서 조금 불편하다.
     * -> 일단 이게 왜 불편한지 공감해보자..
     *
     */

}
