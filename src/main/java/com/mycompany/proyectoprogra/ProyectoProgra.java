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

    public static ArrayList<usuarios> usuarios = new ArrayList<>();
    public static ArrayList<libros> libros = new ArrayList<>();
    public static ArrayList<Vent> vent = new ArrayList<>();
    public static ArrayList<articulos> art = new ArrayList<>();
    public static ArrayList<articulos> artvendidos = new ArrayList<>();
    public static ArrayList<cambioexa> dire = new ArrayList<>();
    public static ArrayList<cupones> cupon = new ArrayList<>();

    public static void main(String[] args) {

        cupon();
        libros();

        usuarios u = new usuarios();
        u.nombre = "admin";
        u.usuario = "admin";
        u.contra = "";
        u.rol = 1;

        usuarios.add(u);

        usuarios v = new usuarios();
        v.nombre = "Gerardo Cabrera";
        v.usuario = "vendedor";
        v.contra = "";
        v.rol = 2;

        usuarios.add(v);

        login lo = new login();
        lo.setVisible(true);
    }

    private static void libros() {

        libros libro1 = new libros();
        libro1.titulo = "El Principito";
        libro1.autor = "Antoine de Saint-Exupéry";
        libro1.genero = "Literatura infantil";
        libro1.precios = 15.99;
        libro1.cantidad = 10;
        ProyectoProgra.libros.add(libro1);

        libros libro2 = new libros();
        libro2.titulo = "Cien años de soledad";
        libro2.autor = "Gabriel Márquez";
        libro2.genero = "Realismo mágico";
        libro2.precios = 20.50;
        libro2.cantidad = 5;
        ProyectoProgra.libros.add(libro2);

        libros libro3 = new libros();
        libro3.titulo = "1984";
        libro3.autor = "George Orwell";
        libro3.genero = "Ciencia ficción";
        libro3.precios = 12.75;
        libro3.cantidad = 7;
        ProyectoProgra.libros.add(libro3);
    }

    private static void cupon() {
        
        cupones cupones1 = new cupones();
        cupones1.cupones = "D13";
        cupones1.descuento = 23;
        cupones1.tipo = "Porcentaje";
        cupones1.fecha = "24/01/2025";

        ProyectoProgra.cupon.add(cupones1);

        cupones cupones2 = new cupones();
        cupones2.cupones = "D14";
        cupones2.descuento = 88;
        cupones2.tipo = "Efectivo";
        cupones2.fecha = "10/11/2025";
        ProyectoProgra.cupon.add(cupones2);

    }
}
