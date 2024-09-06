/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajopractico5;

import java.util.ArrayList;
import java.util.Map;
import static java.util.Map.entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import javax.swing.RowFilter.Entry;


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
    public Contacto buscarContacto(Long telefono){
        
   
        return guiaTelefonica.get(telefono);
        
    
    }
//C. buscarTeléfono() que en base a un apellido nos devuelve un Set<Long> con los números 
//de teléfono asociados a dicho apellido.  
    public Set<Long> buscarTelofono(String apellido){
      Set<Long> telefono = new TreeSet<>(); 
      for (Map.Entry<Long,Contacto> entry : guiaTelefonica.entrySet()){
          if(entry.getValue().getApellido().equalsIgnoreCase(apellido)){
              telefono.add(entry.getKey());
      }
      }
        return telefono;
      
      }
    
//D. buscarContactos() que en base a una ciudad nos devuelve un ArrayList con los 
//Contactos asociados a dicha ciudad.  
    public ArrayList<Contacto>buscaContactos(String ciudad){
       ArrayList<Contacto> clientesDeCiudad = new ArrayList<>();
       for(Contacto contacto : guiaTelefonica.values()){
           if(contacto.getCiudad().equalsIgnoreCase(ciudad)){
               clientesDeCiudad.add(contacto);
          }
       }
       return clientesDeCiudad;
    }
//E. borrarContacto() que en base al número de teléfono elimina el contacto del directorio. 
    public void borrarContacto(Long telefono, Contacto contacto){
        guiaTelefonica.remove(telefono);
    }
}
