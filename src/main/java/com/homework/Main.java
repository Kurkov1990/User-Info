package com.homework;

import com.homework.view.AppView;

public class Main {
    public static void main(String[] args) {
        AppView demo = new AppView();
        demo.printResult(demo.setUserAddress());
    }
}