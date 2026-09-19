package app;

import model.Bateria;
import model.InstrumentoMusical;
import model.Violao;

import java.util.ArrayList;
import java.util.List;

public class TesteBanda {

    public static void main(String[] args) {

        Violao violao = new Violao("Violao da banda", "madeira", 6);
        Bateria bateria = new Bateria("Bateria da banda", "metal", 5);

        List<InstrumentoMusical> instrumentos = new ArrayList<>();
        instrumentos.add(violao);
        instrumentos.add(bateria);

        for (InstrumentoMusical instrumento : instrumentos) {
            instrumento.afinar();
            System.out.println(instrumento.tocar());
        }

        int contadorAfinados = 0;
        for (InstrumentoMusical instrumento : instrumentos) {
            if (instrumento.isAfinado()) {
                contadorAfinados++;
            }
        }
        System.out.println("Instrumentos afinados: " + contadorAfinados
                + " de " + instrumentos.size());

        // new InstrumentoMusical("x", "y") NAO compila porque
        // InstrumentoMusical e uma classe abstrata (declarada com
        // "abstract"). Classes abstratas nao podem ser instanciadas
        // diretamente com "new" -- so servem como molde para as
        // subclasses concretas (Violao, Bateria).
    }
}
