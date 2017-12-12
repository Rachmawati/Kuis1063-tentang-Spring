/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Rachmawati.kuis1063.controller;
import com.Rachmawati.kuis1063.entity.nilai_1063_entity;
import com.Rachmawati.kuis1063.repo.nilai_1063_repo;
import com.Rachmawati.kuis1063.service.nilai_1063_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author PC-320-09
 */
@RestController
@RequestMapping("/nilai_1063_entity")
public class nilai_1063 {
    
     @Autowired
    private nilai_1063_service nilai_1063_service;
    
    @RequestMapping(method = RequestMethod.POST)
    public nilai_1063_entity insertOrUpdate(@RequestBody nilai_1063_entity nilai_1063){
        return nilai_1063_service.insertOrUpdate(nilai_1063);
    }
}
