package com.supremepole.mybatis.service.impl;

import com.supremepole.mybatis.mapper.WebsiteMapper;
import com.supremepole.mybatis.model.Website;
import com.supremepole.mybatis.service.WebsiteService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author supremepole
 */
public class WebsiteServiceImpl implements WebsiteService {

    @Autowired
    private WebsiteMapper websiteMapper;

    @Override
    public Website findById(Long id){
        return websiteMapper.selectById(id);
    }

    @Override
    public List<Website> findAll(){
        return websiteMapper.selectAll();
    }
}
