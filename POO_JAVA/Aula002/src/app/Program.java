package app;

public class Program {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 90;
        c1.modelo = "Bic";

        c1.destampar();
        c1.rabiscar();
        c1.satus();

        Caneta c2 = new Caneta();

        c2.cor = "Preto";
        c2.ponta = 1.0f;
        c2.carga = 80;
        c2.modelo = "Meu";

        c2.tampar();
        c2.rabiscar();
        c2.satus();

    }
}
