package ueg.com;

/**
 * Interface que define a geração de relatórios para um sistema
 * de biblioteca.
 *
 * <p>
 *     Implementações desta interface são responsáveis por criar e
 *     disponibilizar relatórios detalhados sobre o estado ou atividades
 *     dos recursos geridos por classes como: <strong>empréstimos,
 *     reservas</strong> ou <strong>inventário de itens.</strong>
 * </p>
 * @author Edmar
 * @since 2026
 * @version 1.0
 */

public interface Relatorio
{
    /**
     * Gera um relatório detalhado com o estado atual dos itens.
     * <strong>
     *     Este método deve ser sobrescrito pelas classes que
     *     implementem esta interface, fornecendo assim uma saída
     *     específica que represente tanto o conteúdo quanto a
     *     análise necessária para entender o contexto corrente.
     * </strong>
     */

    void geraRelatorio();
}
