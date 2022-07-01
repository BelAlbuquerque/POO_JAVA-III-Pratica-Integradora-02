package appGaragem;

public class appGaragem {
    public static void main(String[] args) {

        Garagem garagem = new Garagem(01);
        Veiculo v1 = new Veiculo("fit", "honda", 30000);
        Veiculo v2 = new Veiculo("fit2", "honda2", 30002);
        Veiculo v3 = new Veiculo("fit5", "honda5", 300005);
        Veiculo v4 = new Veiculo("fit8", "honda8", 300008);

        garagem.entradaDeVeiculo(v1);
        garagem.entradaDeVeiculo(v2);
        garagem.entradaDeVeiculo(v3);
        garagem.entradaDeVeiculo(v4);

        garagem.getVeiculos();
        garagem.saidaDeVeiculo(v3);
        garagem.getVeiculos();

    }
}
