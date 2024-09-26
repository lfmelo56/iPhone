public class iPhone extends DispositivoEletronico implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String sistemaOperacional;

    public iPhone(String modelo, int capacidadeBateria, String sistemaOperacional) {
        super(modelo, capacidadeBateria);
        this.sistemaOperacional = sistemaOperacional;
    }

    // Métodos do ReprodutorMusical
    public void tocarMusica(String musica) {
        System.out.println("Tocando a música: " + musica);
    }

    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    // Métodos do AparelhoTelefonico
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo a ligação...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Métodos do NavegadorInternet
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba(String url) {
        System.out.println("Abrindo nova aba com a página: " + url);
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    // Métodos do DispositivoEletronico
    public void exibirInformacoes() {
        System.out.println("iPhone Modelo: " + modelo + ", Bateria: " + capacidadeBateria + "mAh, Sistema: " + sistemaOperacional);
    }
}