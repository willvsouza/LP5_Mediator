public class Cliente extends Usuario {

    public String solicitarSuporteTecnico(String mensagem) {
        return SAC.getInstancia().solicitarSuporteTecnico(mensagem);
    }

    public String ElogiarAtendimentoTI(String mensagem) {
        return SAC.getInstancia().ElogiarAtendimentoTI(mensagem);
    }

    public String sugerirMelhoriaTI(String mensagem) {
        return SAC.getInstancia().sugerirMelhoriaTI(mensagem);
    }

}
