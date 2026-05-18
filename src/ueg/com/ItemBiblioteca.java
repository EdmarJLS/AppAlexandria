package ueg.com;

/**
 * Interface que define os métodos essenciais para itens que podem ser emprestados e reservados em uma biblioteca.
 *
 * <p>
 *     Implementações desta interface fornecem os mecanismos necessários para manuseio de itens em um sistema de biblioteca,
 *     permitindo operações de <strong>empréstimo, devolução e reserva</strong>.
 *     Esta interface foi projetada para ser utilizada como um contrato para classes de recursos de biblioteca, como livros e revistas.
 * </p>
 *
 * @author Edmar
 * @version 1.0
 * @since 2026
 * @see Livro
 * @see Revista
 */

public interface ItemBiblioteca
{
    /**
     * Verifica se o item está disponível para empréstimo.
     *
     * @return true se o item estiver disponível, false caso contrário.
     */
    boolean isDisponivel();

    /**
     * Marca o item como emprestado. Deve ser chamado quando o item for retirado da biblioteca
     * por um usuário.
     */

    void emprestar();
}
