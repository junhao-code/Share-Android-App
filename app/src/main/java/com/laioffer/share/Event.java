package com.laioffer.share;

/**
 * Created by supersu on 3/13/18.
 */

public class Event {
    /**
     * All data for a event.
     */
    private String title;
    private String address;
    private String description;

    /**
     * Constructor
     */
    public Event(String title, String address, String description) {
        this.title = title;
        this.address = address;
        this.description = description;
    }

    /**
     * Getters for private attributes of Event class.
     */
    public String getTitle() { return this.title; }
    public String getAddress() { return this.address; }
    public String getDescription() { return this.description; }

}
