package com.supply.portal.Repository;

import com.supply.portal.model.Hospital;
import com.supply.portal.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by saef rahal on 3/26/2020.
 */
public interface HospitalRepository extends JpaRepository<Hospital, Long> {

    @Query( value = "select * from hospitas where state_id = ?1", nativeQuery = true)
    List<Hospital> findByState(long id);

    @Query( value = "select * from hospitals where id = ?1", nativeQuery = true)
    Hospital findById(long id);
}
