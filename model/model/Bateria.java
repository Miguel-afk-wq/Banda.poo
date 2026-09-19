package model;

public class Bateria extends InstrumentoMusical {

    private int quantidadeTambores;

    public Bateria(String nome, String material, int quantidadeTambores) {
        super(nome, material);
        this.quantidadeTambores = quantidadeTambores;
    }

    @Override
    public String tocar() {
        return "A bateria " + nome + " faz um som grave de batidas ("
                + quantidadeTambores + " tambores).";
    }

    public int getQuantidadeTambores() {
        return quantidadeTambores;
    }
}
