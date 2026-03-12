package br.com.livreprogramacao.practise;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fabio Santos Almeida <livre.programacao at gmail.com>
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("\n\n\n\n\tThe Main Class is here!\n\n\n\n");

        try {

            new UserDataRepository().insert();

        } catch (Exception e) {
            System.out.format("\nException message %s", e.getMessage());
            System.out.format("\nException localized message %s\n\n", e.getLocalizedMessage());
            throw e;
        }
    }
}
