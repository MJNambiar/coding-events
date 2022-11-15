# coding-events
Purpose of App:
Creates a database of coding events organized by details, tags, and categories


Current State of App:
User can view, create, delete, and store coding events
User can add or delete event categories and tags


Future Improvements of App:

-Create Person Class as a user profile class:
  
  -Fields: id, firstName, lastName, email(aka username), password, List<Events> eventsAttending, List<Events> eventsOwned
  
  -Methods: getters/setters (except no setter for id)
  
  -Relationship to other Classes:
    
    -Person class would have many to many relationship to Event Class via eventsAttending
    
    -Person class would have one to many relationship to Event Class via eventsOwned
    

