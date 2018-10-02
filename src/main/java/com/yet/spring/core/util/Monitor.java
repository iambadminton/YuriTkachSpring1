package com.yet.spring.core.util;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by a.shipulin on 02.10.18.
 */
public class Monitor  implements ApplicationListener<ApplicationEvent> {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println(applicationEvent.getClass().getSimpleName() + " > " + applicationEvent.getSource().toString());
    }
}
