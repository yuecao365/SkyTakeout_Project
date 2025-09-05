package com.sky.service;

import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import com.sky.dto.CategoryDTO;
import com.sky.result.PageResult;

import java.util.List;

public interface CategoryService {
    /**
     * 新增分类
     * @param categoryDTO
     * @return
     */
    void save(CategoryDTO categoryDTO);

    /**
     * 分类分页查询
     * @param categoryPageQueryDTO
     * @return
     */
    PageResult page(CategoryPageQueryDTO categoryPageQueryDTO);

    /**
     * 启用禁用分类
     * @param status
     * @param id
     */
    void startOrStop(Integer status, Long id);

    /**
     * 编辑分类
     * @param categoryDTO
     * @return
     */
    void update(CategoryDTO categoryDTO);

    /**
     * 删除分类
     * @param id
     */
    void delete(Long id);


    /**
     * 根据类型查询分类
     * @param type
     */
    List<Category> list(Integer type);
}
