public abstract class JanelaAbstrata {
    protected JanelaImplementada janela;

    public void desenharJanela(String tipo){
        janela.desenharJanela(tipo);
    }

    public void desenharBotao(String tipo){
        janela.desenharBotao(tipo);
    }

    public abstract void desenhar();
}
