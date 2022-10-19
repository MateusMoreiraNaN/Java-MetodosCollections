package Jogo;

public class Steam {
    public static void main(String[] args) {
        Pessoa Meunome = new Pessoa("Mateus");

        Jogo Jogo1 = new Jogo("Hollow Knight", 45.50);
        Jogo Jogo2 = new Jogo("Minecraft", 31.17);

        System.out.println("O " + Meunome.name + " Tem um novo jogo na bibliteca: " + Jogo1.NameGame + "|" + "R$" + Jogo1.PriceGame);
        System.out.println("O " + Meunome.name + " Tem um novo jogo na bibliteca: " + Jogo2.NameGame + "|" + "R$" + Jogo2.PriceGame);

    }
}
