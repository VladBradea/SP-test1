package com.test_sp.test;
import java.util.Date;

public class Message {
    private Date date;
    private String message;
    private String house;

    public Message(Date date, String message, String house) {
        this.date = date;
        this.message = message;
        this.house = house;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void accept(MessageVisitor visitor) {
        if (this.house == "Atreides") {
            visitor.visitAtreidesMessage(this);
        }
        else {
            visitor.visitHarkonnenMessage(this);
        }
    }

    public String decodeMessage(MessageDecoding messageDecoding) {
        return messageDecoding.decodeMessage(message);
    }
}
