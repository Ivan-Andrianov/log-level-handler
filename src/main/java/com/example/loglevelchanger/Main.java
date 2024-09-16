package com.example.loglevelchanger;

import com.example.loglevelchanger.one.First;
import com.example.loglevelchanger.three.Third;
import com.example.loglevelchanger.two.Second;

public class Main {
    public static void main(String[] args) {
        AbstractLogLevelHandler provider = new LogbackLogLevelHandler();
        AbstractLogLevelHandler slf4j = new Slf4jLogLevelHandler(provider);
        First first = new First();
        Second second = new Second();
        System.out.println("----------bound----------");
        Third third = new Third();
        String test = "com.example.loglevelchanger.one:WARN,  " +
                "com.example.loglevelchanger.two : TRACE";

        slf4j.setLogLevel(test);
        System.out.println("first_-_-");
        first.makeLog();
        System.out.println("second_-_-");
        second.makeLog();
        System.out.println("third_-_-");
        third.makeLog();

    }
}
