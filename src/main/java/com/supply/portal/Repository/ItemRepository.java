package com.supply.portal.Repository;

import com.supply.portal.model.Category;
import com.supply.portal.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by saef rahal on 3/26/2020.
 */

public interface ItemRepository extends JpaRepository<Item, Long> {
    @Query(value = "select * from items where category_id = ?1", nativeQuery = true)
    List<Item> findByCategory(long id);

    @Query(value = "select * from items where id = ?1", nativeQuery = true)
    Item findById(long id);
}
