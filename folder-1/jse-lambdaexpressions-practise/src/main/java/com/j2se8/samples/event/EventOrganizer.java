/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j2se8.samples.event;

/**
 * @author Mohan Basavarajappa
 *
 * @see <a href="https://community.oracle.com/docs/DOC-1003597">Getting Started with Lambda Expressions</a>
 */
public class EventOrganizer {

    public void testEvent(Event event) {

        event.onEventOccurance();

    }

    public void testEventProcess(EventProcess eventProcess) {

        eventProcess.onEventOccuranceProcess(1);

    }

    public void testEventResult(EventResult eventResult) {

        int result = eventResult.onEventOccuranceConfirm(1);

        // printing the return value of
        System.out.println("Print result value : " + result);

    }

}
