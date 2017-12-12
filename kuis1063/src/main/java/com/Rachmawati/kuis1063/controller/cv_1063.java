/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Rachmawati.kuis1063.controller;


import com.Rachmawati.kuis1063.entity.cv_1063_entity;
import com.Rachmawati.kuis1063.service.cv_1063_service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
        
@RestController
@RequestMapping("/cv_1063_entity")
public class cv_1063 {
    
   @Autowired 
    private cv_1063_service cv_1063_service;
   
    @RequestMapping(method = RequestMethod.POST)
    public cv_1063_entity insert(@RequestBody cv_1063_entity cv_1063) {
        return cv_1063_service.insert(cv_1063);
    }
     @RequestMapping(method = RequestMethod.PUT)
    public cv_1063_entity update(@RequestBody cv_1063_entity cv_1063) {
        return cv_1063_service.update(cv_1063);
    }
      @RequestMapping(method = RequestMethod.DELETE, value = "/{id_cv}")
    public boolean delete(@PathVariable("id_cv") Long id_cv) {
        return cv_1063_service.delete(id_cv);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id_cv}")
    public cv_1063_entity getById(@PathVariable("id_cv") Long id_cv){
        return cv_1063_service.getById(id_cv);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<cv_1063_entity> getAll(){
        return cv_1063_service.getAll();
    }
    
    
}
