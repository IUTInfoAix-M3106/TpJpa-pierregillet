package fr.univ_amu.iut.tpJPA;

import javax.persistence.*;

public class TestJPA {
    public static void main(String[] args) {
        // Initializes the Entity manager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionPedaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        em.close();
        emf.close();
    }
}
