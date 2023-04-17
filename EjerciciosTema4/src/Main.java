// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("*** Estructuras de Control ***");
        int numeroIf = 5;

        if(numeroIf > 0){
            System.out.println("El numero "+ numeroIf+" es Positivo");
        }else if(numeroIf < 0){
            System.out.println("El numero "+ numeroIf+" es Negativo");
        }else{
            System.out.println("El numero es igual a Cero");
        }

        int numeroWhile = 0;
        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println("Variable while es: "+ numeroWhile);
        }

        int numeroDoWhile = 3;
        do{
            numeroDoWhile++;
            System.out.println("Varible doWhile es: "+ numeroDoWhile);
        }while (numeroDoWhile < 3);

        for (int numeroFor = 0; numeroFor<=3; numeroFor++ ){
            System.out.println("Variable numeroFor: "+ numeroFor);
        }

        String estacion = "PRIMAVERA";
        switch (estacion){
            case "VERANO":
                System.out.println("Estacion: "+estacion);
                break;
            case "PRIMAVERA":
                System.out.println("Estacion: "+estacion);
                break;
            case "OTOÑO":
                System.out.println("Estacion: "+estacion);
                break;
            case "INVIERNO":
                System.out.println("Estacion: "+estacion);
                break;
            default:
                System.out.println("Estacion no encontrada");
        }
    }
}