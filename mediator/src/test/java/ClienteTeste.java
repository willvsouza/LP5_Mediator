import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTeste {

    @Test
    void deveSolicitarSuporteTecnicoTI() {
        Cliente cliente = new Cliente();
        assertEquals("O SAC agradece seu contato.\nO Depto da TI respondeu sua solicitação conforme mensagem a seguir.\n" +
                        ">>Um atendente será designado para lhe prover suporte técnico referente ao problema descrito: Não consigo ativar a licença do Kasperky",
                cliente.solicitarSuporteTecnico("Não consigo ativar a licença do Kasperky"));
    }

    @Test
    void deveElogiarTI() {
        Cliente cliente = new Cliente();
        assertEquals("O SAC agradece seu contato.\nO Depto da TI respondeu sua solicitação conforme mensagem a seguir.\n" +
                        ">>Toda a equipe da TI agradece a mensagem: Equipe muito prestativa",
                cliente.ElogiarAtendimentoTI("Equipe muito prestativa"));
    }

    @Test
    void deveSugerirMelhoriaTI() {
        Cliente cliente = new Cliente();
        assertEquals("O SAC agradece seu contato.\nO Depto da TI respondeu sua solicitação conforme mensagem a seguir.\n" +
                        ">>A TI vai analisar a sugestão de melhoria: Ampliar horário de atendimento",
                cliente.sugerirMelhoriaTI("Ampliar horário de atendimento"));
    }

}