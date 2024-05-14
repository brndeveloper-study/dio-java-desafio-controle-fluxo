import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int parametroUm = validarParametroInteiro(scanner, "Insira o primeiro" +
                " número inteiro");

        int parametroDois = validarParametroInteiro(scanner, "Insira o segundo" +
                " número inteiro");

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    // Esse método vai poder validar a entrada invidualmente, entrada por entrada.
    static int validarParametroInteiro(Scanner scanner, String mensagem) {
        boolean entradaValida = false;
        int parametro = 0;

        while (!entradaValida) {
            try {
                System.out.print(mensagem + ": ");
                parametro = scanner.nextInt();

                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Digite um número válido!\n");
                scanner.nextLine();
            }
        }

        return parametro;
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int iteracoes = 0;
        iteracoes = (parametroDois - parametroUm);

        for (int n = 0; n < iteracoes; n++) {
            System.out.println("Imprimindo o número " + (n + 1));
        }

    }

}
