package ueg.com;

/**
 * Classe que representa uma instância de um livro no sistema de biblioteca
 * <p>
 *     Um livro contém informações essenciais como título, autor, ISBN e seu estado atual de disponibilidade e reserva. Ela implementa a interface {@code ItemBiblioteca} para permitir operações de empréstimos e reserva.
 * </p>
 *
 * @author Edmar
 * @since 2026
 * @version 1.0
 */
public class Livro implements ItemBiblioteca
{
    private String titulo, autor, isbn;
    private int edicao;
    private boolean disponivel, reservado;

    /**
     * Construtor para criar uma nova instância de livros
     * @param titulo do livro
     * @param edicao do livro
     * @param autor do livro
     * @param isbn do livro
     */
    public Livro(String titulo, String autor, String isbn, int edicao)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.edicao = edicao;
        this.disponivel = true;
        this.reservado = false;
    }

    /**
     * Retorna o título da revista
     * @return titulo
     */
    public String getTitulo()
    {
        return titulo;
    }

    /**
     * Retorna a edição da revista
     * @return edicao
     */
    public int getEdicao()
    {
        return edicao;
    }

    @Override
    public boolean isDisponivel()
    {
        return disponivel && !reservado;
    }

    @Override
    public void emprestar()
    {
        if(!reservado)
        {
            this.disponivel = false;
        }
    }

    @Override
    public void devolver()
    {
        this.disponivel = true;
    }

    @Override
    public boolean isReservado()
    {
        return reservado;
    }

    @Override
    public void reservar()
    {
        if(disponivel)
        {
            this.reservado = true;
        }
    }

    @Override
    public void cancelarReserva()
    {
        this.reservado = false;
    }

    public String toString()
    {
        return "Revista: Título: " +titulo+ ", Edição: " +edicao+ ", Disponível: " +disponivel+ ", Reservado: " +reservado;
    }

}
