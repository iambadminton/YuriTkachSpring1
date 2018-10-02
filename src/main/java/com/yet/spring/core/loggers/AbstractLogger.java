package com.yet.spring.core.loggers;

/**
 * Created by a.shipulin on 02.10.18.
 */
public abstract class AbstractLogger implements EventLogger {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
