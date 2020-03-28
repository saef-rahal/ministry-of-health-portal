package com.supply.portal.ServiceImpl;

import com.supply.portal.Repository.StateRepository;
import com.supply.portal.Service.StateService;
import com.supply.portal.model.State;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by saef rahal on 3/27/2020.
 */
public class StateServiceImpl implements StateService {

    @Autowired
    StateRepository stateRepository;

    @Override
    public State findById(long id) {
        return stateRepository.findById(id);
    }
}
