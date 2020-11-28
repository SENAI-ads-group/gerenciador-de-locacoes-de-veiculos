package model.services.persistence;

import model.entidades.Categoria;
import model.services.persistence.exceptions.PersistenceException;

import java.util.List;

/**
 *
 * @author Alexsander
 */
public interface CategoriaPersistenceService {

    void inserir(Categoria categoria) throws PersistenceException;

    void atualizar(Categoria categoria);

    Categoria buscar(Integer id);

    List<Categoria> buscarTodos();

}