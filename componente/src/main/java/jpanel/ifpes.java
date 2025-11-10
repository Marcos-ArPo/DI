/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpanel;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author alumnadotarde
 */
public class ifpes extends PropertyEditorSupport{
    
    private imagenFondoPanel ifp = new imagenFondoPanel();

    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return ifp;
    }

    @Override
    public String getJavaInitializationString() {
        return super.getJavaInitializationString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Object getValue() {
        return ifp.getValue();
    }
    
}
