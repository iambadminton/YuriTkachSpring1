package com.yet.spring.core.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by a.shipulin on 02.10.18.
 */
@Aspect
public class LoggingAspect {
    @Pointcut("execution(* *.logEvent(..)")
    private void allLogEventMethods() {}

    @Pointcut("allLogEventMethod() && within(*.*File*Logger)")
    private void logEventInsideFileLoggers() {}

    @Before("allLogEventMethods()")
    public void logBefore(JoinPoint joinpoint) {
        System.out.println("BEFORE: " + joinpoint.getTarget().getClass().getSimpleName() + " " +
        joinpoint.getSignature().getName());
    }

    @AfterReturning(pointcut="allLogEventMethods()", returning="retVal")
    public void logAfter(Object retVal) {
        System.out.println("AFTER_RET:" + retVal);
    }

    @AfterThrowing(pointcut="allLogEventMethods()", throwing="ex")
    public void logAFterThrow(Throwable ex) {
        System.out.println("AFTER_THR:" + ex);
    }

}
