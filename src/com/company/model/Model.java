package com.company.model;

import java.util.ArrayDeque;

public class Model {
    private ArrayDeque<Record> listOfRecords;

    public Model() {
        listOfRecords = new ArrayDeque<>();
    }

    public ArrayDeque<Record> getListOfRecords() {
        return listOfRecords;
    }

    public void setListOfRecords(ArrayDeque<Record> listOfRecords) {
        this.listOfRecords = listOfRecords;
    }

    public String toString() {
        String string = "";
        for (Record record : listOfRecords) {
            string += record.getSurname() + " " + record.getFirstName().substring(0, 1) + ".";
        }
        return string;
    }
}
