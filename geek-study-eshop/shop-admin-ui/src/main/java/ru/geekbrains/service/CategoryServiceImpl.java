package ru.geekbrains.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.geekbrains.controller.data.CategoryData;
import ru.geekbrains.persist.model.Categtory;
import ru.geekbrains.persist.repo.CategoryRepository;

import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void save(CategoryData categoryData) {
        Categtory categtory = new Categtory();
        categtory.setId(categoryData.getId());
        categtory.setCode(categoryData.getCode());
        categtory.setName(categoryData.getName());
        categtory.setProductList(categoryData.getProductList());
        categoryRepository.save(categtory);
    }

    @Override
    public List<Categtory> findAll() {
        return categoryRepository.findAll();
    }
}
