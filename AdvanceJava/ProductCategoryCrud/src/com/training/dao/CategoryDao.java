package com.training.dao;

import java.util.List;

import com.training.beans.Category;
import com.training.beans.Product;

public interface CategoryDao {
	List<Category> getAllCategory();

	List<Product> getAllProductByCategory(int cid);

}
