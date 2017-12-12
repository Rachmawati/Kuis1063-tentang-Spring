/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Rachmawati.kuis1063.entity;


import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 *
 * @author PC-320-09
 */
@Entity
@Table(name = "tbl_cv_1063")
public class cv_1063_entity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cv;
    @Column(length = 255, nullable = false)
    private String nama;
 
    private String tanggal_lahir;

    private String alamat;

    @OneToMany
    @JoinColumn(name="id_cv")
    private Set<nilai_1063_entity> nilai_1063_entity;

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
     * @return the tanggal_lahir
     */
    public String getTanggal_lahir() {
        return tanggal_lahir;
    }

    /**
     * @param tanggal_lahir the tanggal_lahir to set
     */
    public void setTanggal_lahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the nilai_1063_entity
     */
    public Set<nilai_1063_entity> getNilai_1063_entity() {
        return nilai_1063_entity;
    }

    /**
     * @param nilai_1063_entity the nilai_1063_entity to set
     */
    public void setNilai_1063_entity(Set<nilai_1063_entity> nilai_1063_entity) {
        this.nilai_1063_entity = nilai_1063_entity;
    }

    
    
   
}
