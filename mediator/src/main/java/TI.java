public class TI implements Departamento {

    private static TI instancia = new TI();
    private TI() {}

    public static TI getInstancia() {
        return instancia;
    }

    public String receberSocilitacaoDeSuporte(String mensagem) {
        return "Um atendente será designado para lhe prover suporte técnico referente ao problema descrito: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "Toda a equipe da TI agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "A TI vai analisar a sugestão de melhoria: " + mensagem;
    }

}
