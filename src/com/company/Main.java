package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> dogNames = new ArrayList<>();
        dogNames.add("Snoopy");
        dogNames.add("Rin Tin Tin");
        dogNames.add("Gloria");

        int bethIndex = dogNames.indexOf("Beth");
        int gloriaIndex = dogNames.indexOf("Gloria");

        System.out.println(bethIndex + gloriaIndex);
    }
}