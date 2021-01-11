package Questao01;

public class TestaCarro {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        veiculo.placa = "RES2020";
        veiculo.ano = 2020;
        System.out.println(veiculo);
        Carro carro = new Carro();
        carro.placa = "RES2019";
        carro.modelo = "MODEL";
        carro.ano = 2019;
        System.out.println(carro);
        CarroEletrico carroEletrico = new CarroEletrico();
        carroEletrico.placa = "RES2021";
        carroEletrico.modelo = "LEDOM";
        carroEletrico.ano = 2021;
        carroEletrico.autonomiaBateria = 10;
        System.out.println(carroEletrico);
    }
}
