/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Rachmawati.kuis1063.service;


import com.Rachmawati.kuis1063.entity.nilai_1063_entity;
import com.Rachmawati.kuis1063.repo.nilai_1063_repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author PC-320-09
 */
@Service("nilai_1063_service")
@Transactional
public class nilai_1063_service {
    
     @Autowired
    private nilai_1063_repo repo;

    public nilai_1063_entity insertOrUpdate(nilai_1063_entity nilai_1063) {
       return repo.save(nilai_1063);
    }
    public boolean delete(Long id) {
        repo.delete(id);
        return true;
    }

    public List<nilai_1063_entity> findAll() {
        return repo.findAllProduct();
    }

    ///public List<nilai_1063_entity> findBynilai_1063_entity(Long cv_1063_entityId) {
       // return repo.findByCategory(cv_1063_entityId);
  //  }

  //  public List<nilai_1063_entity> findByNama(String nama) {
      //  return repo.findByName("%" + nama + "%");
   // }

  

  
}
