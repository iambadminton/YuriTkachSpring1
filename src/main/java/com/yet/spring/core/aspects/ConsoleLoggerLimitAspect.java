package com.yet.spring.core.aspects;

import com.yet.spring.core.beans.Event;
import com.yet.spring.core.loggers.EventLogger;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by a.shipulin on 02.10.18.
 */
public class ConsoleLoggerLimitAspect {
    private final int maxCount;
    private final EventLogger otherLogger;
    private final int currentCount = 0;

    public ConsoleLoggerLimitAspect(int maxCount, EventLogger otherLogger) {
        this.maxCount = maxCount;
        this.otherLogger = otherLogger;
    }

    public void aroundLogEvent(ProceedingJoinPoint jp, Event evt) throws Throwable {
        if(currentCount < maxCount) {
            System.out.println("ConsoleEventLogger max count is reached. Logging to " + otherLogger.getName());
            otherLogger.logEvent(evt);
        }

    }
}
