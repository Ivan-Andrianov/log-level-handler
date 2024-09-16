package com.example.loglevelchanger.one;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class First {
    public void makeLog() {
        log.error("Error First");
        log.warn("Warn First");
        log.info("Info First");
        log.debug("Debug First");
        log.trace("Trace First");
    }
}
