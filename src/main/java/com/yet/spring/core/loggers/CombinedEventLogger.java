package com.yet.spring.core.loggers;

import com.yet.spring.core.beans.Event;

import java.util.Collection;

/**
 * Created by a.shipulin on 02.10.18.
 */
public class CombinedEventLogger extends AbstractLogger {
    private final Collection<EventLogger> loggers;
    @Override
    public void logEvent(Event event) {

    }

    public CombinedEventLogger(Collection<EventLogger> loggers) {
        super();
        this.loggers = loggers;
    }

    public Collection<EventLogger> getLoggers() {
        return loggers;
    }
}
