package com.company.test;

import com.company.controller.ControllerPatterns;
import com.company.view.View;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.regex.Matcher;

import static org.junit.Assert.*;

public class TestControllerPatterns {
    private static ControllerPatterns controllerPatterns;
    private static View view;

    @BeforeClass
    public static void runTestControllerPatterns(){
        view = new View();
        controllerPatterns = new ControllerPatterns(view);
    }

    @Test
    public void inputFirstNamePatternOne() {
        String firstName = "Andrew";
        Matcher firstNameMatcher = controllerPatterns.getFirstNamePattern().matcher(firstName);
        Assert.assertTrue(firstNameMatcher.matches());
    }

    @Test
    public void inputFirstNamePatternTwo() {
        String firstName = "Andrew324424";
        Matcher firstNameMatcher = controllerPatterns.getFirstNamePattern().matcher(firstName);
        Assert.assertFalse(firstNameMatcher.matches());
    }

    @Test
    public void inputSurnamePatternOne() {
        String surname = "Koval";
        Matcher firstNameMatcher = controllerPatterns.getFirstNamePattern().matcher(surname);
        Assert.assertTrue(firstNameMatcher.matches());
    }

    @Test
    public void inputSurnamePatternTwo() {
        String surname = "KOv+][324424";
        Matcher firstNameMatcher = controllerPatterns.getFirstNamePattern().matcher(surname);
        Assert.assertFalse(firstNameMatcher.matches());
    }

    @Test
    public void inputPatronymicPatternOne() {
        String patronymic = "Vladim";
        Matcher firstNameMatcher = controllerPatterns.getFirstNamePattern().matcher(patronymic);
        Assert.assertTrue(firstNameMatcher.matches());
    }

    @Test
    public void inputPatronymicPatternTwo() {
        String patronymic = "Vlad7772````4";
        Matcher firstNameMatcher = controllerPatterns.getFirstNamePattern().matcher(patronymic);
        Assert.assertFalse(firstNameMatcher.matches());
    }
}