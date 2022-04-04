package br.com.salomaotech.cadastro.model;

import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroRepository extends JpaRepository<CadastroModel, Long> {

    /**
     * Pesquisa por id
     *
     * @param id Nome
     * @param pageable Paginador
     * @return List com CadastroModel
     */
    @Query(value = "SELECT * FROM cadastro_model WHERE id=?", nativeQuery = true)
    List<CadastroModel> findByNome(String id, Pageable pageable);

    /**
     * Retorna a quantidade de itens em uma pesquisa por id
     *
     * @param id Nome
     * @return Long com a quantidade de itens
     */
    @Query(value = "SELECT COUNT(id) FROM cadastro_model WHERE id=?", nativeQuery = true)
    long findByNomeCount(String id);

}
