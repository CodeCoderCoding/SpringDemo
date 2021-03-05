package com.supremepole.mybatis.mapper;

import com.supremepole.mybatis.model.Website;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author supremepole
 */
@Mapper
public interface WebsiteMapper {

    /**
     * 查询全部数据
     * @return
     */
    List<Website> selectAll();

    /**
     * 通过id查询网站信息
     * @param id
     * @return
     */
    Website selectById(Long id);
}
