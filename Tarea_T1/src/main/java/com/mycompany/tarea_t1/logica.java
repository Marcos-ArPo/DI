/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_t1;


import java.util.*;
/**
 *
 * @author alumnadotarde
 */
public class logica {
    public ArrayList <coche> lista = new ArrayList<>();
    
    public logica() {
        lista.add(new coche("Koenigsegg","Jesko",2015));
        lista.add(new coche("Pagani","Huarya",2021));
        lista.add(new coche("Bugatti","Cientodieci",2018));
    }
    
    public boolean agregar(coche c) {
        if (lista.contains(c)) {
            return false;
        } else {
            lista.add(c);
            return true;
        }
    }
    
    public boolean eliminar(coche c) {
        if (lista.contains(c)) {
            lista.remove(c);
            return true;
        } else {
            return false;
        }
    }
    
    public ArrayList mostrar() {
        return lista;
    }
}
