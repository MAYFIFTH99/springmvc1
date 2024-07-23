package hello.servlet.web.frontcontroller.v4;
import java.util.Map;
public interface ControllerV4 {
 /**
 * @param paramMap
 * @param model
 * @return viewName
 */
 String process(Map<String, String> paramMap, Map<String, Object> model);


 /**
  * V3에서 ModelView를 항상 반환해야 하는 것이 불편했다.
  * viewName만 반환하도록 개선해보자.
  * viewName만 반환하는 거랑, ModelView를 반환하는 것 차이가 큰가 .. ?
  */
}