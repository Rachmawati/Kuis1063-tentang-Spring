/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Rachmawati.kuis1063.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
/**
 *
 * @author PC-320-09
 */
@Entity
@Table(name = "tbl_nilai_1063")
public class nilai_1063_entity implements Serializable{
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     private Long id_cv;
    
   
     @Column(length = 255, nullable = true)
    private String matakuliah;
      private String nama;
    private double nilai;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the id_cv
     */
    public Long getId_cv() {
        return id_cv;
    }

    /**
     * @param id_cv the id_cv to set
     */
    public void setId_cv(Long id_cv) {
        this.id_cv = id_cv;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the nilai
     */
    public double getNilai() {
        return nilai;
    }

    /**
     * @param nilai the nilai to set
     */
    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

    /**
     * @return the matakuliah
     */
    public String getMatakuliah() {
        return matakuliah;
    }

    /**
     * @param matakuliah the matakuliah to set
     */
    public void setMatakuliah(String matakuliah) {
        this.matakuliah = matakuliah;
    }
    
   
    
    
}
