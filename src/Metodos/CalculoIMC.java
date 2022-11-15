package Metodos;

public class CalculoIMC {

    public void imc(){
        int peso = 59;
        double altura = 1.74;
        double imc = peso / (altura * altura);

        //System.out.println(imc);

        if(imc < 17){
            System.out.println("Muito abaixo do peso");
        }else if(imc < 18.49){
            System.out.println("Abaixo do peso");
        }else if(imc < 24.99){
            System.out.println("Peso normal");
        }else if(imc < 29.99){
            System.out.println("Acima da peso");
        }else if(imc < 34.99){
            System.out.println("Obesidade I");
        }else if(imc < 39.99){
            System.out.println("Obesidadee II");
        }else{
            System.out.println("Obesidade III");
        }
    }
}
