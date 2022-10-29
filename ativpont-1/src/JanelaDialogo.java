public class JanelaDialogo extends JanelaAbstrata{

    @Override
    public void desenhar() {
        desenharJanela("");
        desenharBotao("");
    }
    
    public JanelaDialogo(JanelaImplementada janela){
        this.janela = janela;
    }

}
