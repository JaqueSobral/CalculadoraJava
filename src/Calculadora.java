
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuarCalculo = true;

        while (continuarCalculo) {
            System.out.println("Bem-vinda à Calculadora! Escolha uma operação:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");

            System.out.print("Digite o número da operação desejada: ");
            int opcao = scanner.nextInt();

            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado;

            switch (opcao) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado da adição: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("Resultado da multiplicação: " + resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado da divisão: " + resultado);
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida!");
                    }
                    break;
                default: System.out.println("Opção inválida! Tente novamente.");
        }
            System.out.print("\nDeseja realizar outra operação? (S/N): ");
            char resposta = scanner.next().toUpperCase().charAt(0);

            if (resposta == 'N') {
                continuarCalculo = false;
                System.out.println("Encerrando a calculadora. Até a próxima!");
            }
        }
        scanner.close();
    }
}

