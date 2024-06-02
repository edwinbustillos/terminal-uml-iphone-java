import dev.bustillos.iphone.models.Aparelho;
import dev.bustillos.iphone.models.Musica;
import dev.bustillos.iphone.models.Navegador;

public class iPhone {
    public static void main(String[] args) throws Exception {
        System.out.println("Iphone");
        Aparelho aparelho = new Aparelho();
        aparelho.ligar();
        aparelho.atender();
        aparelho.iniciarConversaVoz();

        System.out.println("Reprodutor Musical");
        Musica musica = new Musica();
        musica.tocar();
        musica.pausar();
        musica.selecionarMusica();
        
        System.out.println("Navegador Internet");
        Navegador navegador = new Navegador();
        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
        
    }
}
