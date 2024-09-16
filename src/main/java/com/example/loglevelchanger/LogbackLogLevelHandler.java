package com.example.loglevelchanger;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * Реализация {@link LogLevelHandler} для управления уровнями логирования для библиотеки Logback.
 *
 * @author Ivan Andrianov.
 */
public class LogbackLogLevelHandler extends AbstractLogLevelHandler {

    /**
     * Контекст логирования Logback.
     */
    private final LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();

    @Override
    public void setLogLevel(String packagePerLevel) {
        setLogLevel("ROOT", Level.ERROR);

        Arrays.stream(packagePerLevel.split(","))
                .forEach(pair -> {
                    String[] tuple = pair.trim().split(PARAMS_DELIMITER);
                    setLogLevel(tuple[PACKAGE_INDEX], Level.toLevel(tuple[LEVEL_INDEX]));
                });
    }

    /**
     * Задает уровень логирования для одного пакета.
     *
     * @param pg имя пакета.
     * @param level уровень логирования.
     */
    private void setLogLevel(String pg, Level level) {
        Logger logger = loggerContext.getLogger(pg);
        logger.setLevel(level);
    }
}