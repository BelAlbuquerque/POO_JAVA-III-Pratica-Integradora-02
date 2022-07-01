package appGaragem;

public class Veiculo {
    private String modelo;
    private String marca;
    private double preço;

    public Veiculo(String modelo, String marca, double preço) {
        this.modelo = modelo;
        this.marca = marca;
        this.preço = preço;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreço() {
        return preço;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }
}
