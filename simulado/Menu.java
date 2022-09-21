
import java.util.InputMismatchException;
import java.util.Scanner;
import simulado.Codificador;
import simulado.Veiculos;

public class Menu {

    public static void main(String[] args) {

        int varmenu = 0;
        while (varmenu != 3) {

            Scanner input = new Scanner(System.in);
            System.out.println("1-Veiculos");
            System.out.println("2-Codificador");
            System.out.println("3-Salir");

            while (true) {
                try {
                    input = new Scanner(System.in);
                    varmenu = input.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Informe um numero");
                }
            }

            switch (varmenu) {
                case 1:
                    Veiculos.main();
                    break;

                case 2:
                    Codificador.main();

                    break;

            }

        }
    }
}
