import javax.swing.*;

public class Coche {
    private String matricula;
   private  String marca;
   private String modelo;
   private String color;
   private boolean techoSolar;
   private double kilometros;
   private int numPuertas;
   private int numPlazas;




   public Coche(){
       this.matricula="";
       this.marca="SEAT";
       this.modelo="ALTEA";
       this.color="blanco";
       this.techoSolar=false;
       this.kilometros=0.0;
       this.numPuertas=3;
       this.numPlazas=5;


   };

   public Coche(String matricula){
       this.matricula=matricula;

   }

    public Coche(String matricula, String marca, String modelo, String color, boolean techoSolar, double kilometros, int numPuertas, int numPlazas) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.techoSolar = techoSolar;
        this.kilometros = kilometros;
        this.numPuertas = numPuertas;
        this.numPlazas = numPlazas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getTechoSolar() {
        return techoSolar;
    }

    public void setTechoSolar(boolean techoSolar) {
        this.techoSolar = techoSolar;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

 //método avanzar


    public void avanzar(double kilometros){
       this.kilometros+=kilometros;
        JOptionPane.showInputDialog("El coche avanza "+  kilometros+"km y tiene un total de "+this.kilometros+" km recorridos");

    }


    //metodo tunear

    public void tunear() {
        this.kilometros = 0;
        if (this.techoSolar == true) {
            JOptionPane.showInputDialog("El coche ya dispone de techo solar, hemos reiniciado el cuenta kilómetros ");
        } else {
            this.techoSolar = true;
            JOptionPane.showInputDialog("Le hemos instalado el techo solar y el cuenta kilómetros está reiniciado a 0");
        }

    }

//metodo tunear sobrecargado
        public void tunear(String color) {
            this.color = color;
            this.kilometros = 0;
            if (this.techoSolar==true) {
                JOptionPane.showInputDialog("El coche ha sido tuneado, ha sido pintado de " + color + " y su cuenta kilómetros ha sido reiniciado");
            } else {
                this.techoSolar=true;
                System.out.println("El coche ha sido tuneado, ha sido pintado de " + color + " y su cuentakilómetros ha sido reiniciado y le hemos instalado el techo solar");
            }
        }


        //metodo matricular

    public void matricular(String matricula) {
        this.matricula = matricula;
        JOptionPane.showInputDialog(" Se ha matriculado  el coche con la siguiente matricula  " + matricula);
    }



}

