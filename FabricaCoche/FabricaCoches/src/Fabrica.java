import javax.swing.*;

public class Fabrica {

    private Coche[]coches;
    private int numCoches;

    public Fabrica(int i) {
        this.coches=new Coche[i];
        this.numCoches=0;

    }

    public void anyadeCoche(Coche coche){
        if(numCoches<coches.length){
            this.coches[numCoches]=coche;
            numCoches++;
            JOptionPane.showMessageDialog(null,"Coche añadido a la fabrica");

        }else{
            JOptionPane.showMessageDialog(null,"No hay espacio en la fábrica");
        }




    }







    public void caracteristicas() {
        for (int i = 0; i < coches.length; i++) {
            String caracteristicas = "Estas son las características del coche:\n" +
                    "Matrícula: " + coches[i].getMatricula() + "\n" +
                    "Marca: " + coches[i].getMarca() + "\n" +
                    "Modelo: " + coches[i].getModelo() + "\n" +
                    "Color: " + coches[i].getColor() + "\n" +
                    "Techo Solar: " + coches[i].getTechoSolar() + "\n" +
                    "Kilómetros: " + coches[i].getKilometros() + "\n" +
                    "Números Puertas: " + coches[i].getNumPuertas() + "\n" +
                    "Número Plazas: " + coches[i].getNumPlazas() + "\n";
            JOptionPane.showMessageDialog(null, caracteristicas);

        }

    }









    public static void main(String[]args) {

        Coche coche1=new Coche("1234-DF","Seat","Toledo","azul",false,200,3,5);
        Coche coche2=new Coche("5678-AG","Fiat","Uno","rojo",true,300,3,2);
        Coche coche3=new Coche("9012-HH","BMW","850","gris",false,400,5,5);
        Coche coche4=new Coche("3456-XS","VW","Caddy","blanco",true,500,5,5);

        Fabrica fabrica= new Fabrica(4);
        fabrica.anyadeCoche(coche1);
        fabrica.anyadeCoche(coche2);
        fabrica.anyadeCoche(coche3);
        fabrica.anyadeCoche(coche4);

        fabrica.caracteristicas();
    }




}
