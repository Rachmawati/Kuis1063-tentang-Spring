/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Rachmawati.kuis1063.repo;

import com.Rachmawati.kuis1063.entity.cv_1063_entity;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author PC-320-09
 */
public interface cv_1063_repo  extends CrudRepository<cv_1063_entity, Long> 
{
 @Query("select c from cv_1063_entity c")
    public List<cv_1063_entity> findAllCategory();
    
}
