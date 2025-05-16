import java.util.Arrays;
import java.util.Scanner;

public class TrocoGuloso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do usuário
        System.out.print("Digite a quantia a ser trocada: ");
        int quantia = scanner.nextInt();

        // Moedas disponíveis (ordenadas decrescentemente)
        int[] moedas = {5, 2, 1};

        System.out.println("Troco para " + quantia + ":");

        for (int moeda : moedas) {
            int quantidade = quantia / moeda;
            if (quantidade > 0) {
                System.out.println(quantidade + " moeda(s) de " + moeda);
                quantia %= moeda;
            }
        }

        scanner.close();
    }
}
