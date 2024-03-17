import java.util.Scanner;

public class CalculadoraGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código da operação (1 para perímetro do círculo, 2 para área do círculo, 3 para volume da esfera):");
        int codigoOperacao = scanner.nextInt();

        if (codigoOperacao >= 1 && codigoOperacao <= 3) {
            System.out.println("Digite o valor do raio:");
            double raio = scanner.nextDouble();

            double resultado;
            switch (codigoOperacao) {
                case 1:
                    resultado = 2 * Math.PI * raio;
                    System.out.printf("O perímetro do círculo é: %.2f%n", resultado);
                    break;
                case 2:
                    resultado = Math.PI * Math.pow(raio, 2);
                    System.out.printf("A área do círculo é: %.2f%n", resultado);
                    break;
                case 3:
                    resultado = (4.0 / 3) * Math.PI * Math.pow(raio, 3);
                    System.out.printf("O volume da esfera é: %.2f%n", resultado);
                    break;
            }
        } else {
            System.out.println("Código de operação inválido.");
        }

        scanner.close();
    }
}