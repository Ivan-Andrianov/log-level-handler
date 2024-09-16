package com.example.loglevelchanger.three;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Third {
    public void makeLog() {
        log.error("Error Third");
        log.warn("Warn Third");
        log.info("Info Third");
        log.debug("Debug Third");
        log.trace("Trace Third");
    }
}
