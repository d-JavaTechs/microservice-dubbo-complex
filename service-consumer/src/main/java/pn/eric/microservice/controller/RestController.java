package pn.eric.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pn.eric.microservice.api.CustomerService;

/**
 * Created by lenovo on 2015/5/11.
 */
@Controller
public class RestController {

    @Autowired
    private CustomerService helloService ;

    @ResponseBody
    @RequestMapping("/say")
    public String index(){
        return helloService.getAll() ;
    }
}
