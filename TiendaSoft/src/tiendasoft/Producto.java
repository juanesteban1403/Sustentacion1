package tiendasoft;

public class Producto {
    //Atributos
    private double valind;
    private int cant;
    private String nom;
    
    //Metodos

    public double getValind() {
        return valind;
    }

    public void setValind(double valind) {
        this.valind = valind;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void VisualProd(){
        System.out.println("Nombre:"+nom+"\nCantidad: "+cant+"\nValor Individual: "+valind); 
    }
    
}
