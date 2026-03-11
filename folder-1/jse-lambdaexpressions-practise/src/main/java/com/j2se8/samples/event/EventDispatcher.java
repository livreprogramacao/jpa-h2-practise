/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j2se8.samples.event;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mohan Basavarajappa
 *
 * @see <a href="https://community.oracle.com/docs/DOC-1003597">Getting Started with Lambda Expressions</a>
 */
public class EventDispatcher {

    private List<Event> eventList = new ArrayList<Event>();

    private List<EventProcess> eventProcessList = new ArrayList<EventProcess>();

    private List<EventResult> eventResultList = new ArrayList<EventResult>();

    public void registerEventHandler(Event event) {

        eventList.add(event);

    }

    public void registerEventProcessHandler(EventProcess eventProcess) {

        eventProcessList.add(eventProcess);

    }

    public void registerEventResultHandler(EventResult eventResult) {

        eventResultList.add(eventResult);

    }

    public void dispatchEvent() {

        for (Event event : eventList) {

            event.onEventOccurance();

        }

    }

    public void processEvents() {

        int i = 1;

        for (EventProcess process : eventProcessList) {

            process.onEventOccuranceProcess(i++);

        }

    }

    public void compute() {

        final int i = 2;

        for (EventResult process : eventResultList) {

            int result = process.onEventOccuranceConfirm(i);

            System.out.println("return result : " + result);

        }

    }
}
