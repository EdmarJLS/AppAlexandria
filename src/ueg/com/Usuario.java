package ueg.com;

/**
 * Representa um usuário no sistema de biblioteca.
 * <p>
 *     Um usuário é uma pessoa que pode emprestar itens da biblioteca e tem limite de empréstimos ativos que é ontrolado pelo sistema.
 * </p>
 *
 * @author Edmar
 * @since 2026
 * @version 1.0
 */
public class Usuario extends Pessoa
{
    private int numeroEmprestimos;

    /**
     * Construtor para criar ua nova instância de Usuário
     * @param nome
     * @param cpf
     */
    public Usuario(String nome, String cpf)
    {
        super(nome, cpf);
        this.numeroEmprestimos = 0;
    }

    /**
     * Retorna a quantidade atual de empréstimos do usuário.
     * @return numeroEmprestimos
     */
    public int getNumeroEmprestimos()
    {
        return numeroEmprestimos;
    }
    
}
