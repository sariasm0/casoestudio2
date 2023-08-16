/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoestudio2;

import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class ListaComputadora {
    Computadora[] lista = new Computadora[2];
    ListaComputadora(){
        
    }
    
    
    
    
    public void llenar(){
        for (int i = 0; i < lista.length; i++) {
            String nombreCompu = "Computadora "+(i+1)+": ";
            int ram = Integer.parseInt(JOptionPane.showInputDialog(nombreCompu+"ram"));
            int almacenamiento = Integer.parseInt(JOptionPane.showInputDialog(nombreCompu+"almacenamiento"));
            String marca = (JOptionPane.showInputDialog(nombreCompu+"marca"));
            String procesador = (JOptionPane.showInputDialog(nombreCompu+"procesador"));
            lista[i]=new Computadora(procesador, marca, almacenamiento, ram);
            
        }
    }
    
    public void ConsultarMarca(String marca){
        for (int i = 0; i < lista.length; i++) {
            if (marca.equals(lista[i].getMarca())) {
                System.out.println(lista[i].toString());
            }
        }
    }
    public void ConsultarRam(int ram){
        for (int i = 0; i < lista.length; i++) {
            if (ram<=(lista[i].getRam())) {
                System.out.println(lista[i].toString());
            }
        }
    }
    
    
    @Override
    public String toString(){
        String resultado = "";
        for (int i = 0; i < lista.length; i++) {
            resultado = resultado + lista[i].toString()+"\n";
            
        }
        return resultado;
    }
    
}
