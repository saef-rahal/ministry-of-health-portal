package com.supply.portal.ServiceImpl;

import com.supply.portal.Repository.HospitalRepository;
import com.supply.portal.Service.HospitalService;
import com.supply.portal.model.Hospital;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by saef rahal on 3/27/2020.
 */
public class HospitalServiceImpl implements HospitalService {

    @Autowired
    HospitalRepository hospitalRepository;

    @Override
    public List<Hospital> findByState(long id) {
        return hospitalRepository.findByState(id);
    }

    @Override
    public Hospital findById(long id) {
        return hospitalRepository.findById(id);
    }
}
