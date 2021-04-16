package clase05;


public class Camion {

    //Defino los atributos de instancia
    private String color;
    private int chapa;
    private int añoCompra;
    private int nroCamion;

    //Defino qtributos de clase
    private static int CONTADOR_CAMIONES = 1000;

    //constructor sin parámetros
    /*public Camion() {
        this.color = "Negro";
        this.chapa = 1234;
        this.añoCompra = 1990;
    }*/

    //constructor con un parámetro
    /*public Camion(String unColor) {
        this.color = unColor;
        this.chapa = 1234;
        this.añoCompra = 2021;
    }*/

    //constructor con dos parámetros
    public Camion(String unColor, int unaChapa, int unAño) {
        this.color = unColor;
        this.chapa = unaChapa;
        this.añoCompra = unAño;
        this.nroCamion = CONTADOR_CAMIONES;
        CONTADOR_CAMIONES++;
    }

    public void setChapa(int unaChapa) {
        this.chapa = unaChapa;
    }

    public int getChapa() {
        return this.chapa;
    }

    public void setColor(String unColor) {
        this.color = unColor;
    }

    public String getColor() {
        return this.color;
    }

    public void setAñoCompra(int unAño) {
        this.añoCompra = unAño;
    }

    public int getAñoCompra() {
        return this.añoCompra;
    }

    public int getNroCamion(){
        return getNroCamion();
    }

    public boolean leTocaRevision() {
        return this.añoCompra < 2015;
    }

    public boolean tieneMismoColor(Camion unCamion) {
        return this.getColor().equals(unCamion.getColor());
    }

    //parece que no hace falta el this en el toString??????????????
    public String toString() {
        String datosDelCamion = "El camion " + this.nroCamion + " es de color " + color + " y de chapa " + this.chapa + ". El año de compra es " + this.añoCompra;

        if (this.leTocaRevision()) {
            datosDelCamion = datosDelCamion + " y le toca revision!!";
        } else {
            datosDelCamion = datosDelCamion + " y NO le toca revision!!";
        }
        return datosDelCamion;
    }
}
