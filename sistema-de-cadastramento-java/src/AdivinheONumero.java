import java.util.Random;
import java.util.Scanner;

public class AdivinheONumero {
    public static void main(String[] args){
        Scanner numero = new Scanner(System.in);
        Random random = new Random();
        int numeroUmACem = random.nextInt(100);
        int chances = 4;


        int i;
        for (i = 0; i < 5; i++) {
            System.out.println("Digite um número de 1 a 100");
            int chute = numero.nextInt();
            if (chute > numeroUmACem) {
                System.out.println("O número certo é menor que este!");

            } else if (chute < numeroUmACem) {
                System.out.println("O número certo é maior que este!");
            } else if (chute == numeroUmACem) {
                System.out.println("parabéns! você acertou o número!");
                break;
            }

            System.out.println("você tem " + chances-- + " tentativas");
        }
        if (i == 5) {
            System.out.println("Infelizmente você não descobriu, o número era " + numeroUmACem + "! tente novamente!");
        }

    }
}
