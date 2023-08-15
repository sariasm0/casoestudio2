/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoestudio2;

/**
 *
 * @author sebas
 */
public class Computadora {
 private String procesador;
 private String marca;
 private int almacenamiento;
 private int ram;
 public Computadora(String procesadorUsuario, String marcaUsuario, int almacenamientoUsuario, int ramUsuario){
    this.procesador = procesadorUsuario;
    this.marca = marcaUsuario;
    this.almacenamiento = almacenamientoUsuario;
    this.ram = ramUsuario;
}
 public void setProcesador(String procesador) {
     this.procesador=procesador;
 }
 public void setMarca(String marca){
     this.marca=marca;
 }
 public void setAlmacenamiento(int almacenamiento){
     this.almacenamiento=almacenamiento;
 }
 public void setRam(int ram){
     this.ram=ram;
 }
 public String getProcesador(){
     return this.procesador;
 }
 public String getMarca(){
     return this.marca;
 }
 public int getAlmacenamiento(){
     return this.almacenamiento;
 }
 public int getRam(){
     return this.ram;
 }
 
 @Override
 public String toString(){
     return "procesador: "+this.procesador+" marca: "+this.marca+" almacenamiento: "+this.almacenamiento+" ram: "+this.ram;
 }
 
}
