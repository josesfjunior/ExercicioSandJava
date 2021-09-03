public class TestaCarroCorrida {
    public static void main(String[] args) {
        CarroCorrida ferrari = new CarroCorrida(15, "Junior", "Ferrari", 180);
        ferrari.acelerar(80);
        ferrari.ligar();
        ferrari.mostrarVelocidade();
        ferrari.acelerar(120);
        ferrari.mostrarVelocidade();
        ferrari.freiar(50);
        ferrari.mostrarVelocidade();
        ferrari.acelerar(200);
        ferrari.mostrarVelocidade();
        ferrari.desligar();
        ferrari.parar();
        ferrari.desligar();

    }
}
