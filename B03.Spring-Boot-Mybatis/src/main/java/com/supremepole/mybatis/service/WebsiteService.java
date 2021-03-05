package com.supremepole.mybatis.service;

import com.supremepole.mybatis.model.Website;

import java.util.List;

/**
 * @author supremepole
 */
public interface WebsiteService {

    /**
     * 通过id查询网站
     * @param id
     * @return
     */
    Website findById(Long id);

    /**
     * 查询所有网站
     * @return
     */
    List<Website> findAll();
}
