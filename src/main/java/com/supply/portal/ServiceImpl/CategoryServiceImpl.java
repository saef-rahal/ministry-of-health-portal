package com.supply.portal.ServiceImpl;

import com.supply.portal.Repository.CategoryRepository;
import com.supply.portal.Service.CategoryService;
import com.supply.portal.model.Category;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by saef rahal on 3/27/2020.
 */
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Category findById(long id) {
        return categoryRepository.findById(id);
    }
}
