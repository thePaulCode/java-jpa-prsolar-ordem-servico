package dev.thepaulcode.repository;

import dev.thepaulcode.jpa.FabricaConexao;
import dev.thepaulcode.model.Servico;


import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class ServicoRepository {

    private EntityManager entityManager;
    public ServicoRepository() {
        entityManager = FabricaConexao.getEntityManager();
    }

    // Metodos

    // DML -- INSERT -- Salvar Servico
    public void salvar(Servico servico) {
        entityManager.getTransaction().begin();
        entityManager.persist(servico);
        entityManager.getTransaction().commit();
    }

    // DML -- SET -- Alterar Servico
    public void alterar(Servico servico) {
        entityManager.getTransaction().begin();
        entityManager.merge(servico);
        entityManager.getTransaction().commit();

    }

    // DML -- DELETE
    public void excluir(Integer id) {

        Servico registro = buscarPorId(id);
        if (registro != null){
            entityManager.getTransaction().begin();
            entityManager.remove(registro);
            entityManager.getTransaction().commit();
        }

    }

    // DQL - SELECT WHERE id=?
    public Servico buscarPorId(Integer id) {
        Servico registro = entityManager.find(Servico.class, id);

        return registro;
    }

    // DQL -- SELECT
    public List<Servico> listar() {
        // JPQL - JAVA PERSISTENCE QUERY LANGUAGE
        // REALIZA SELECT SOBRE NOSSAS CLASSES
        Query query = entityManager.createQuery("SELECT s FROM Servico s");

        return query.getResultList();
    }
}
