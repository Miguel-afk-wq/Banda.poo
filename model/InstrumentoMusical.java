package model;

/**
 * Classe abstrata que representa qualquer instrumento musical da banda.
 * Nao pode ser instanciada diretamente: garante que todo instrumento
 * criado seja de um tipo concreto especifico (Violao, Bateria, etc).
 */
public abstract class InstrumentoMusical {

    protected String nome;
    protected String material;
    protected boolean afinado;

    public InstrumentoMusical(String nome, String material) {
        this.nome = nome;
        this.material = material;
        this.afinado = false;
    }

    public abstract String tocar();

    public void afinar() {
        this.afinado = true;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome
                + " | Material: " + material
                + " | Afinado: " + (afinado ? "sim" : "nao"));
    }

    public String getNome() {
        return nome;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isAfinado() {
        return afinado;
    }
}
