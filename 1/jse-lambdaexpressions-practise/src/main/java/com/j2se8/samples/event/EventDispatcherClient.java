/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j2se8.samples.event;

/**
 *
 * @author Mohan Basavarajappa
 *
 * @see <a href="https://community.oracle.com/docs/DOC-1003597">Getting Started with Lambda Expressions</a>
 */
public class EventDispatcherClient {

    public static void main(String[] args) {

        EventDispatcher eventDispatcher = new EventDispatcher();

        // define no- argument functional interface
        Event event1 = () -> System.out.println("event 1 occurred : no argument syntax");

        Event event2 = () -> System.out.println("event 2 occurred : no argument syntax");

        // define single- argument method of functional interface
        EventProcess process1 = i -> System.out.println("event processed : one argument syntax : " + i);

        // define alternative single- argument method of functional interface. alternative
        // syntax of omitting parenthesies
        EventProcess process2 = i -> System.out.println("event processed : one argument syntax : " + i);

        // define alternative single- argument method of functional interface. alternative
        // syntax of wrapping expression body with curly braces
        EventProcess process3 = i
            -> {

            System.out.println("event processed : one argument syntax : " + i);

        };

        // define single- argument method of functional interface which that returns
        // the result
        EventResult result1 = i
            -> {
            i = i + 2;
            return i;
        };

        EventResult result2 = i
            -> {
            i = i - 2;
            return i;
        };

        EventResult result3 = i
            -> {
            i = i * 2;
            return i;
        };

        EventResult result4 = (i) -> {
            i = i / 2;
            return i;
        };

        EventResult result5 = i
            -> {
            i = i % 2;
            return i;
        };

        // registering events
        eventDispatcher.registerEventHandler(event1);

        eventDispatcher.registerEventHandler(event2);

        eventDispatcher.dispatchEvent();

        System.out.println("");

        // registering event processes
        eventDispatcher.registerEventProcessHandler(process1);

        eventDispatcher.registerEventProcessHandler(process2);

        eventDispatcher.registerEventProcessHandler(process3);

        eventDispatcher.processEvents();

        System.out.println("");

        // registering result- based events
        eventDispatcher.registerEventResultHandler(result1);

        eventDispatcher.registerEventResultHandler(result2);

        eventDispatcher.registerEventResultHandler(result3);

        eventDispatcher.registerEventResultHandler(result4);

        eventDispatcher.registerEventResultHandler(result5);

        eventDispatcher.compute();

    }
}
