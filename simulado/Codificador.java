/*
 Elabore um aplicativo que codifica e decodifica frases.

Para formar uma frase codificada, tokenize a frase em palavras como método String split separando pelos espaços.

Para transformar cada palavra, siga as regras:

Palavras iniciadas com vogais (a, e, i, o, u):

Adicione as letras “iay” no inicio da palavra e apresente a palavra original invertida.

Exemplo: animal -> iaylamina, urso -> iayosru

Outras palavras:

Adicione as letras “uai” no inicio da palavra, e coloque as duas primeiras letras da palavra no final.

Exemplo: solto-> uailtoso, correr-> uairrerco.

Considere que as palavras estarão separadas por espaços, sem pontuações,
maiúsculas ou minúsculas, e palavras de pelo menos 3 caracteres.

O usuário pode informar uma frase para codificar ou codificada.
A frase codificada deve ser decodificada usando os mesmos métodos de codificação.

O aplicativo só encerra quando o usuário informar a palavra “exit”
 */
package simulado;

import java.util.Scanner;

public class Codificador {

    public static void main() {

        String[] fraseCortada;

        while (true) {
            System.out.println("Informe una frase, o 'exit' para salir: ");

            String frase = new Scanner(System.in).nextLine();

            if (frase.equalsIgnoreCase("exit")) {
                break;

            }

            if (frase.length() > 3) {
                fraseCortada = frase.split(" ");

                System.out.println("Digite Codificar: 1 o Decodificar: 2 ?  ");

                int cd = new Scanner(System.in).nextInt();

                switch (cd) {
                    case 1:
                        codificar(fraseCortada);
                        break;
                    case 2:
                        decodificar(fraseCortada);
                        break;

                }

            } else {
                System.out.println("Digite una frase mayor de 3 letras");
            }

        }
    }

    public static void codificar(String[] fraseCortada) {
        for (String palabra : fraseCortada) {

            StringBuilder s1 = new StringBuilder(palabra);

            if (       palabra.charAt(0) == 'a'
                    || palabra.charAt(0) == 'e'
                    || palabra.charAt(0) == 'i'
                    || palabra.charAt(0) == 'o'
                    || palabra.charAt(0) == 'u') {

                s1.reverse();
                s1.insert(0, "iay");

            } else {
                s1.insert(0, "uai");
                char c1 = s1.charAt(3);
                char c2 = s1.charAt(4);
                s1.delete(3, 5);
                s1.append(c1).append(c2);
            }

            System.out.println(s1);

        }

    }

    public static void decodificar(String[] fraseCortada) {
        for (String palabra : fraseCortada) {

            StringBuilder s1 = new StringBuilder(palabra);

            if (palabra.charAt(0) == 'i') {

                s1.delete(0, 3);
                s1.reverse();

            } else {

                s1.delete(0, 3);

                char c1 = s1.charAt((s1.length() - 1));
                char c2 = s1.charAt((s1.length() - 2));

                s1.insert(0, c1);
                s1.insert(0, c2);
                s1.delete((s1.length() - 2), s1.length());

            }

            System.out.println(s1);

        }
    }

}
