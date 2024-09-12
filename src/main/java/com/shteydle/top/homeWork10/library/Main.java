package com.shteydle.top.homeWork10.library;

public class Main {

    public static void main(String[] args) {

        LibraryJournal s1 = new LibraryJournal("Tolstoy Voina i mir", 1020, 15);
        LibraryJournal s2 = new LibraryJournal("Донцова кто где", 1021, 27);
        LibraryJournal s3 = new LibraryJournal("Пушкин Пиковая дама", 1022, 20);
        LibraryJournal s4 = new LibraryJournal("Достоевский Идиот", 1023, 21);
        LibraryJournal s5 = new LibraryJournal("Верн Дети капитана Гранта", 1024, 45);

        ReadersTicket r1 = new ReadersTicket(1024, "Иванов Иван", "Пг-211");
        ReadersTicket r2 = new ReadersTicket(1024, "Иванов Иван", "Пг-211");
        ReadersTicket r3 = new ReadersTicket(1024, "Иванов Иван", "Пг-211");

/*
        LibraryJournal.createJournal(s1);
        LibraryJournal.createJournal(s2);
        LibraryJournal.createJournal(s3);
        LibraryJournal.createJournal(s4);
        LibraryJournal.createJournal(s5);
        LibraryJournal.printJournal();*/

    }
}
