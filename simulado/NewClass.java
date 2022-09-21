
import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {

        while (true) {

            System.out.println("Informe una string o digite exit para salir: ");

            String frase = new Scanner(System.in).nextLine();

            if (frase.equalsIgnoreCase("exit")) {

                break;
            }
            String[] frases;

            frases = frase.split(" ");

            for (String x : frases) {

                StringBuilder s1 = new StringBuilder(x);

                if (x.charAt(0) == 'a') {

                    for (int i = 0; i < s1.length(); i++) {
                        if (x.charAt(i) == 'a') {
                            s1.delete(i, i + 1);
                            s1.insert(i, "u");

                        }
                    }

                    for (int i = 0; i < s1.length(); i++) {
                        if (x.charAt(i) == 'e') {
                            s1.delete(i, i + 1);
                            s1.insert(i, "a");

                        }
                    }
                }

            
            for (int i = 0; i < s1.length(); i++) {
                if (x.charAt(i) == 'i') {
                    s1.delete(i, i + 1);
                    s1.insert(i, "e");

                }
            }
           
            s1.reverse();
            s1.insert(0, "bon");
            System.out.println(s1);
 }
            /*
                    for (int i = 0; i < s1.length(); i++) {
                        if (x.charAt(i) == 'o') {
                            s1.delete(i, i + 1);
                            s1.insert(i, "i");

                        }
                    }

                    for (int i = 0; i < s1.length(); i++) {
                        if (x.charAt(i) == 'u') {
                            s1.delete(i, i + 1);
                            s1.insert(i, "o");

                        }
                    }

                    s1.reverse();
                    s1.insert(0, "bon");
                    System.out.println(s1);

                }
                if (x.charAt(0) == 'e') {

                    for (int i = 0; i < s1.length(); i++) {
                        if (x.charAt(i) == 'a') {
                            s1.delete(i, i + 1);
                            s1.insert(i, "u");

                        }
                    }

                    for (int i = 0; i < s1.length(); i++) {
                        if (x.charAt(i) == 'e') {
                            s1.delete(i, i + 1);
                            s1.insert(i, "a");

                        }
                    }

                    for (int i = 0; i < s1.length(); i++) {
                        if (x.charAt(i) == 'i') {
                            s1.delete(i, i + 1);
                            s1.insert(i, "e");

                        }
                    }

                    for (int i = 0; i < s1.length(); i++) {
                        if (x.charAt(i) == 'o') {
                            s1.delete(i, i + 1);
                            s1.insert(i, "i");

                        }
                    }

                    for (int i = 0; i < s1.length(); i++) {
                        if (x.charAt(i) == 'u') {
                            s1.delete(i, i + 1);
                            s1.insert(i, "o");

                        }
                    }

                    s1.reverse();
                    s1.insert(0, "bon");
                    System.out.println(s1);

                }
                if (x.charAt(0) == 'i') {

                    for (int i = 0; i < s1.length(); i++) {
                        if (x.charAt(i) == 'a') {
                            s1.delete(i, i + 1);
                            s1.insert(i, "u");

                        }
                    }

                    for (int i = 0; i < s1.length(); i++) {
                        if (x.charAt(i) == 'e') {
                            s1.delete(i, i + 1);
                            s1.insert(i, "a");

                        }
                    }

                    for (int i = 0; i < s1.length(); i++) {
                        if (x.charAt(i) == 'i') {
                            s1.delete(i, i + 1);
                            s1.insert(i, "e");

                        }
                    }

                    for (int i = 0; i < s1.length(); i++) {
                        if (x.charAt(i) == 'o') {
                            s1.delete(i, i + 1);
                            s1.insert(i, "i");

                        }
                    }

                    for (int i = 0; i < s1.length(); i++) {
                        if (x.charAt(i) == 'u') {
                            s1.delete(i, i + 1);
                            s1.insert(i, "o");

                        }
                    }

                    s1.reverse();
                    s1.insert(0, "bon");
                    System.out.println(s1);

                }
                if (x.charAt(0) == 'o') {

                    for (int i = 0; i < s1.length(); i++) {
                        if (x.charAt(i) == 'a') {
                            s1.delete(i, i + 1);
                            s1.insert(i, "u");

                        }
                    }

                    for (int i = 0; i < s1.length(); i++) {
                        if (x.charAt(i) == 'e') {
                            s1.delete(i, i + 1);
                            s1.insert(i, "a");

                        }
                    }

                    for (int i = 0; i < s1.length(); i++) {
                        if (x.charAt(i) == 'i') {
                            s1.delete(i, i + 1);
                            s1.insert(i, "e");

                        }
                    }

                    for (int i = 0; i < s1.length(); i++) {
                        if (x.charAt(i) == 'o') {
                            s1.delete(i, i + 1);
                            s1.insert(i, "i");

                        }
                    }

                    for (int i = 0; i < s1.length(); i++) {
                        if (x.charAt(i) == 'u') {
                            s1.delete(i, i + 1);
                            s1.insert(i, "o");

                        }
                    }

                   

                }
                if (x.charAt(0) == 'u') {

                    for (int i = 0; i < s1.length(); i++) {
                        if (x.charAt(i) == 'a') {
                            s1.delete(i, i + 1);
                            s1.insert(i, "u");

                        }
                    }

                    for (int i = 0; i < s1.length(); i++) {
                        if (x.charAt(i) == 'e') {
                            s1.delete(i, i + 1);
                            s1.insert(i, "a");

                        }
                    }

                    for (int i = 0; i < s1.length(); i++) {
                        if (x.charAt(i) == 'i') {
                            s1.delete(i, i + 1);
                            s1.insert(i, "e");

                        }
                    }

                    for (int i = 0; i < s1.length(); i++) {
                        if (x.charAt(i) == 'o') {
                            s1.delete(i, i + 1);
                            s1.insert(i, "i");

                        }
                    }

                    for (int i = 0; i < s1.length(); i++) {
                        if (x.charAt(i) == 'u') {
                            s1.delete(i, i + 1);
                            s1.insert(i, "o");

                        }
                    }

                    s1.reverse();
                    s1.insert(0, "bon");
                    System.out.println(s1);

                }
                
                else{

                    for (int i = 0; i < s1.length(); i++) {
                        if (x.charAt(i) == 'a') {
                            s1.delete(i, i + 1);
                            s1.insert(i, "e");

                        }
                    }

                    for (int i = 0; i < s1.length(); i++) {
                        if (x.charAt(i) == 'e') {
                            s1.delete(i, i + 1);
                            s1.insert(i, "i");

                        }
                    }

                    for (int i = 0; i < s1.length(); i++) {
                        if (x.charAt(i) == 'i') {
                            s1.delete(i, i + 1);
                            s1.insert(i, "o");

                        }
                    }

                    for (int i = 0; i < s1.length(); i++) {
                        if (x.charAt(i) == 'o') {
                            s1.delete(i, i + 1);
                            s1.insert(i, "u");

                        }
                    }

                    for (int i = 0; i < s1.length(); i++) {
                        if (x.charAt(i) == 'u') {
                            s1.delete(i, i + 1);
                            s1.insert(i, "a");

                        }
                    }

                    s1.reverse();
                    s1.insert(0, "ban");
                    System.out.println(s1);
             */
        }

    }
}
}

}
