/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livreprogramacao.practise;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Fabio Santos Almeida <livre.programacao at gmail.com>
 */
public class UserDataRepository {

    public void insert() {
        System.out.println("\n\n\n\n\tThe NewClass is here!\n\n\n\n");

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("postgres");
        EntityManager manager = factory.createEntityManager();

        for (int i = 1; i < 101; i++) {

            String username = String.format("user-%d", i);
            System.out.format("Username is %s", username);

            UserData user = new UserData();
            user.setUsername(username);

            try {
                manager.getTransaction().begin();
                manager.persist(user);
                manager.getTransaction().commit();

            } catch (Exception e) {
                System.out.format("\nException message %s", e.getMessage());
                System.out.format("\nException localized message %s\n\n", e.getLocalizedMessage());
                throw e;
            }

        }

        manager.close();
        factory.close();

    }

}
