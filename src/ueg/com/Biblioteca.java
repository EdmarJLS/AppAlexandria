package ueg.com;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que gerencia todas as operações e dados
 * referentes à biblioteca.
 * <p>
 *     Inclui o gerenciamento de itens, usuários e funcionários.
 *     Fornece métodos para operar a lógica de empréstimos e
 *     reserva.
 * </p>
 * @see ItemBiblioteca
 * @see Usuario
 * @see Funcionario
 * @author Edmar
 * @since 2026
 * @version 1.0
 */

public class Biblioteca implements Relatorio
{
    private List<ItemBiblioteca> itens;
    private List<Usuario> usuarios;
    private List<Funcionario> funcionarios;

    /**
     * Construtor para inicializar a biblioteca
     */
    public Biblioteca()
    {
        this.itens = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    /**
     * Adicionar um novo item ao inventário da
     * biblioteca
     * @param item - item a ser adicionado
     */
    public void adicionarItem(ItemBiblioteca item)
    {
        itens.add(item);
    }

    /**
     * Cadastra um novo usuário na Biblioteca
     * @param usuario - novo registro de usuário.
     */
    public void cadastrarUsuario(Usuario usuario)
    {
        usuarios.add(usuario);
    }

    /**
     * Cadastra um novo funcionário na Biblioteca
     * @param funcionario - novo registro de usuário.
     */
    public void cadastrarFuncionario(Funcionario funcionario)
    {
        funcionarios.add(funcionario);
    }

    public String emprestarItem(String titulo, String cpf)
    {
        for(ItemBiblioteca item: itens)
        {
            if( ((item instanceof Livro) && ( (Livro) item).equals(titulo) ) ||
            ( (item instanceof Revista) && ( (Revista) item).getTitulo().equals(titulo) ))
            {

            }
        }
    }
    @Override
    public void geraRelatorio()
    {
    }
}
