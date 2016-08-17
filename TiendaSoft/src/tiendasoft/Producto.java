package tiendasoft;

import java.util.Scanner;

public class Producto {
    //Atributos
    private double valor;
    private int cantidad;
    private String nombre;
    private Scanner leer= new Scanner(System.in);
    
    //Metodos

   public void Generar_Producto(int a){
    System.out.println("Ingrese nombre del producto");
    nombre=leer.next();
    System.out.println("Ingrese la cantidad del producto");
    cantidad = leer.nextInt();
    System.out.println("Ingrese el valor individual del producto");
    valor = leer.nextDouble();
}
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void Show(){
        System.out.println("");
        System.out.println("Informacion del producto");
        System.out.println("Nombre:         "+nombre);
        System.out.println("Cantidad:       "+cantidad);
        System.out.println("Valor:          "+valor);
    }
}

