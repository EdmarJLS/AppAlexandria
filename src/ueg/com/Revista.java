package ueg.com;

/**
 * Classe que representa uma revista no sistema de biblioteca
 * <p>
 *     Uma revista contém informações como título, edição e seu estado atual de disponibilidade e reserva.
 *     Ela implementa a interface {@code ItemBiblioteca} para permitir operações de empréstimos e reserva.
 * </p>
 */
public class Revista implements ItemBiblioteca
{
    private String titulo;
    private int edicao;
    private boolean disponivel;
    private boolean reservado;

    
}
