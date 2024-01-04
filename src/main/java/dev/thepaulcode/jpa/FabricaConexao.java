package dev.thepaulcode.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FabricaConexao {
    // Conexao
    private static EntityManager entityManager;

    public static void conectar() {
        try {
            // Gerenciamento de Entidade
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MY_PU");
            entityManager = entityManagerFactory.createEntityManager();
            System.out.println("Conexão realizada com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) {
//        FabricaConexao.conectar();
//    }

    public static EntityManager getEntityManager(){
        return entityManager;
    }

}
