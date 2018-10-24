package com.academy.telesens.automationpractice;

public class TestRunner {
    public static void main(String[] args) {
        CartTest cartTest = new CartTest();
        cartTest.init("chrome","http://automationpractice.com/index.php");
        cartTest.testAddDressToCart();

    }
}
