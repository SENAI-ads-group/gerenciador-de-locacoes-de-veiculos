package model.servicos.persistencia.interfaces;

import java.util.List;
import model.entidades.Taxa;

/**
 *
 * @author patrick-ribeiro
 */
public interface TaxaDAO {

    void inserir(Taxa taxa);

    void atualizar(Taxa taxa);

    void excluir(Integer id);

    Taxa buscar(Integer id);

    List<Taxa> buscarTodos();
}
