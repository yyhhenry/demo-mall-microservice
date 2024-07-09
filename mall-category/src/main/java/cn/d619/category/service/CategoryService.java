package cn.d619.category.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.d619.category.mapper.CategoryMapper;
import cn.d619.category.pojo.po.CategoryPO;

@Service
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    public List<CategoryPO> getAllCategories() {
        return categoryMapper.selectList(null);
    }
}
