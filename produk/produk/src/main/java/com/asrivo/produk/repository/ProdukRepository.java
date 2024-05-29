/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.asrivo.produk.Repository;

import com.asrivo.produk.entity.Produk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author asriv
 */
@Repository
public interface ProdukRepository extends JpaRepository<Produk, Long> {
    
    
}