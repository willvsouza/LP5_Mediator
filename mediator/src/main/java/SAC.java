public class SAC {

    private static SAC instancia = new SAC();
    private SAC() {}

    public static SAC getInstancia() {
        return instancia;
    }

    public String solicitarSuporteTecnico(String mensagem) {
        return "O SAC agradece seu contato.\n"+
                "O Depto da TI respondeu sua solicitação conforme mensagem a seguir.\n" +
                ">>" + TI.getInstancia().receberSocilitacaoDeSuporte(mensagem);
    }

    public String ElogiarAtendimentoTI(String mensagem) {
        return "O SAC agradece seu contato.\n"+
                "O Depto da TI respondeu sua solicitação conforme mensagem a seguir.\n" +
                ">>" + TI.getInstancia().receberElogio(mensagem);
    }

    public String sugerirMelhoriaTI(String mensagem) {
        return "O SAC agradece seu contato.\n"+
                "O Depto da TI respondeu sua solicitação conforme mensagem a seguir.\n" +
                ">>" + TI.getInstancia().receberSugestao(mensagem);
    }

}
