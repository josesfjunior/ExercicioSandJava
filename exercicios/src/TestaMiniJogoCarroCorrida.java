import java.util.Locale;
import java.util.Scanner;

public class TestaCarroCorrida {
    public static void main(String[] args) {
        boolean controle = true;
        boolean ligado;
        int escolha;
        int velocimetro;
        Scanner input = new Scanner(System.in);
        CarroCorrida unoMile = new CarroCorrida();
        unoMile.instrucoes();
        System.out.println("Está na hora de começar, ligue o carro! ");
        do {
            System.out.println("\nSua escolha: ");
            escolha = input.nextInt();
            if (escolha == 1) {
                ligado = unoMile.isLigar();
                if (ligado == true) {
                    unoMile.acelerar();
                }
            }
            if (escolha == 2) {
                ligado = unoMile.isLigar();
                if (ligado == true) {
                    unoMile.frear();
                }
            }
            if (escolha == 3) {
                unoMile.ligar();
                ligado = unoMile.isLigar();
                if (ligado == true) {
                    System.out.println("Carro Ligado");
                }
            }
            if (escolha == 4) {
                unoMile.desligar();
                ligado = unoMile.isLigar();
                if (ligado == false) {
                    System.out.println("Carro Desligado");
                }
            }
            if (escolha == 5) {
                unoMile.instrucoes();
            }
            if (escolha == 6) {
                controle = false;
            }
            System.out.println("\n Sua velocidade é: " + unoMile.getVelocidade());
        } while (controle);

        System.out.println("Fim de jogo, obrigado por jogar =)");
    }

}
