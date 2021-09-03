import java.util.Scanner;

public class CarroCorrida {
    Scanner input = new Scanner(System.in);
    private int numeroCarro;
    private String piloto;
    private String equipe;
    private float velocidadeMaxima;
    private float velocidadeMinima = 0;
    private float velocidade;
    private boolean ligar = false;

    public CarroCorrida(int numeroCarro, String piloto, String equipe, float velocidadeMaxima) {
        this.numeroCarro = numeroCarro;
        this.piloto = piloto;
        this.equipe = equipe;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public void acelerar (float acelerar){
       if(this.ligar == true){
          if(acelerar <= this.velocidadeMaxima){
              this.velocidade += acelerar;
          }else {
              this.velocidade = this.velocidadeMaxima;
          }

       }else{
           System.out.println("\nNão pode acelerar com o carro desligado");
       }
    };
    public void freiar(float frenagem){
        float porcentagemDeFrenage = this.velocidade * (frenagem/100)  ;
      if(this.ligar == true){
          if(this.velocidade == this.velocidadeMinima){
            this.velocidade = this.velocidade;
          } else {
              this.velocidade -= porcentagemDeFrenage;
          }
      }else {
          System.out.println("\nNão pode frear com o carro desligado");
      }
    };
    public void parar (){
        this.velocidade = this.velocidadeMinima;
    }
    public void ligar(){
        if(this.ligar == true){
            System.out.println("\nO carro já está ligado");
        } else
            this.ligar = true;
    }
    public void desligar(){
       if(this.velocidade == this.velocidadeMinima){
           if(this.ligar == false){
               System.out.println("\nO carro já está desligado");
           } else{
               this.ligar = false;
               System.out.println("\nCarro desligado");
           }
       } else {
           System.out.println("\nVocê não pode desligar com o carro em movimento");
       }
       };
    public void mostrarVelocidade(){
        System.out.printf("\nVoce está em %.2f KM/H", this.velocidade );
    }
}

