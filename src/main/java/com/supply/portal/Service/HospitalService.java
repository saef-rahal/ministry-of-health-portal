package com.supply.portal.Service;

import com.supply.portal.model.Hospital;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by saef rahal on 3/27/2020.
 */
public interface HospitalService {

    public List<Hospital> findByState(long id);

    public Hospital findById(long id);
}
