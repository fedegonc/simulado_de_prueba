package simulado;


import java.util.Scanner;

public class Veiculos {

    public static void main() {

        int cantidad;
        double media, sumaValor = 0, valorMayor = 0, valorMenor = 999999, valorX = 0;
        String placaMayor = "";
        String modeloMayor = "";
        String placaMenor = "";
        String modeloMenor = "";

        while (true) {
            try {

                System.out.println("Ingrese la cantidad de veiculos: ");
                cantidad = new Scanner(System.in).nextInt();
                break;
            } catch (Exception e) {
                System.err.print("Alerta: Ingrese un numero entero: ");

            }
        }

        String[] placa = new String[cantidad];
        String[] modelo = new String[cantidad];
        int[] anio = new int[cantidad];
        double[] valor = new double[cantidad];
        String[] cor = new String[cantidad];

        for (int i = 0; i < cantidad; i++) {

            System.out.println("Ingrese la placa del veiculo: ");
            placa[i] = new Scanner(System.in).nextLine();

            while (true) {
                try {

                    System.out.println("Ingrese el año del veiculo: ");
                    anio[i] = new Scanner(System.in).nextInt();
                    break;
                } catch (Exception e) {
                    System.err.print("Alerta: Ingrese un numero entero: ");

                }
            }

            System.out.println("Ingrese el modelo del veiculo: ");
            modelo[i] = new Scanner(System.in).nextLine();

            while (true) {
                try {

                    System.out.println("Ingrese el valor del veiculo: ");
                    valorX = new Scanner(System.in).nextDouble();
                    if (valorX <= 30000 && valorX > 0) {
                        valor[i] = valorX;
                        break;
                    } else {
                        System.out.println("Ingrese un valor menor a R$ 30000");
                    }

                } catch (Exception e) {
                    System.err.print("Alerta: Ingrese un numero con coma: ");

                }
            }

            System.out.println("Ingrese el color del veiculo: ");
            cor[i] = new Scanner(System.in).next();

        }

        for (int i = 0; i < cantidad; i++) {

            sumaValor = sumaValor + valor[i];

        }

        media = sumaValor / cantidad;

        System.out.println("La cantidad de autos es: " + cantidad);
        System.out.println("\n ");
        System.out.println("La media del valor de los vaiculos es: " + media);
        System.out.println("\n ");
        System.out.println("Los autos entre 0 y R$10000 : ");
        for (int i = 0; i < cantidad; i++) {
            if (valor[i] > 0 && valor[i] <= 10000) {
                System.out.printf("placa: %s modelo: %s valor: R$%.1f  \n", placa[i], modelo[i], valor[i]);
            }
        }
        System.out.println("\n ");
        System.out.println("Los autos entre R$ 10001 y R$20000: ");
        for (int i = 0; i < cantidad; i++) {
            if (valor[i] > 10000 && valor[i] <= 20000) {
                System.out.printf("placa: %s modelo: %s valor: R$%.1f  \n", placa[i], modelo[i], valor[i]);
            }
        }
        System.out.println("\n ");
        System.out.println("Los autos entre R$ 20001 y R$30000: ");
        for (int i = 0; i < cantidad; i++) {
            if (valor[i] > 20000 && valor[i] <= 30000) {
                System.out.printf("placa: %s modelo: %s valor: R$%.1f  \n", placa[i], modelo[i], valor[i]);
            }
        }
        System.out.println("\n ");
        System.out.println("Los auto mas caro es: ");
        for (int i = 0; i < cantidad; i++) {
            if (valor[i] > valorMayor) {
                valorMayor = valor[i];
                placaMayor = placa[i];
                modeloMayor = modelo[i];

            }
        }

        System.out.printf("placa: %s modelo: %s valor: R$%.1f \n", placaMayor, modeloMayor, valorMayor);
        System.out.println("\n ");

        System.out.println("El auto mas barato es: ");
        for (int i = 0; i < cantidad; i++) {
            if (valor[i] < valorMenor) {
                valorMenor = valor[i];
                placaMenor = placa[i];
                modeloMenor = modelo[i];

            }
        }
        System.out.printf("placa: %s modelo: %s valor: R$%.1f \n", placaMenor, modeloMenor, valorMenor);
        System.out.println("\n ");

        System.out.println("Los autos del 2022 son: ");
        for (int i = 0; i < cantidad; i++) {
            if (anio[i] == 2022) {
                System.out.printf("%s %s %.1f  \n", placa[i], modelo[i], valor[i]);
            }
        }

        System.out.println("\n ");

    }

}
