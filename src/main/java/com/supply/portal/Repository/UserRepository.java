package com.supply.portal.Repository;

import com.supply.portal.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by saef rahal on 3/26/2020.
 */
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
