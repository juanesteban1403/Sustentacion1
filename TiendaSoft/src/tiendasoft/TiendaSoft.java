package tiendasoft;

import java.util.Scanner;

public class TiendaSoft {
    static int cantidad=0;
    static double acum1=0;
    static double acum=0;
   static int contProd=0;

     static void crear(int c){
        Product[c] = new Producto();
        Product[c].Generar_Producto(c);
        System.out.println("y este es el producto "+(n+1)+"/256 de sus articulos...");
        System.out.println("");
     }

    static int Buscar (String nombre){
        int i=0;
        while (i<n){
            if(nombre.equals(Product[i].getNombre())){
                Product[i].Show(); 
                System.out.println("este es el producto"+(i+1)+"/256 de sus productos");
                System.out.println("");
                return i;
            }
            i++;
        }
        System.out.println("No se ha encontrado el producto");
        return 256;
    
    }
    static void Eliminar (String nombre){
        int nom,opc;
        nom=Buscar(nombre);
        if (nom>n){
            System.out.println("El producto no existe");
            System.out.println("");
            
        }
        else{
            System.out.println("desea eliminar a este producto?     1.Si" );
            Product[nom].Show();
            opc= leer.nextInt();
            if(opc==1){
                n--;
                Product[nom]=Product[n];
                Product[n]=null;
                System.out.println("el producto ha sido eliminado");  
            }
        }
    }
    static void Mostrar (){
    int i=0;
    for(i=0;i<n;i++){
        Product[i].Show();
    }
}
    static void Venta(){
  
    String h;
    int i;
    double k;
    System.out.println("ingrese nombre de producto");
    h=leer.next();
    i=Buscar(h);
    if(i<n){
    k=Product[i].getValor();
    System.out.println("el precio es:    "+k);
    System.out.println("cuantos desea comprar?");
    cantidad=leer.nextInt();
    if (cantidad<=Product[i].getCantidad()){
        Product[i].setCantidad(Product[i].getCantidad()-cantidad);
        acum1=cantidad*Product[i].getValor();
        System.out.println("se vendieron "+cantidad+" productos y en total fueron"+acum1);
        if(Product[i].getCantidad()==0){
            System.out.println("se acabo el producto"+Product[i].getNombre());
            System.out.println("se eliminara el producto automaticamente");
            Eliminar1(h);
        }
        
    }
    else{
        System.out.println("No hay suficientes productos");
    }
    }
    
       
    acum=acum1+acum;   
}
    static void Ganancias(){
        if(acum==0){
            System.out.println("Aun no hay gananacias");
            
        }
        else 
            System.out.println("Ganancia: "+acum);
    }
     static void Eliminar1 (String nombre){
        int nom;
        nom=Buscar(nombre);
                n--;
                Product[nom]=Product[n];
                Product[n]=null;
                System.out.println("el producto ha sido eliminado");  
            }
        
    
        static int opcion=0;
        static int n=0;
    static Scanner leer = new Scanner(System.in);
    static Producto Product[] = new Producto[256];
    public static void main(String[] args) {

       String auxi;
            do {
                System.out.println("");
                System.out.println("Bienvenido...");
                System.out.println("Por favor ingrese una opcion:");
                System.out.println("1.Agregar Producto   2.Buscar Producto");
                System.out.println("3.Eliminar producto    4.mostrar inventario");
                System.out.println("5. Realizar Venta       6.Mostrar ganancias");
                System.out.println("7. Salir");
                System.out.println("");
                opcion=leer.nextInt();
                switch(opcion){
                    case 1:
                            if (n<=255) {
                            crear(n);
                            n++;    
                        } else {
                            System.out.println("No se pueden agregar mas producto..");
                            System.out.println("");
                            }
                        
                    break;
                    case 2:
                        if (n!=0) {
                            System.out.println("Ingrese el nombre del Producto:");
                            auxi=leer.next();
                            Buscar(auxi);
                            
                        } else {
                            System.out.println("No existen productos en su tienda");
                            System.out.println("");
                        }
                          break;
                    case 3:
                        if (n!=0) {
                           System.out.println("Ingrese el nombre del producto:");
                           auxi=leer.next();
                           Eliminar(auxi); 
                        } else {
                            System.out.println("No existen productos en la tienda");
                            System.out.println("");
                        }
                    break;
                    case 4:
                        if (n!=0) {
                           
                           Mostrar();
                           
                        } else {
                            System.out.println("No existen productos en la tienda");
                            System.out.println("");
                        }
                    break;
                    case 5:
                           if (n!=0){
                               Venta();
                           }
                           else {
                            System.out.println("No existen productos en la tienda");
                            System.out.println("");
                           }
                    break;
                    case 6:
                            if(n!=0){
                                Ganancias();
                                
                            }
                            else{
                                System.out.println("aun no hay ganancias");
                                System.out.println("");
                            }
                            break;
                    default:
                        System.out.println("Opcion invalida");
                        
                }
        } while (opcion != 7); 
        
    }


}
