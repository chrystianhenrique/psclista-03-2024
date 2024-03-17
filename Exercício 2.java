import java.util.Scanner;

public class MaquinaVendaAutomatica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$");
        double valorCompra = scanner.nextDouble();

        System.out.print("Digite o valor pago: R$");
        double valorPago = scanner.nextDouble();

        double troco = valorPago - valorCompra;

        if (troco < 0) {
            System.out.println("Quantia paga é insuficiente para realizar a compra.");
        } else {
            System.out.println("Troco: R$" + troco);

            int notas50 = (int) (troco / 50);
            troco %= 50;
            int notas20 = (int) (troco / 20);
            troco %= 20;
            int notas10 = (int) (troco / 10);
            troco %= 10;
            int notas5 = (int) (troco / 5);
            troco %= 5;
            int notas2 = (int) (troco / 2);
            troco %= 2;
            int notas1 = (int) troco;

            System.out.println("Notas de R$ 50,00: " + notas50);
            System.out.println("Notas de R$ 20,00: " + notas20);
            System.out.println("Notas de R$ 10,00: " + notas10);
            System.out.println("Notas de R$ 5,00: " + notas5);
            System.out.println("Notas de R$ 2,00: " + notas2);
            System.out.println("Notas de R$ 1,00: " + notas1);
        }

        scanner.close();
    }
}