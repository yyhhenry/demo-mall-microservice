package cn.d619.category.pojo.po;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("category")
public class CategoryPO {
    private Long id;
    private String name;
}
