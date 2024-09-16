package com.example.loglevelchanger;

import org.apache.log4j.Level;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class Log4jLogLevelHandler extends AbstractLogLevelHandler {

    @Override
    public void setLogLevel(String packagePerLevel) {
        setLogLevel("ROOT", Level.ERROR);

        Arrays.stream(packagePerLevel.split(","))
                .forEach(pair -> {
                    String[] tuple = pair.trim().split(PARAMS_DELIMITER);
                    setLogLevel(tuple[PACKAGE_INDEX],  Level.toLevel(tuple[LEVEL_INDEX]));
                });
    }

    private void setLogLevel(String pg, Level level) {
        Logger logger = Logger.getLogger(pg);
        logger.setLevel(level);
    }
}
