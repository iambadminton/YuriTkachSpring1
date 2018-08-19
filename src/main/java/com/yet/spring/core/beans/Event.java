package com.yet.spring.core.beans;



import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Sanya on 18.08.2018.
 */
public class Event {
    private int id;
    private String msg;
    private Date date;

    private DateFormat dateFormat;

    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);



    @Override
    public String toString() {
        return "Event [id=" + id + ", msg=" + msg + ", date=" + dateFormat.format(date) + "]";
    }


    public Event(Date date, DateFormat dateFormat) {
        this.date = date;
        this.dateFormat = dateFormat;
        this.id = AUTO_ID.getAndIncrement();
    }

    public int getId() {
        return id;
    }

    public String getMsg() {
        return msg;
    }

    public Date getDate() {
        return date;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
