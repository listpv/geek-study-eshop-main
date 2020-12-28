package ru.geekbrains.service;

import ru.geekbrains.controller.data.CategoryData;
import ru.geekbrains.controller.data.UserData;
import ru.geekbrains.persist.model.Categtory;

import java.util.List;

public interface CategoryService {

    void save(CategoryData categoryData);


    public List<Categtory> findAll();
}
