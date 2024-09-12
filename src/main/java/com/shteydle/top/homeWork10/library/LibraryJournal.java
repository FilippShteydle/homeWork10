package com.shteydle.top.homeWork10.library;

import java.time.LocalDate;
import java.util.ArrayList;

public class LibraryJournal {

    static ArrayList<String[]> journal = new ArrayList<String[]>();

    private String authorNameBook;
    private int ticketsNumber;
    LocalDate startDate = LocalDate.now();
    private int termDay;
    LocalDate finishDay = startDate.plusDays(termDay);

    public static void createJournal(LibraryJournal j) {

        String[] str = {String.valueOf(j.getTicketsNumber()), j.getAuthorNameBook(), String.valueOf(j.getStartDate()), String.valueOf(j.getFinishDay())};
        journal.add(str);

    }

    public static void printJournal() {
        for (int i = 0; i < journal.size(); i++) {
            String[] myStr = journal.get(i);
            for (int k = 0; k < myStr.length; k++) {
                System.out.print(myStr[k] + " ");
            }
            System.out.println();
        }
    }

    public LibraryJournal(String authorNameBook, int ticketsNumber, int termDay) {
        this.authorNameBook = authorNameBook;
        this.ticketsNumber = ticketsNumber;
        this.termDay = termDay;
        finishDay = startDate.plusDays(termDay);
    }

    public String getAuthorNameBook() {
        return authorNameBook;
    }

    public void setAuthorNameBook(String authorNameBook) {
        this.authorNameBook = authorNameBook;
    }

    public int getTicketsNumber() {
        return ticketsNumber;
    }

    public void setTicketsNumber(int ticketsNumber) {
        this.ticketsNumber = ticketsNumber;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getTermDay() {
        return termDay;
    }

    public void setTermDay(int termDay) {
        this.termDay = termDay;
    }

    public LocalDate getFinishDay() {
        return finishDay;
    }

    public void setFinishDay(LocalDate finishDay) {
        this.finishDay = finishDay;
    }

    @Override
    public String toString() {
        return "Запись в журнале: " +
                "автор и название книги: '" + authorNameBook + '\'' +
                ", номер читательского билета: " + ticketsNumber +
                ", дата выдачи: " + startDate +
                ", выдано на " + termDay + " дней" +
                ", когда нужно вернуть: " + finishDay;
    }
}
