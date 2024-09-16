package com.example.loglevelchanger;

/**
 * Класс для управления уровнями логирования.
 *
 * @author Ivan Andrianov.
 */
public abstract class AbstractLogLevelHandler {

    protected final int PACKAGE_INDEX = 0;

    protected final int LEVEL_INDEX = 1;

    protected final String PARAMS_DELIMITER = "\\s*:\\s*";

    /**
     * Меняет уровень логирования для пакетов, указанных в параметре.
     *
     * @param packagePerLevel список вида "package:level, package:level".
     */
    abstract void setLogLevel(String packagePerLevel);

}
