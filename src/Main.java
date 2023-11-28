import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Jogo da Adivinhação");
        System.out.println("Tente adivinhar o número entre 0 e 10");
        int number = new Random().nextInt(10);
        int num;
        int tentativa = 0;

        while (tentativa < 5) {
            System.out.print("Digite um número de 1 a 10: ");
            num = sc.nextInt();
            tentativa++;
            if (num == number) {
                break;
            }
        }
        if (tentativa >= 5) {
            System.out.println("Excedeu o número máximo de tentativas.");
        } else {
            System.out.printf("Parabéns! Você acertou o número %d em %d tentativa(s)!", number, tentativa);
        }

        sc.close();
    }
}