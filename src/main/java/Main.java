
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i, contador = 0, maior = 0, numero, posicao = 0;

        for (i = 1; i <= 5; i++) {
            numero = scanner.nextInt();
            contador++;
            if (numero > maior) {
                maior = numero;
                posicao = contador;
            }

        }
        System.out.println(posicao);
        System.out.println(maior);
    }
}
