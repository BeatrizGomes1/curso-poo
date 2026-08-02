package entities_lista_de_arraylist;

public class Carro {

    private String placa;
    private String modelo;
    private int quilometragem;

    public Carro(String placa, String modelo, int quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.quilometragem = quilometragem;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void attKm (int km){
        quilometragem += km;
    }

    @Override
    public String toString(){
        return "Placa: " + placa + " | " + "Modelo: " + modelo + " | " + "Km: " + quilometragem;
    }
}
