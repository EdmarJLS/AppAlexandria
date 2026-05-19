package ueg.com;

/**
 * Classe abstrata que representa uma pessoa dentro do sistema
 * de biblioteca
 * <strong>
 *     Fornece uma base comum para detalhamento de pessoas
 *     específicas no contexto da biblioteca, incluindo
 *     usuários e funcionários.
 * </strong>
 * @author Edmar
 * @since 2026
 * @version 1.0
 * @see Usuario
 * @see Funcionario
 */
public abstract class Pessoa
{
    private String nome;
    private String cpf;

    /**
     * Construtor para criar uma nova instância de Pessoa.
     * @param nome - nome da Pessoa
     * @param cpf - CPF da Pessoa
     */
    public Pessoa(String nome, String cpf)
    {
        this.nome = nome;
        this.cpf = cpf;
    }

    /**
     * Retorna o nome da Pessoa
     * @return nome
     */
    public String getNome()
    {
        return nome;
    }

    /**
     * Retorna o CPF da Pessoa
     * @return cpf
     */
    public String getCpf()
    {
        return cpf;
    }

    public String toString()
    {
        return "Pessoa [nome: "+nome+", CPF: "+cpf+"]";
    }
}
