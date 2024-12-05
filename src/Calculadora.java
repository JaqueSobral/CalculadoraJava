import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double valor1;
        Double valor2;
        String operação;
        boolean continuarCalculo;

        do {
            System.out.println("Digite o valor 1: ");
            valor1 = (Double) scanner.nextDouble();

            System.out.println("Escolha uma operação: +, -, /, *");
            operação = scanner.next();

            System.out.println("Digite o valor 2: ");
            valor2 = (Double) scanner.nextDouble();

            System.out.println("Resultado é: " + realizarCalculo(valor1, valor2, operação));
            continuarCalculo = verificarNovoCalculo();
        } while (continuarCalculo);
    }

    public static boolean verificarNovoCalculo(){
        Scanner novaOperação = new Scanner(System.in);
        System.out.println("Deseja realizar um novo calculo? S ou N");
        return !novaOperação.nextLine().toUpperCase(Locale.ROOT).equals("N");
    }
    public static Double realizarCalculo(Double valor1, Double valor2, String operação){
        Double resultadoDoCalculo = (Double) 0.0;

        switch(operação){
            case "+":
            resultadoDoCalculo = valor1 + valor2;
            case "-":
            resultadoDoCalculo = valor1 - valor2;
            case "/":
            resultadoDoCalculo = valor1 / valor2;
            case "*":
            resultadoDoCalculo = valor1 * valor2;
            break;
            default:
                System.out.println("Operação inválida.Tente colocar outro valor!!");
        }
        return resultadoDoCalculo;
    }

}