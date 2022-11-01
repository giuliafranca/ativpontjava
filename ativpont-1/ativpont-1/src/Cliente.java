public class Cliente {
    public static void main(String[] args) throws Exception {
        String sistema = "Windows";
        String sistema1 = "Linux"; 

        JanelaWindows janela1 = new JanelaWindows(sistema);
        JanelaAviso ja = new JanelaAviso(janela1);
        ja.desenhar();

        JanelaLinux janela2 = new JanelaLinux(sistema1);
        JanelaDialogo jd = new JanelaDialogo(janela2);
        jd.desenhar();
    }
}
