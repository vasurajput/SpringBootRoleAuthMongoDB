/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vasu.DataBankSecurityMONGO.Repositry;

import com.vasu.DataBankSecurityMONGO.Model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rv
 */
@Repository
public interface RoleRepositry extends MongoRepository<Role, String>{
    
    Role findByRole(String role);
}
