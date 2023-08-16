/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoestudio2;
import javax.swing.JOptionPane;
/**
 *
 * @author sebas
 */
public class CasoEstudio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaComputadora lista = new ListaComputadora();
            lista.llenar();
            System.out.println(lista.toString());
            lista.ConsultarMarca(JOptionPane.showInputDialog("Ingrese la marca"));
            lista.ConsultarRam(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ram")));

        
        
        
        
    }
    
}
