package com.xunqi.gulimall.product.dao;

import com.xunqi.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author 夏沫止水
 * @email john720912@163.com
 * @date 2023-08-07 15:22:24
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
