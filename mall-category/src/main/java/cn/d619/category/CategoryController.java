package cn.d619.category;

import org.springframework.web.bind.annotation.RestController;

import cn.d619.category.pojo.po.CategoryPO;
import cn.d619.category.service.CategoryService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/api/category/all")
    public List<CategoryPO> getAllCategories() {
        return categoryService.getAllCategories();
    }

}
