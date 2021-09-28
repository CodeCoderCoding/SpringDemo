package com.supremepole.springbootsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CodeCoderCoding
 */
@RestController
public class Controller {
    @GetMapping("/security")
    public String security(){
        return "Spring Security";
    }
}
