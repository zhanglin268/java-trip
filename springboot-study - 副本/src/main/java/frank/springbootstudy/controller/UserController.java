package frank.springbootstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: 张林
 * @Date :Created in 12:02 am 14/08/2020
 */
@Controller
@RequestMapping("/user")
public class UserController {
   @RequestMapping("/login")
    @ResponseBody
    public Object loin() {
       Map<String,String> map = new HashMap<>();
       map.put("一号","hh");
       map.put("11","22");
       map.put("22","33");
       return map;
   }



}
