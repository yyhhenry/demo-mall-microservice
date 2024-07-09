package cn.d619.category.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.d619.category.mapper.CategoryMapper;
import cn.d619.category.pojo.dto.CategoryDTO;

@Service
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    public List<CategoryDTO> getAllCategories() {
        var categories = new ArrayList<CategoryDTO>();
        for (var category : categoryMapper.selectList(null)) {
            var categoryDTO = new CategoryDTO();
            BeanUtils.copyProperties(category, categoryDTO);
            categories.add(categoryDTO);
        }
        return categories;
    }
}
