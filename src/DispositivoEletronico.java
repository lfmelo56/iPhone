public abstract class DispositivoEletronico {
    protected String modelo;
    protected int capacidadeBateria;

    public DispositivoEletronico(String modelo, int capacidadeBateria) {
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
    }

    public void ligar() {
        System.out.println(modelo + " está ligando...");
    }

    public void desligar() {
        System.out.println(modelo + " está desligando...");
    }

    public abstract void exibirInformacoes();
}