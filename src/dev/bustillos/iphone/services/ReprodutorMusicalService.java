package dev.bustillos.iphone.services;
import dev.bustillos.iphone.interfaces.ReprodutorMusical;

public class ReprodutorMusicalService implements ReprodutorMusical{
    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }
}
