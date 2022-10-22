package Carro;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro(4, 4);

        System.out.println("Rodas: " + carro.getRodas() + " " + "Portas: " + carro.getPortas());
        //System.out.println(carro.getPortas());

        Carro carro2 = new Carro(12, 8);

        System.out.println("Rodas: " + carro2.getRodas());
        System.out.println("Portas: " + carro2.getPortas());


    }
}
