import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~ Bem vindo ao jogo de adivinhação! ~~~~~~~~~");
        System.out.println("--> Tente adivinhar o número secreto em até 5 tentativas!");
        System.out.println("~~~~~~~~~~~~~~~ Boa sorte! ~~~~~~~~~~~~~~~");

        int numeroAleatorio = new Random().nextInt(100);
        System.out.println(numeroAleatorio);
        Scanner chute = new Scanner(System.in);

        for (int tentativas = 1; tentativas < 6; tentativas++) {
            int tentativa;
            String mensagem = "Digite a tentativa N° " + tentativas + ":";
            System.out.println(mensagem);
            tentativa = chute.nextInt();

            if(tentativa == numeroAleatorio){
                System.out.println("~~~~~~~~~~~~ Parabens! ~~~~~~~~~~~~");
                System.out.println("~~~~~~ Você acertou o número secreto! ~~~~~~");
                System.out.println("~~~~~~~~~~~~ Na "+ tentativas + "° Tentativa! ~~~~~~~~~~~~");
                break;
            } else if (tentativas == 5) {
                System.out.println("~~~~~~ Você esgotou as tentativas! ~~~~~~");
                System.out.println(" :( ");
                System.out.println("~~~~~~ Tente novamente! ~~~~~~");
                break;
            } else if (tentativa > numeroAleatorio){
                System.out.println("~~~~~~~~~~~~ O número secreto é menor! ~~~~~~~~~~~~");
            } else {
                System.out.println("~~~~~~~~~~~~ O número secreto é maior! ~~~~~~~~~~~~");
            }


        }

    }
}