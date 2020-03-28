package com.supply.portal.Repository;

import com.supply.portal.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by saef rahal on 3/26/2020.
 *
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Query(value = "select * from categories where id = ?1", nativeQuery = true)
    Category findById(long id);

}
