import java.util.Scanner;

public class ProgramNewton {
    public static void program() {

                Scanner scan = new Scanner(System.in);
                System.out.print("Podaj epsilon: ");
                double epsilon = scan.nextDouble();
                System.out.print("Podaj maksymalna liczbe iteracji: ");
                int maxIteracje = scan.nextInt();
                System.out.print("Podaj wartosc poczatkowa x0: ");
                double x0 = scan.nextDouble();

                    double x1 = x0;
                    int iteracja = 0;
                    while (iteracja < maxIteracje) {
                    double fx0 = Math.sin(x0) - x0/2;
                    double fxPochodna = Math.cos(x0) - 0.5;
                    x1 = x0 - (fx0/fxPochodna);
                    double fx = Math.sin(x1) - x1/2;
                    System.out.println("Iteracja " + (iteracja+1) + ": x = " + x1 + ", f(x) = " + fx);
                    if (Math.abs(fx) < epsilon) {
                        break;
                    }
                    x0 = x1;
                    iteracja++;
                }
                System.out.println("Rozwiazanie: " + x1);
                if (iteracja == maxIteracje) {
                    System.out.println("Osiagnieto maksymalna liczbe iteracji");
                } else {
                    System.out.println("Osiagnieto rozwiazanie po " + (iteracja+1) + " iteracjach");
                }
            }
        }


