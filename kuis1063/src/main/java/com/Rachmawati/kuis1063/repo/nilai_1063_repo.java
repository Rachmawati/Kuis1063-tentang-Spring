/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Rachmawati.kuis1063.repo;

import com.Rachmawati.kuis1063.entity.nilai_1063_entity;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author PC-320-09
 */
public interface nilai_1063_repo extends CrudRepository<nilai_1063_entity, Long> {
    
    @Query("select p from nilai_1063_entity p")
    public List<nilai_1063_entity> findAllProduct();
    
   // @Query("select p from nilai_1063_entity p where p.cv_1063_entity.id= :id")
   // public List<nilai_1063_entity> findByCategory(@Param("id") Long id);
    
   // @Query("select p from nilai_1063_entity p where LOWER(p.name) LIKE LOWER(:name)")
   // public List<nilai_1063_entity> findByName(@Param("name") String name);

    

     
}
