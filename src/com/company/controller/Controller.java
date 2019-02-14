package com.company.controller;

import com.company.model.Model;
import com.company.model.Record;
import com.company.view.View;
import com.company.view.ViewPrompts;

import java.util.Scanner;
import java.util.regex.Matcher;

public class Controller {
    private Model model;
    private View view;
    private ControllerPatterns controllerPatterns;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        controllerPatterns = new ControllerPatterns(view);
    }

    public void processUser() {
        view.printMessage(ViewPrompts.START_INPUT);

        Scanner sc = new Scanner(System.in);
        Record record = new Record();

        record.setFirstName(controllerPatterns.inputFirstName(sc));
        record.setSurname(controllerPatterns.inputSurname(sc));
        record.setPatronymic(controllerPatterns.inputPatronymic(sc));

        model.getListOfRecords().addFirst(record);
        view.printMessage(model.toString());
    }


}
