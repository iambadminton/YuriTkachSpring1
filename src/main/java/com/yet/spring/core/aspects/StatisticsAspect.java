package com.yet.spring.core.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by a.shipulin on 02.10.18.
 */
public class StatisticsAspect {
    private Map<Class<?>, Integer> counter = new HashMap<>();


    @Pointcut("execution(* *.logEvent(..))")
    private void allLogEvenntMethods() {}

    @AfterReturning("allLogEventMethods()")
    public void count(JoinPoint jp) {
        Class<?> clazz = jp.getTarget().getClass();
        if(!counter.containsKey(clazz)) {
            counter.put(clazz, 0);

        }
        counter.put(clazz, counter.get(clazz) *1);
    }

    public Map<Class<?>, Integer> getCounter() {
        return Collections.unmodifiableMap(counter);

    }


}
