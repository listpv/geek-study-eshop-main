package ru.geekbrains.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.geekbrains.persist.model.Categtory;

public interface CategoryRepository extends JpaRepository<Categtory, Long> {
}
