
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {


    public void ligar(String numero) {
        System.out.println("ligando");
    }

    public void atender(String numero) {
    	System.out.println("atendeu");
    }

    public void iniciarCorreioVoz(String mensagem, String destinatario) {
    	System.out.println("iniciando correio de voz");
    }

    public void exibirPagina(String url) {
    	System.out.println("clicando na url destino");
    }

    public void adicionarNovaAba(String url) {
    	System.out.println("adionando nova aba de navegação");
    }

    public void atualizarPagina() {
    	System.out.println("atualizando pagina");
    }

    public void tocar() {
    	System.out.println("tocando musica");
    }

    public void pausar() {
    	System.out.println("pausando música");
    }

    public void selecionarMusica() {
    	System.out.println("selecioando");
    }
}    