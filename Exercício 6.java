import java.util.Scanner;

public class SorteioNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int numero2 = scanner.nextInt();

        int menorNumero;
        int maiorNumero;

        if (numero1 < numero2) {
            menorNumero = numero1;
            maiorNumero = numero2;
        } else {
            menorNumero = numero2;
            maiorNumero = numero1;
        }

        int diferenca = maiorNumero - menorNumero + 1;

        double numeroSorteado = Math.random() * diferenca + menorNumero;

        System.out.println("Número sorteado: " + (int)numeroSorteado);

        if ((int)numeroSorteado % 2 == 0) {
            System.out.println("O número sorteado é par.");
        } else {
            System.out.println("O número sorteado é ímpar.");
        }

        scanner.close();
    }
}