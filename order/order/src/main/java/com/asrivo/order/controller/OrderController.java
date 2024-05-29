/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asrivo.order.controller;

import com.asrivo.order.entity.Order;
import com.asrivo.order.service.OrderService;
import com.asrivo.order.vo.ResponseTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 *
 * @author asriv
 */
@RestController
@RequestMapping("api/v1/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Order> getAll() {
        return orderService.getAll();
    }

    @GetMapping(path = "{id}")
    public Order getOrderById(@PathVariable("id") Long id) {
        return orderService.getOrderById(id);
    }
    
    @GetMapping(path = "/produk/{id}")
    public List<ResponseTemplate> getOrderWithProdukById(@PathVariable("id") Long id) {
        return orderService.getOrderWithProdukById(id);
    }
    
    @PutMapping(path = "{id}")
    public void updateOrder(@PathVariable ("id") Long id,
            @RequestParam(required = false) int jumlah,
            @RequestParam(required = false) String tangggal,
            @RequestParam(required = false) String status
            
            
    ){
        orderService.update(id, jumlah, tangggal, status);
    }
            
}