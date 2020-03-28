package com.supply.portal.Repository;

import com.supply.portal.model.Category;
import com.supply.portal.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by saef rahal on 3/26/2020.
 */
public interface StateRepository extends JpaRepository<State, Long> {

    @Query( value = "select * from items where id = ?1", nativeQuery = true)
    State findById(long id);

}
