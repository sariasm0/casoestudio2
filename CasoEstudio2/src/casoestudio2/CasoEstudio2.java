/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoestudio2;

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
        Computadora computadora1 = new Computadora("amd", "asus", 12, 43);
        System.out.println(computadora1.toString());
        computadora1.setMarca("toshiba");
        System.out.println(computadora1.toString());
        Computadora computadora2 = new Computadora("intel", "nvidia", 15, 23);
        System.out.println(computadora2.toString());
        
        
        
        
    }
    
}
