package app;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void satus(){
        System.out.println("Cor da caneta é: " + this.cor);
        System.out.println("A ponta da caneta é: "+this.ponta);
        System.out.println("A caneta está tampada? " + this.tampada);
        System.out.println("A carga é de: "+ this.carga);
        System.out.println("O modelo da caneta é: " + this.modelo);

    }
    void rabiscar(){
        if (this.tampada){
            System.out.println("Não pode rabiscar");
        }else
            System.out.println("Pode Rabiscar");
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }

}
