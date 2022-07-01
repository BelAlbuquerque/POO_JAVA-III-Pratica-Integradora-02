package appGaragem;

import java.util.ArrayList;
import java.util.Collections;

public class appGaragem {
    public static void main(String[] args) {

        Garagem garagem = new Garagem(01);
        Veiculo v1 = new Veiculo("Ford", "Fiesta", 1000);
        Veiculo v2 = new Veiculo("Ford", "Focus", 1200);
        Veiculo v3 = new Veiculo("Ford", "Explorer", 2500);
        Veiculo v4 = new Veiculo("Fiat", "Uno", 500);
        Veiculo v5 = new Veiculo("Fiat", "Cronos", 1000);
        Veiculo v6 = new Veiculo("Fiat", "Torino", 1250);
        Veiculo v7 = new Veiculo("Chevrolet", "Aveo", 1250);
        Veiculo v8 = new Veiculo("Chevrolet", "Spin", 2500);
        Veiculo v9 = new Veiculo("Toyota", "Corola", 1200);
        Veiculo v10 = new Veiculo("Toyota", "Fortuner", 3000);
        Veiculo v11 = new Veiculo("Renault", "Logan", 950);
        ArrayList<Veiculo> listaDeCarros = new ArrayList<Veiculo>();
        Collections.addAll(listaDeCarros, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11);

        System.out.println("----------------Garagem 01--------------");

        garagem.entradaDeVeiculo(v1);
        garagem.entradaDeVeiculo(v2);
        garagem.entradaDeVeiculo(v3);
        garagem.entradaDeVeiculo(v4);
        garagem.getVeiculos();

        System.out.println("---Ford Explorer deixa a garagem ---");

        garagem.saidaDeVeiculo(v3);
        garagem.getVeiculos();

        System.out.println("----------------Garagem 02--------------");
        Garagem garagem2 = new Garagem(02, listaDeCarros);
        garagem2.getVeiculos();

    }
}
