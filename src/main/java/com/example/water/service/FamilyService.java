package com.example.water.service;

import com.example.water.dao.FamilyDao;
import com.example.water.model.Family;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by  waiter on 18-6-18.
 *
 * @author waiter
 */
@Service
public class FamilyService {
    @Autowired
    FamilyDao familyDao;

    /**
     *
     * @param id
     * @return
     */
    public Family findById(int id){
        return familyDao.findById(id);
    }
}
