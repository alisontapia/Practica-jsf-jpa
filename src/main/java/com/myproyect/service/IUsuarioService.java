/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.myproyect.service;

import com.myproyect.model.entity.Usuario;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author ALISON
 */
@Local
public interface IUsuarioService {
    Usuario guardar(Usuario usuario);
    Usuario editar(Usuario usuario);
    void eliminar(Usuario usuario);
    List<Usuario> listar();
}
