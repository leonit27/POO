package ejercicio1;

public class Ordenador {
    private String marca;
    private String modelo;
    private double precio;
    private int stock;

    //Constructor
    public Ordenador(String marca, String modelo, double precio, int stock) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.stock = stock;
    }

    //Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    //Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString(){
        return this.marca + " " + this.modelo + " cuesta " + this.precio + "€ y quedan " + this.stock + " unidades.";
    }
}
