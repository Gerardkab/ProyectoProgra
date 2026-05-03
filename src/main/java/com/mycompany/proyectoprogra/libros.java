/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoprogra;

/**
 *
 * @author gerardo
 */
public class libros {
    public String titulo;
    public String autor;
    public String genero;
    public double precios;
    public int cantidad;
    
    public libros(){
        
    }
    
 public libros(String titulo, String autor, String genero, double precios, int cantidad){
     this.titulo = titulo;
     this.autor = autor;
     this.genero = genero;
     this.precios = precios;
     this.cantidad = cantidad;
 }  
    
}
