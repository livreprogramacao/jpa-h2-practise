/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.basic.injection;

import app.named.services.book.Book;
import javax.inject.Inject;
import org.jvnet.hk2.annotations.Service;

/**
 *
 * @author Fabio Santos Almeida <livre.programacao at gmail.com>
 */
@Service
public class FooImpl implements Foo {

    @Inject
    private Book book;

}
