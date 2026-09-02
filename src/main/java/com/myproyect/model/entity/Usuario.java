/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproyect.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author ALISON
 */
@Entity
@Table(name="usuario")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "nick_name")
    private String nickName;

    public Usuario() {
    }

    public Usuario(Integer idUsuario, String nombre, String nickName) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.nickName = nickName;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.nickName, other.nickName)) {
            return false;
        }
        return Objects.equals(this.idUsuario, other.idUsuario);
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nombre=" + nombre + ", nickName=" + nickName + '}';
    }

}
