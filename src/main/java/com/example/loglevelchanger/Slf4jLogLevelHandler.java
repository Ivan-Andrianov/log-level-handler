package com.example.loglevelchanger;

/**
 * Реализация {@link AbstractLogLevelHandler} для управления уровнями логирования для библиотеки Logback.
 *
 * @author Ivan Andrianov.
 */
public class Slf4jLogLevelHandler extends AbstractLogLevelHandler {

    /**
     * LogLevelHandler, которому делегируется смена уровня логирования.
     */
    private AbstractLogLevelHandler provider;

    /**
     * Конструктор для создания
     *
     * @param provider
     */
    public Slf4jLogLevelHandler(AbstractLogLevelHandler provider) {
        this.provider = provider;
    }

    @Override
    public void setLogLevel(String packagePerLevel) {
        provider.setLogLevel(packagePerLevel);
    }
}
