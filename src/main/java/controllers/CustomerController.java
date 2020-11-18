package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

    @RequestMapping("/conditional-operator-example")
    public String operatorExample() {
        return "conditional-operator-example";
    }
}
