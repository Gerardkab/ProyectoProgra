/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoprogra;

import java.io.Serializable;

/**
 *
 * @author gerardo
 */
public class usuarios implements Serializable{
    
    public  String usuario;
    public  String nombre;
    public  String contra;
    public int rol;
    
 public usuarios(){}

public usuarios(String usuario, String nombre, String contra, int rol ){
    this.usuario= usuario;
    this.nombre=nombre;
    this.contra=contra;
    this.rol=rol;
  }
}


