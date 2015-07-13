package com.liveooapp.liveoo.adapters;

public class Ticket {

    private String mTitle;
    private String mAddress;
    private String mDateTime;
    private String mLocation;

    public Ticket() {
        // TODO: Remove empty constructor when using Retrofit
    }

    public String getTitle() {
        return "Event Title";
    }

    public String getAddress() {
        return "123, Road Name, City";
    }

    public String getDateTime() {
        return "May 19th @ 7:30 pm";
    }

    public String getLocation() {
        return "City, Postcode";
    }
}
