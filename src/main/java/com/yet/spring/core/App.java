package com.yet.spring.core;
import com.yet.spring.core.beans.Client;
import com.yet.spring.core.beans.Event;
import com.yet.spring.core.loggers.ConsoleEventLogger;
import com.yet.spring.core.loggers.EventLogger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Sanya on 18.08.2018.
 */
public class App {
    private Client client;
    private EventLogger eventLogger;


    public App(Client client, EventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public void logEvent(Event event, String msg) {
        event.setMsg(msg);
        eventLogger.logEvent(event);
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource") // We will remove this suppress in further lessons
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) context.getBean("app");

        //Event event = (Event) context.getBean("event");
        Event event = context.getBean(Event.class);

        /*app.client = new Client("1", "John Smith");
        app.eventLogger = new ConsoleEventLogger();*/
        app.logEvent(event, "Some event for 1");

        event = context.getBean(Event.class);
        app.logEvent(event, "Some event for user 2");

        context.close();

    }


}
