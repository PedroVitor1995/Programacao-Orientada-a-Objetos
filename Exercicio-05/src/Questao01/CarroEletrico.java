package Questao01;

public class CarroEletrico extends Carro{
    int autonomiaBateria;

    @Override
    public String toString() {
        return "CarroEletrico{" +
                "modelo='" + modelo + '\'' +
                ", autonomiaBateria=" + autonomiaBateria +
                ", placa='" + placa + '\'' +
                ", ano=" + ano +
                '}';
    }
}
