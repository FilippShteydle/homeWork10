package com.shteydle.top.homeWork10.library;

import java.util.HashMap;

public class ReadersTicket {
    private int ticketsNumber;
    private String fullName;
    private String groupsNumber;
    HashMap<Integer, String> listOfTickets = new HashMap<>();


    public ReadersTicket(int ticketsNumber, String fullName, String groupsNumber) {
        if (listOfTickets.containsKey(ticketsNumber)) {
            System.out.println("Takoй номер билета уже есть");
        } else {
            this.ticketsNumber = ticketsNumber;
            this.fullName = fullName;
            this.groupsNumber = groupsNumber;
            listOfTickets.put(ticketsNumber, fullName + " " + groupsNumber);
        }
    }

    public static 

    public int getTicketsNumber() {
        return ticketsNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGroupsNumber() {
        return groupsNumber;
    }

    public void setGroupsNumber(String groupsNumber) {
        this.groupsNumber = groupsNumber;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
