package Metodos.Despertador;

public class ConfigDespertador {

    int horario = 9;
    int tomarDespertador = 7;

    void tomar(){
        System.out.println("Despertador: PI PI PI PI PI PI PI PI PI PI PI PI PI PI PI");
    }

    void despertador(){
        if(horario > 1 && horario < 6){
            System.out.println("Dormindo");
        }else if(horario >= 6 && horario < 7){
            System.out.println("Dormindo");
        }else if(horario == tomarDespertador){
            System.out.println("Tocar despertador");
            tomar();
        }else if(horario > 7 && horario < 8){
            System.out.println("Atrasado");
            tomar();
        }else if(horario > 8 && horario < 10){
            System.out.println("Atrasado d+");
            tomar();
            tomar();
            tomar();
            tomar();
        }else{
            System.out.println("Perdeu a hora :(");
        }
    }

     int ativarSoneca(int horario){
        horario += 1;

        System.out.println(horario);

        return horario;
    }
}
