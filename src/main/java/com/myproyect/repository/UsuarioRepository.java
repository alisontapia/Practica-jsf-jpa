/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproyect.repository;

import com.myproyect.repository.persistence.CrudRepository;
import com.myproyect.model.entity.Usuario;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;

/**
 *
 * @author ALISON
 */
@Stateless
public class UsuarioRepository extends CrudRepository<Usuario>{

    public UsuarioRepository() {
        super(Usuario.class);
    }
    @Override
    protected EntityManager getEntityManager() {
       return em;
    }
}
