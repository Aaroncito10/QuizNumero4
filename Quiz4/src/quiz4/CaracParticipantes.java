/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz4;

/**
 *
 * @author aaron
 */
public class CaracParticipantes {


    //Atributos de la clase 
    private String nombreDelCorredor = "";
    private int edad, numeroDelCorredor;
    private double tiempoEstimado;

    //Constructor de la clase
    public CaracParticipantes(String nombreDelCorredor, int edad, int numeroDelCorredor, double tiempoEstimado) {
        this.edad = edad;
        this.numeroDelCorredor = numeroDelCorredor;
        this.tiempoEstimado = tiempoEstimado;
        this.nombreDelCorredor = nombreDelCorredor;
    }

    //Metodos set and get 
    public String getNombreDelCorredor() {
        return nombreDelCorredor;
    }

    public void setNombreDelCorredor(String nombreDelCorredor) {
        this.nombreDelCorredor = nombreDelCorredor;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroDelCorredor() {
        return numeroDelCorredor;
    }

    public void setNumeroDelCorredor(int numeroDelCorredor) {
        this.numeroDelCorredor = numeroDelCorredor;
    }

    public double getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(double tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    //Metodo para determinar la categoria con la edad
    public String determinarCategoria(int edad) {
        if (edad < 18) {
            return "Segun la edad ingresada la categoria correspondiente es: Juvenil. "; //Esta linea de codigo va a retornar Juvenil en caso de que la edad sea menor a 18
        } else if (edad <= 40) {
            return "Segun la edad ingresada la categoria correspondiente es: Adulto. "; //Esta linea de codigo va a retornar Adulto en caso de que la edad sea menor o igual a 40 
        } else if (edad > 40){
            return "Segun la edad ingresada la categoria correspondiente es: Master. "; //Esta linea de codigo va a retornar Master en caso de que la edad sea menor 
        }else{
            return "La edad ingresada no cumple los requisitos."; //Retorna este mensaje en caso de que el usuario ingrese algun valor no valido
        }
    }

    //Metodo toString para llamar los datos del corredor
    @Override
    public String toString() {
        return "ReservasBarista{" + "Nombre del corredor =" + nombreDelCorredor + ", Edad del corredor =" + edad + ", Numero del correodor =" + numeroDelCorredor + ", Tiempo estimado de la carrera =" + tiempoEstimado + '}';
    }

}
