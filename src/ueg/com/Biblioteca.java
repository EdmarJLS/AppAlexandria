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

    /**
     * Método para emprestar um item para um usuário ou funcionário mediante CPF. Se o usuário for um funcionário, não há limite de empréstimos.
     *
     * @param titulo - do item
     * @param cpf - do usuário
     * @return - Retorna mensagem de sucesso ou falha.
     */
    public String emprestarItem(String titulo, String cpf)
    {
        for(ItemBiblioteca item: itens)
        {
            // Se ( (item atual é uma instância de Livro) e  titulo do item atual é igual ao titulo informado) OU
            // Se ( (item atual é uma instância de Revista) e  titulo do item atual é igual ao titulo informado)
            if( ((item instanceof Livro) && ( (Livro) item).getTitulo().equals(titulo) ) || ( (item instanceof Revista) && ( (Revista) item).getTitulo().equals(titulo) ))
            {
                if(item.isDisponivel())
                {
                    for(Funcionario funcionario : funcionarios)
                    {
                        if(funcionario.getCpf().equals(cpf))
                        {
                            item.emprestar();
                            return "Item emprestado com sucesso ao funcionário " + funcionario.getNome();
                        }
                    }

                    for(Usuario usuario : usuarios)
                    {
                        if(usuario.getCpf().equals(cpf))
                        {
                            if(usuario.getNumeroEmprestimos() < 3)
                            {
                                item.emprestar();
                                usuario.incrementaEmprestimos();
                                return "Item emprestado com sucesso ao usuário " + usuario.getNome();
                            } else
                            {
                                return "Usuário já atingiu o limite de 3 empréstimos.";
                            }
                        }
                    }
                    return "Usuário não encontrado";
                }
            }
        }
        return "Nenhum item disponível";
    }

    /**
     * Método para devolver um item emprestado para a Biblioteca. Se o usuário não for um funcionário, decrementa o número de empréstimos.
     * @param titulo - título do item
     * @param cpf - cpf do usuário
     * @return - mensagem de sucesso ou falha.
     */
    public String devolverItem(String titulo, String cpf)
    {
        for(ItemBiblioteca item : itens)
        {
            if( (item instanceof Livro) && ( (Livro) item).getTitulo().equals(titulo) || (item instanceof Revista) && ( (Revista) item).getTitulo().equals(titulo))
            {
                if(!item.isDisponivel())
                {
                    item.devolver();

                    for(Usuario usuario : usuarios)
                    {
                        if(usuario.getNome().equals(cpf))
                        {
                            usuario.decrementaEmprestimos();
                        }
                    }
                    return "Item devolvido com sucesso!";

                }
                return "Item não está emprestado!";

            }
        }
        return "Item não encontrado";
    }

    /**
     * Reserva um item para um usuário mediante o CPF'
     * @param titulo
     * @param cpf
     * @return
     */
    public String reservarItem(String titulo, String cpf){
        for(ItemBiblioteca item : itens ){
            if( ((item instanceof Livro) &&
                    ((Livro) item).getTitulo().equals(titulo)) ||
                    ((item instanceof Revista) &&
                            ((Revista) item).getTitulo().equals(titulo))){
                if (item.isDisponivel() && !item.isReservado()){
                    item.reservar();
                    return "Item reservado com sucesso.";
                }
                return "Item já está reservado ou indisponível.";
            }
        }
        return "Item não encontrado.";
    }

    /**
     * Cancela a reserva de um item
     * @param titulo
     */
    public void cancelarReserva(String titulo){
        for(ItemBiblioteca item : itens){
            if ( ((item instanceof Livro) &&
                    ((Livro) item).getTitulo().equals(titulo)) ||
                    ((item instanceof Revista) &&
                            ((Revista) item).getTitulo().equals(titulo))){
                if(item.isDisponivel()){
                    item.cancelaReserva();
                    System.out.println("Reserva cancelado com sucesso");
                    return;
                }
                System.out.println("Item não está reservado");
                return;
            }
        }
        System.out.println("Item não encontrado");
    }

    /**
     * Gera um relatório de todos os itens da biblioteca,
     * mostrando seu estado atual.
     * <p>
     *     Implementa a interface {@code Relatorio}
     * </p>
     */

    @Override
    public void geraRelatorio()
    {
        System.out.println("Relatório de Itens");
        for(ItemBiblioteca item : itens){
            System.out.println(item.toString());
        }

    }
}
