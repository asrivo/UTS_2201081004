/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asrivo.produk.service;

import com.asrivo.produk.Repository.ProdukRepository;
import com.asrivo.produk.entity.Produk;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author asriv
 */
@Service
public class ProdukService {
    @Autowired
    
    private ProdukRepository ProdukRepository;
    
    public List<Produk> getAll(){
        return ProdukRepository.findAll();
    }
    
    public Produk getProduk(Long id) {
        return ProdukRepository.findById(id).get();
    }
    
    public void insert(Produk produk){
        ProdukRepository.save(produk);
    }
    
    public void delete(Produk produk){
        ProdukRepository.save(produk);
    }
    
    
}