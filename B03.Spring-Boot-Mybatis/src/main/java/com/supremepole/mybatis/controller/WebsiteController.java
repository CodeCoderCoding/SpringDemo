package com.supremepole.mybatis.controller;

import com.supremepole.mybatis.model.Website;
import com.supremepole.mybatis.service.WebsiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author supremepole
 */
@RestController
public class WebsiteController {
   @Autowired
   private WebsiteService websiteService;

    @RequestMapping("users/{id}")
    Website user(@PathVariable("id") Long id){
        return websiteService.findById(id);
    }

    @RequestMapping("users")
    List<Website> users(){
        return websiteService.findAll();
    }
}
