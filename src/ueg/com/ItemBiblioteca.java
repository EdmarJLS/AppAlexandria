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

    /**
     * Marca o item como devolvido. Deve ser chamado quando o item for retirado da biblioteca
     * por um usuário.
     */
    void devolver();

    /**
     * Verifica se o item está atualmente reservado.
     *
     * @return true se estiver reservado, falso caso contrário.
     */
    boolean isReservado();

    /**
     * Reserva o item para um usuário que deseja retirá-lo no futuro.
     * Deve ser usado apenas se o item não estiver disponível para
     * empréstimo no momento.
     */

    void reservar();

    /**
     * Cancela a reserva do item, tornando-o disponível para outros
     * usuários reservarem ou pegarem emprestado.
     */
    void cancelarReserva();
}
