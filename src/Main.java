public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone("iPhone 14 Pro", 5000, "iOS 16");

        meuIphone.ligar();
        meuIphone.exibirInformacoes();

        // Testando funções do ReprodutorMusical
        meuIphone.tocarMusica("Escape - Renascer Praise");
        meuIphone.pausarMusica();
        meuIphone.selecionarMusica("Metade de Mim - Rosa de Saron");

        // Testando funções do AparelhoTelefonico
        meuIphone.ligar("+5571993994170");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando funções do NavegadorInternet
        meuIphone.exibirPagina("https://www.instagram.com");
        meuIphone.adicionarNovaAba("https://www.google.com/");
        meuIphone.atualizarPagina();

        meuIphone.desligar();
    }
}
