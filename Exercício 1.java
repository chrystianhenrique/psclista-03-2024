import java.util.Scanner;

public class AnaliseNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três números:");

        double numero1 = scanner.nextDouble();
        double numero2 = scanner.nextDouble();
        double numero3 = scanner.nextDouble();

        double maior = Math.max(numero1, Math.max(numero2, numero3));

        double menor = Math.min(numero1, Math.min(numero2, numero3));

        double media = (numero1 + numero2 + numero3) / 3;

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("A média aritmética é: " + media);

        scanner.close();
    }
}