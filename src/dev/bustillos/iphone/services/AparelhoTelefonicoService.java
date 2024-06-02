package dev.bustillos.iphone.services;
import dev.bustillos.iphone.interfaces.AparelhoTelefonico;

public class AparelhoTelefonicoService implements AparelhoTelefonico{
    // Interface para o Aparelho Telefônico
    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarConversaVoz() {
        System.out.println("Iniciando conversa por voz...");
    }
}
