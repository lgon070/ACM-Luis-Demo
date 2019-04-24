package com.example.acm_app_luisgonzalez.models.mlh;

import com.example.acm_app_luisgonzalez.models.mlh.Event;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Hackathons {

    @SerializedName("array")
    List<Event> events;

    public List<Event> getEvents() {
        return events;
    }

}

