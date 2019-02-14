package com.company.controller;

import com.company.view.View;
import com.company.view.ViewPrompts;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControllerPatterns {
    private View view;

    private Pattern firstNamePattern;
    private Pattern surnamePattern;
    private Pattern patronymicPattern;
    private Pattern nickNamePattern;
    private Pattern commentPattern;
    private Pattern groupPattern;
    private Pattern homePhoneNumberPattern;
    private Pattern phoneNumberPattern;
    private Pattern emailPattern;
    private Pattern skypePattern;
    private Pattern adressIndexPattern;

    public View getView() {
        return view;
    }

    private Pattern addressTownPattern;
    private Pattern addressStreetPattern;
    private Pattern adressHouseNumberPattern;
    private Pattern adressFlatNumberPattern;
    private Pattern dateOfMakingRecordPattern;
    private Pattern dateOfLastEditPattern;

    public ControllerPatterns(View view) {
        firstNamePattern = Pattern.compile("[A-Z][a-z]*((\\s|\\u002D)[A-Z][a-z]*)*");
        surnamePattern = Pattern.compile("[A-Z][a-z]*((\\s|\\u002D)[A-Z][a-z]*)*");
        patronymicPattern = Pattern.compile("[A-Z][a-z]*((\\s|\\u002D)[A-Z][a-z]*)*");
        nickNamePattern = Pattern.compile(".*");
        commentPattern = Pattern.compile(".*");
        groupPattern = Pattern.compile("");
        homePhoneNumberPattern = Pattern.compile("[0-9]{8,10}");
        phoneNumberPattern = Pattern.compile("[0-9]{8,10}");
        emailPattern = Pattern.compile("(([A-Za-z])|([0-9]))+[@][a-z]+");
        skypePattern = Pattern.compile("(([A-Za-z])|([0-9]))+");
        adressIndexPattern = Pattern.compile("[0-9]{8}");
        addressTownPattern = Pattern.compile("[A-Z][a-z]+((\\s|\\u002D)[A-Z][a-z]+)+");
        addressStreetPattern = Pattern.compile("[A-Z][a-z]+((\\s|\\u002D)[A-Z][a-z]+)+");
        adressHouseNumberPattern = Pattern.compile("[0-9]+");
        adressFlatNumberPattern = Pattern.compile("[0-9]+");
        dateOfMakingRecordPattern = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])\\.(0?[1-9]|1[012])\\.((19|20)\\d\\d)");
        dateOfLastEditPattern = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])\\.(0?[1-9]|1[012])\\.((19|20)\\d\\d)");

        this.view = view;
    }

    public String inputFirstName(Scanner sc) {
        view.printMessage(ViewPrompts.INPUT_FIRST_NAME);
        String firstName = sc.nextLine();
        Matcher firstNameMatcher = firstNamePattern.matcher(firstName);

        while (!firstNameMatcher.matches()) {
            view.printMessage(ViewPrompts.INVALID_INPUT);
            firstName = sc.nextLine();
            firstNameMatcher = firstNamePattern.matcher(firstName);
        }
        return firstName;
    }

    public String inputSurname(Scanner sc) {
        view.printMessage(ViewPrompts.INPUT_SURNAME);
        String surname = sc.nextLine();
        Matcher surnameMatcher = surnamePattern.matcher(surname);

        while (!surnameMatcher.matches()) {
            view.printMessage(ViewPrompts.INVALID_INPUT);
            surname = sc.nextLine();
            surnameMatcher = surnamePattern.matcher(surname);
        }
        return surname;
    }

    public String inputPatronymic(Scanner sc) {
        view.printMessage(ViewPrompts.INPUT_PATRONYMIC);
        String patronymic = sc.nextLine();
        Matcher patronymicMatcher = patronymicPattern.matcher(patronymic);

        while (!patronymicMatcher.matches()) {
            view.printMessage(ViewPrompts.INVALID_INPUT);
            patronymic = sc.nextLine();
            patronymicMatcher = patronymicPattern.matcher(patronymic);
        }
        return patronymic;
    }

    public Pattern getFirstNamePattern() {
        return firstNamePattern;
    }

    public Pattern getSurnamePattern() {
        return surnamePattern;
    }

    public Pattern getPatronymicPattern() {
        return patronymicPattern;
    }

    public Pattern getNickNamePattern() {
        return nickNamePattern;
    }

    public Pattern getCommentPattern() {
        return commentPattern;
    }

    public Pattern getGroupPattern() {
        return groupPattern;
    }

    public Pattern getHomePhoneNumberPattern() {
        return homePhoneNumberPattern;
    }

    public Pattern getPhoneNumberPattern() {
        return phoneNumberPattern;
    }

    public Pattern getEmailPattern() {
        return emailPattern;
    }

    public Pattern getSkypePattern() {
        return skypePattern;
    }

    public Pattern getAdressIndexPattern() {
        return adressIndexPattern;
    }

    public Pattern getAddressTownPattern() {
        return addressTownPattern;
    }

    public Pattern getAddressStreetPattern() {
        return addressStreetPattern;
    }

    public Pattern getAdressHouseNumberPattern() {
        return adressHouseNumberPattern;
    }

    public Pattern getAdressFlatNumberPattern() {
        return adressFlatNumberPattern;
    }

    public Pattern getDateOfMakingRecordPattern() {
        return dateOfMakingRecordPattern;
    }

    public Pattern getDateOfLastEditPattern() {
        return dateOfLastEditPattern;
    }

}
