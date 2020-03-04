package com.yh.service;

import java.util.List;

import com.yh.pojo.Brand;
import com.yh.pojo.Category;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @author yh
 *  
 *  **** Dubbo 服务接口函数比要有非Void 的返回值********
 *  
 */
public interface GoodsService {
	
	int addBrand(Brand brand);
	int updateBrand(Brand brand);
	int deleteBrand(Integer id);
	/**
	 * 
	 * @param firstChar 首字母
	 * @param page 页码
	 * @return
	 */
	PageInfo<Brand> listBrand( String firstChar,int page); 
	
	
	int addCategory(Category category);
	int updateCategory(Category category);
	int deleteCategory(Integer id);
	/**
	 * 
	 * @param firstChar 首字母
	 * @param page 页码
	 * @return
	 */
	PageInfo<Category> listCategory( String firstChar,int page); 
	/**
	 * 以树的形式显示列表
	 * @return
	 */
	List<Category> treeCategory(); 
	
	

}
