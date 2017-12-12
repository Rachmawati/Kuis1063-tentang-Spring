/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Rachmawati.kuis1063.service;

import com.Rachmawati.kuis1063.entity.cv_1063_entity;
import com.Rachmawati.kuis1063.repo.cv_1063_repo;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author PC-320-09
 */
@Service("cv_1063_service")
@Transactional
public class cv_1063_service {

    @Autowired
    private cv_1063_repo repo;
    public cv_1063_entity insert(cv_1063_entity cv_1063) {
        return repo.save(cv_1063);
    }

    public cv_1063_entity update(cv_1063_entity cv_1063) {
       return repo.save(cv_1063);
    }

    public cv_1063_entity getById(Long id_cv) {
        return repo.findOne(id_cv);
    }

    public List<cv_1063_entity> getAll() {
          return repo.findAllCategory();
    }

    public boolean delete(Long id_cv) {
          repo.delete(id_cv);
        return true;
    }
    
}
