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
public class EventClient {

    public static void main(String[] args) {

        EventOrganizer eventTester = new EventOrganizer();

        // calling no- argument functional interface
        eventTester.testEvent(() -> System.out
            .println("event occurred : no argument syntax"));

        // calling single- argument method of functional interface
        eventTester.testEventProcess((i) -> System.out
            .println("event processed : one argument syntax : " + i));

        // calling alternative single- argument method of functional interface. alternative
        // syntax of omitting parenthesies
        eventTester.testEventProcess(i -> System.out
            .println("event processed : one argument syntax : " + i));

        // calling alternative single- argument method of functional interface. alternative
        // syntax of wrapping expression body with curly braces
        eventTester.testEventProcess((i) -> {

            System.out.println("event processed : one argument syntax : " + i);

        });

        // calling single- argument method of functional interface which that returns
        // the result
        eventTester.testEventResult((i) -> {

            i = i + 1;

            return i;

        });

    }
}
