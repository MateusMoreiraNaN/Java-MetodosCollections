package Jogo;

public class Steam {
    public static void main(String[] args) {
        Pessoa Meunome = new Pessoa("Mateus2000", 100.00);

        Jogo Jogo1 = new Jogo("Cave Story", 5.55);
        Jogo Jogo2 = new Jogo("Hollow Knight", 45.50);
        Jogo Jogo3 = new Jogo("Minecraft", 31.17);
        Jogo Jogo4 = new Jogo("Subnautica", 21.45);
        Jogo Jogo5 = new Jogo("Limbo", 15.00);

        System.out.println("Carteira Steam: "+Meunome.TenhoNoBolso);
        double Jogo1P = Meunome.TenhoNoBolso -= Jogo1.PriceGame;
        if(Jogo1P >= Jogo1.PriceGame){
            System.out.println(" ");
            System.out.println("Usuario logado: " + Meunome.name);
            System.out.println("Nome ddo Jogo: " + Jogo1.NameGame + "," + "Preço: " + Jogo1.PriceGame + " Comprado.");
            System.out.println("Carteira Steam: "+Meunome.TenhoNoBolso);
            System.out.println(" ");
        }else if(Jogo1P <= Jogo1.PriceGame){

            System.out.println("Usuario logado: " + Meunome.name);
            System.out.println("Nome do Jogo: " + Jogo1.NameGame + "," + "Preço: " + Jogo1.PriceGame + " Compra Negada.");
            System.out.println(" ");
        }
        double Jogo2P = Meunome.TenhoNoBolso -= Jogo2.PriceGame;
        if(Jogo2P >= Jogo2.PriceGame){
            System.out.println("Usuario logado: " + Meunome.name);
            System.out.println("Nome do Jogo: " + Jogo2.NameGame + "," + "Preço: " + Jogo2.PriceGame + " Comprado.");
            System.out.println("Carteira Steam: "+Meunome.TenhoNoBolso);
            System.out.println(" ");
        }else if(Jogo2P <= Jogo2.PriceGame){
            System.out.println("Usuario logado: " + Meunome.name);
            System.out.println("Nome do Jogo: " + Jogo2.NameGame + "," + "Preço: " + Jogo2.PriceGame + " Compra Negada.");
            System.out.println(" ");
        }
        double Jogo3P = Meunome.TenhoNoBolso -= Jogo3.PriceGame;
        if(Jogo3P >= Jogo3.PriceGame){
            System.out.println("Usuario logado: " + Meunome.name);
            System.out.println("Nome do Jogo: " + Jogo3.NameGame + "," + "Preço: " + Jogo3.PriceGame + " Comprado.");
            System.out.println("Carteira Steam: "+Meunome.TenhoNoBolso);
            System.out.println(" ");
        }else if(Jogo3P <= Jogo3.PriceGame){
            System.out.println("Usuario logado: " + Meunome.name);
            System.out.println("Nome do Jogo: " + Jogo3.NameGame + "," + "Preço: " + Jogo3.PriceGame + " Compra Negada.");
            System.out.println(" ");
        }
        double Jogo4P = Meunome.TenhoNoBolso -= Jogo4.PriceGame;
        if(Jogo4P >= Jogo4.PriceGame){
            System.out.println("Usuario logado: " + Meunome.name);
            System.out.println("Nome do Jogo: " + Jogo4.NameGame + "," + "Preço: " + Jogo4.PriceGame + " Comprado.");
            System.out.println("Carteira Steam: "+Meunome.TenhoNoBolso);
            System.out.println(" ");
        }else if(Jogo4P <= Jogo4.PriceGame){
            System.out.println("Usuario logado: " + Meunome.name);
            System.out.println("Nome do Jogo: " + Jogo4.NameGame + "," + "Preço: " + Jogo4.PriceGame + " Compra Negada.");
            System.out.println(" ");
        }
        double Jogo5P = Meunome.TenhoNoBolso -= Jogo5.PriceGame;
        if(Jogo5P >= Jogo5.PriceGame){
            System.out.println("Usuario logado: " + Meunome.name);
            System.out.println("Nome do Jogo: " + Jogo5.NameGame + "," + "Preço: " + Jogo5.PriceGame + " Comprado.");
            System.out.println("Carteira Steam: "+Meunome.TenhoNoBolso);
            System.out.println(" ");
        }else if(Jogo5P <= Jogo5.PriceGame){
            System.out.println("Usuario logado: " + Meunome.name);
            System.out.println("Nome do Jogo: " + Jogo5.NameGame + "," + "Preço: " + Jogo5.PriceGame + " Compra Negada.");
            System.out.println(" ");
        }




    }
}
