import java.util.Scanner;

public class MiniJogoCarroCorrida {
    Scanner input = new Scanner(System.in);
    private int numeroCarro;
    private String piloto;
    private String equipe;
    private int velocidadeMaxima = 180;
    private int velocidadeMinima = 0;
    private int velocidade;
    private boolean ligar = false;

    public MiniJogoCarroCorrida() {
        System.out.println("\n Digite o nome da sua equipe : ");
        this.equipe = input.nextLine();
        System.out.println("\n Digite o nome do Piloto : ");
        this.piloto = input.nextLine();
        System.out.println("\n Digite o numero do Carro : ");
        this.numeroCarro = input.nextInt();
        velocidade = 0;
    }

    public void instrucoes() {
        System.out.print(" 1 - Acelarar \n 2 - Freiar \n 3 - Ligar \n 4 - Desligar \n 5 - Ajuda \n 6- Sair \n");
    }

    public void ligar() {
        if (this.ligar == false) {
            this.ligar = true;
        }
    }

    public void desligar() {
        if (this.ligar == true) {
            this.ligar = false;
        }
    }

    public void acelerar() {
        if (velocidade == velocidadeMaxima) {
            velocidade = velocidade;
        } else {
            velocidade += 5;
        }
    }

    public void frear() {
        if (velocidade == velocidadeMinima) {
            velocidade = velocidadeMinima;
        } else {
            velocidade -= 5;
        }
    };

    public int getVelocidade() {
        return velocidade;
    }

    public boolean isLigar() {
        return ligar;
    }

}
