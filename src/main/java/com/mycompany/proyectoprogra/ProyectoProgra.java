/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoprogra;

import java.util.ArrayList;

/**
 *
 * @author gerardo
 */
public class ProyectoProgra {

    public static ArrayList<cupones>cupones = new ArrayList<>();
    public static ArrayList<usuarios> usuarios = new ArrayList<>();
    public static ArrayList<libros> libros = new ArrayList<>();
    public static ArrayList<Vent> vent = new ArrayList<>();
    public static ArrayList<articulos> art = new ArrayList<>();
    public static ArrayList<cambioexa> dire = new ArrayList<>();

    public static void main(String[] args) {
        
        usuarios u = new usuarios();
        u.nombre = "admin";
        u.usuario = "admin";
        u.contra = "";
        u.rol = 1;
        
        
        usuarios.add(u);
        
        usuarios v = new usuarios();
        v.nombre= "Gerardo Cabrera";
        v.usuario="vendedor";
        v.contra ="";
        v.rol= 2;
        
        usuarios.add(v);
                

        login lo = new login();
        lo.setVisible(true);
    }
}
