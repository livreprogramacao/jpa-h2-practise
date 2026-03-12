/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livreprogramacao.app;

import javax.inject.Inject;
import org.slf4j.Logger;

/**
 *
 * @author Fabio Santos Almeida <livre.programacao at gmail.com>
 */
public class AppMain {

    @Inject
    private Logger logger;

    public static void main(String args[]) {
        new AppMain().callMe();
    }

    private void callMe() {
        logger.info("Hello world!");
    }

}
