package com.java.List.CreateAnArrayList;

import java.util.ArrayList;
import java.util.List;

public class WebsiteClass {
    private List<String> urlList;

    public WebsiteClass() {
        // Create urlList
        urlList = new ArrayList<>();

    }

    public void printURLs() {
        // add URL strings to urlList
        urlList.add("https://pluralsight.com/search?q=java");
        urlList.add("https://medium.com/search?q=java");
        urlList.add("https://stackoverflow.com/questions/tagged/java");
        urlList.add("https://stackoverflow.com/search?q=java+list");
        urlList.add("https://reddit.com/r/java");
        urlList.add("https://reddit.com/r/javahelp");

        System.out.println("The URL found in our platform are: ");
        for(String urls : urlList){
            System.out.println("-" + urls);
        }
    }
}
