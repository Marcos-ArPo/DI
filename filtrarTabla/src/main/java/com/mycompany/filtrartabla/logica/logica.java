/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filtrartabla.logica;

import com.mycompany.filtrartabla.beans.alumnos;
import java.util.*;

/**
 *
 * @author alumnadotarde
 */
public class logica {
    public List <alumnos> lista = new ArrayList<>();

    public logica() {
        lista.add(new alumnos("Pablo","2DAM"));
        lista.add(new alumnos("Juan","2DAM"));
        lista.add(new alumnos("Marquitos","2DAM"));
    }

    public List<alumnos> getLista() {
        return lista;
    }
    
    
}
