/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.asrivo.pembayaran.repository;

import com.asrivo.pembayaran.entity.Pembayaran;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author asriv
 */
public interface PembayaranRepository extends JpaRepository<Pembayaran, Long> {
}
