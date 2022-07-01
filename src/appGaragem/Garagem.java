package appGaragem;

import java.util.ArrayList;
import java.util.List;

public class Garagem {
    private int id;
    private List<Veiculo> veiculos = new ArrayList<Veiculo>();

    public Garagem(int id) {
        this.id = id;
    }

    public Garagem(int id, List<Veiculo> veiculos) {
        this.id = id;
        this.veiculos = veiculos;
    }

    public int getId() {
        return id;
    }

    public List<Veiculo> getVeiculos() {
        veiculos.stream().forEach(v-> System.out.println(v.getMarca()));
        return veiculos;
    }

    public void entradaDeVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void saidaDeVeiculo(Veiculo veiculo) {
        veiculos.remove(veiculo);
    }
}
