package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {

    //need a place to put events (hashmap will store integer and event pairs) (use map since map is interface for hashmap and want to use interface as much as possible) (map can't change but data inside it can- makes it more secure)
    private static final Map<Integer, Event> events = new HashMap<>();

    //get all events (just want to return all values of events; collection is an interface that extends iterable interface so allows you to loop over objects)
    public static Collection<Event> getAll() {
        return events.values();
    }

    //get a single event (retrieve an event with the specific id passed in)
    public static Event getById(int id) {
        return events.get(id);
    }

    //add an event (using id as key will help us retrieve those events later)
    public static void add(Event event) {
        events.put(event.getId(), event);
    }

    //remove an event (by id key)
    public static void remove(int id) {
        events.remove(id);
    }

}
