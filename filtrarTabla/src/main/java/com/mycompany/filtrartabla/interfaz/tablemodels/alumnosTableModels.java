/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filtrartabla.interfaz.tablemodels;

import com.mycompany.filtrartabla.beans.alumnos;
import java.util.*;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alumnadotarde
 */
public class alumnosTableModels extends AbstractTableModel{

    private List <alumnos> lista;
    public String [] cols = {"Nombre","Curso"};

    public alumnosTableModels(List<alumnos> lista) {
        this.lista = lista;
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return lista.get(rowIndex).getNombre();
            case 1:
                return lista.get(rowIndex).getCurso();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return cols[column];
    }
    
}
