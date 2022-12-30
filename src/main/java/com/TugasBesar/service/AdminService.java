/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.TugasBesar.service;

import com.TugasBesar.pojo.Admin;
import com.TugasBesar.pojo.Barang;
import com.TugasBesar.repository.AkunRepository;
import com.TugasBesar.repository.CrudRepository;

/**
 *
 * @author Kurnia R. Putra
 */
public interface AdminService extends AkunRepository<Admin, Integer> , CrudRepository<Admin, Integer>{
    
}
