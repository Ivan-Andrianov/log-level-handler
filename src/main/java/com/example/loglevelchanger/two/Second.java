package com.example.loglevelchanger.two;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Second {
    public void makeLog() {
        log.error("Error Second");
        log.warn("Warn Second");
        log.info("Info Second");
        log.debug("Debug Second");
        log.trace("Trace Second");
    }
}
