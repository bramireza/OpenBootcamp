// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("*** Suma de 3 numeros ***");

        int resultado = suma(2,3,5);

        System.out.println("El resultado es: "+ resultado);

        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();

        System.out.println("Numero de puertas de mi Coche: "+ miCoche.numPuertas);

    }
    public static int suma(int a, int b, int c){
        return (a+b+c);
    }

}
class Coche {
     int numPuertas;
    public void incrementarPuertas() {
        this.numPuertas++;
    }
}