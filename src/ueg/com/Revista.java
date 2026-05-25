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

    /**
     * Construtor para criar uma nova instância da Revista
     * @param titulo da revista
     * @param edicao da revista
     */
    public Revista(String titulo, int edicao)
    {
        this.titulo = titulo;
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
}
