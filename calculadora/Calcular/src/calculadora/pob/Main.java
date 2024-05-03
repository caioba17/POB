package calculadora.pob;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opc = 0;
        double num1=0, num2=0;
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        do {
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Raíz");
            System.out.println("6 - Potência (1° número = base; 2° número = expoente)");
            System.out.println("7 - Sair");

            System.out.println("Informe sua opção: ");
            opc = sc.nextInt();

            if (opc == 7) {
                break;
            } else {
                if (opc == 5)
                {
                    System.out.println("Número 1: ");
                    num1 = sc.nextDouble();
                }
                else if ((opc >= 1) && (opc <= 7)){
                    System.out.println("Número 1: ");
                    num1 = sc.nextDouble();
                    System.out.println("Número 2: ");
                    num2 = sc.nextDouble();
                }
            }

            switch (opc) {

                case 1: System.out.println("\nResultado = " + calculadora.Soma(num1, num2));
                break;

                case 2: System.out.println("\nResultado = " + calculadora.Subtrai(num1, num2));
                break;

                case 3: System.out.println("\nResultado = " + calculadora.Multiplica(num1, num2));
                break;

                case 4: System.out.println("\nResultado = " + calculadora.Divide(num1, num2));
                break;

                case 5: System.out.println("\nResultado = " + calculadora.Raiz(num1));
                break;

                case 6: System.out.println("\nResultado = " + calculadora.Potencia(num1, num2));
                break;

                default: System.out.println("Opção Inválida!");
            }

        } while (opc != 7);

    }
}