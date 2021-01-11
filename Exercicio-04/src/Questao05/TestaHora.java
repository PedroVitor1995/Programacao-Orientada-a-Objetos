package Questao05;

public class TestaHora {
    public static void main(String[] args) {
        Hora hora = new Hora(10,30,45);

        System.out.println("Horas: "+ hora.getHora());
        System.out.println("Minutos: "+ hora.getMinutos());
        System.out.println("Segundos: "+ hora.getSegundos());
        System.out.println(hora);
    }
}
