package com.yet.spring.core.loggers;

import com.yet.spring.core.beans.Event;

/**
 * Created by Sanya on 18.08.2018.
 */
public interface EventLogger {
    public void logEvent(Event event);
}
