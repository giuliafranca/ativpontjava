public abstract class JanelaAbstrata {
    protected JanelaImplementada janela;

    public void desenharJanela(String tipo){
        System.out.println(tipo); //exemplo
    }

    public void desenharBotao(String tipo){
        
    }

    public abstract void desenhar();
}
