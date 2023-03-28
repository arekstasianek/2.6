import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int liczba;

        
        for (int i = 0; i < 5; i++) {
            System.out.print("Podaj liczbę nr " + (i + 1) + ": ");
            liczba = scanner.nextInt();
            if (liczba % 3 == 0) {
                suma += liczba;
            }
        }

        
        System.out.println("Suma wpisanych liczb podzielnych przez 3 wynosi: " + suma);

       
    }
}