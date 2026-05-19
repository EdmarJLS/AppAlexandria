package ueg.com;

/**
 * Classe que representa um funcionário no sistema de biblioteca
 * <p>
 *     Um funcionário é uma pessoa responsável pela administração
 *     da biblioteca e possui autoridade para executar ações
 *     adicionais dentro do sistema.
 * </p>
 * @author Edmar
 * @since 2026
 * @version 1.0
 * @see Pessoa
 */
public class Funcionario extends Pessoa
{
    private String cargo;

    /**
     * Construtor para criar uma nova instância de Funcionário
     * @param nome - nome do Funcionário
     * @param cpf - CPF do Funcionário
     * @param cargo - cargo do Funcionário
     */
    public Funcionario(String nome, String cpf, String cargo)
    {
        super(nome, cpf);
        this.cargo = cargo;
    }

    /**
     * Retorna o cargo do funcionário
     * @return cargo
     */
    public String getCargo()
    {
        return cargo;
    }
}
