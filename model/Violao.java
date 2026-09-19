package model;

public class Violao extends InstrumentoMusical {

    private int quantidadeCordas;

    public Violao(String nome, String material, int quantidadeCordas) {
        super(nome, material);
        this.quantidadeCordas = quantidadeCordas;
    }

    @Override
    public String tocar() {
        return "O violao " + nome + " solta um som de cordas dedilhadas ("
                + quantidadeCordas + " cordas).";
    }

    public int getQuantidadeCordas() {
        return quantidadeCordas;
    }
}
