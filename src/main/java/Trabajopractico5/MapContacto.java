/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajopractico5;

import java.util.TreeMap;
import javax.swing.JOptionPane;


public class MapContacto {
    private TreeMap<Long,Contacto> guiaTelefonica;

    public MapContacto() {
        this.guiaTelefonica = new TreeMap<>();;
    }

    public TreeMap<Long, Contacto> getGuisTelefonica() {
        return guiaTelefonica;
    }

    public void setGuisTelefonica(TreeMap<Long, Contacto> guisTelefonica) {
        this.guiaTelefonica = guisTelefonica;
    }

    @Override
    public String toString() {
        return "MapContacto{" + "guisTelefonica=" + guiaTelefonica + '}';
    }
////    A. agregarContacto() que permite registrar un nuevo contacto con su respectivo nro. de 
//teléfono. Siendo el nro. del teléfono la clave del mismo. 
    public void agregarContacto(Long telefono, Contacto contacto){
    if (guiaTelefonica.containsKey(telefono)) {
            JOptionPane.showMessageDialog(null, "El numero " + telefono +" pertenece a un contacto ");
        } else {
            guiaTelefonica.put(telefono, contacto);
            JOptionPane.showMessageDialog(null, contacto + " Fue registrado exitosamente");
        }
    }
//B. buscarContacto() que en base al nro. de teléfono retorna el Contacto asociado al mismo. 
    public void buscarContacto(Long telefono, Contacto contacto){
    
    }
//C. buscarTeléfono() que en base a un apellido nos devuelve un Set<Long> con los números 
//de teléfono asociados a dicho apellido.  
    public void buscarTelefono(Long telefono, Contacto contacto){
    
    }
//D. buscarContactos() que en base a una ciudad nos devuelve un ArrayList con los 
//Contactos asociados a dicha ciudad.  
    public void buscarContactoPorCiudad(Long telefono, Contacto contacto){
    }
//E. borrarContacto() que en base al número de teléfono elimina el contacto del directorio. 
    public void borrarContacto(Long telefono, Contacto contacto){
    
    }
}
