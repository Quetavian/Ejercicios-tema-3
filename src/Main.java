// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int resultado = suma (1,2,3);
        System.out.println(resultado);

        coche miCoche = new coche();
        miCoche.masPuertas();
        System.out.println(miCoche.numPuertas);

    }

    //Funciones
    public static int suma (int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    //Clases
    public static class coche {
        //Atributos
        int numPuertas;
        //Métodos
        public int masPuertas() {
            this.numPuertas++;
            return numPuertas;
        }
    }

}