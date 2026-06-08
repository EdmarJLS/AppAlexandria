package ueg.com;

/**
 * Classe principal para execução do sistema de biblioteca.
 * <p>
 *     Esta classe simula interações no sistema de biblioteca,
 *     como cadastro de itens e usuários, empréstimos e devoluções de itens. Gera relatórios.
 * </p>
 */
public class Main
{
    public static void main(String[] args)
    {
        Biblioteca biblioteca = new Biblioteca();

        // Criar os itens da biblioteca
        Livro livro1 = new Livro("Senhor dos Anéis", "Tolken", "01");

        Revista revista1 = new Revista("Forbes", 26);

        // Adicionar os itens a bilbioteca

        biblioteca.adicionarItem(livro1);
        biblioteca.adicionarItem(revista1);

        // Criar os usuários
        Usuario usuario1 = new Usuario("João da Silva", "12345678901");

        // Criar os funcionários
        Funcionario funcionario1 = new Funcionario("Maria Ferreira", "12345678902", "Bibliotecaria");

        // Registrar usuário e funcionário
        biblioteca.cadastrarFuncionario(funcionario1);
        biblioteca.cadastrarUsuario(usuario1);

    }
}
