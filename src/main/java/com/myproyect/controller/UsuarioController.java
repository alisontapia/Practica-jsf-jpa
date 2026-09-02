/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproyect.controller;

import com.myproyect.service.IUsuarioService;
import com.myproyect.model.entity.Usuario;
import jakarta.ejb.EJB;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import org.primefaces.PrimeFaces;

/**
 *
 * @author ALISON
 */

@Named(value="usuarioMB")
@ViewScoped
public class UsuarioController implements Serializable{
    
    @EJB
    private IUsuarioService usuarioService;
    private Usuario usuario;
    
    public void nuevo(){
        usuario = new Usuario();
    }
    public void guardar(){
        if (usuario.getIdUsuario() == null){
            usuarioService.guardar(usuario);
            FacesContext.getCurrentInstance().addMessage("null", new FacesMessage("Usuario agregado"));
        }else{
            usuarioService.editar(usuario);
            FacesContext.getCurrentInstance().addMessage("null", new FacesMessage("Usuario editado"));
        }
        nuevo();
        PrimeFaces.current().executeScript("PF('dlgUsuarioRegistro').hide()");
        PrimeFaces.current().ajax().update("form: messages");
    }

    public IUsuarioService getUsuarioService() {
        return usuarioService;
    }

    public void setUsuarioService(IUsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }    
}
