/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproyect.service.impl;

import com.myproyect.repository.UsuarioRepository;
import com.myproyect.service.IUsuarioService;
import com.myproyect.model.entity.Usuario;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;
import java.util.List;

/**
 *
 * @author ALISON
 */
@Stateless
public class UsuarioServiceImpl implements IUsuarioService{
    
    @EJB
    private UsuarioRepository usuarioRepository;
    
    @Override
    public Usuario guardar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario editar(Usuario usuario) {
        return usuarioRepository.update(usuario);
    }

    @Override
    public void eliminar(Usuario usuario) {
        usuarioRepository.delete(usuario);
    }

    @Override
    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }
    
}
