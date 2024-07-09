package cn.d619.category.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import cn.d619.category.pojo.po.CategoryPO;

@Mapper
public interface CategoryMapper extends BaseMapper<CategoryPO> {
}
