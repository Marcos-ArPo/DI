/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_t1;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alumnadotarde
 */
public class table extends AbstractTableModel{
    
    private List <coche> lista;
    private String [] cols = {"Marca", "Modelo", "Año"};

    public table(List <coche> lista) {
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
                return lista.get(rowIndex).getMarca();
            case 1:
                return lista.get(rowIndex).getModelo();
            case 2:
                return lista.get(rowIndex).getAnio();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return cols[column];
    }
    
    
}
