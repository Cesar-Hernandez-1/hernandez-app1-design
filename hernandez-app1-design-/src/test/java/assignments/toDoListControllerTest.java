package assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class toDoListControllerTest {

    @Test
    void addEvent() {

        //create Event object
        //set name, description, and date to Event object using methods
        //create todoList object
        //set name to list
        //use addEvent method to add event
        //assertTrue, if method returns true, then successful
        //if return false, an error occurred
    }

    @Test
    void addToDoList() {
        //create new tab object
        //create new toDoList object and give a tile to list
        //set tab with list name and list object
        //assertTrue, true if added tab with no errors; false otherwise
    }

    @Test
    void deleteList() {
        //create a todoList object and set title
        //create multiple Event objects and store them in a list
        //invoke deleteList method.
        //if all events deleted, return true; false otherwise
    }

    @Test
    void deleteToDoList() {
        //set string with path name of file to delete
        //assertTrue, if delete successful using file method : true; false otherwise
    }

    @Test
    void displayAllEvents() {
        //create todo list object
        //create several Event objects
        //set some events to completed and some to incomplete
        //loop through events in todolist, if events viewable, add them to a string variable
        //if string variable equal to expected string variable output, test successfully
    }

    @Test
    void displayCompletedEvents() {
        //create todo list object
        //create several Event objects
        //set some events to completed and some to incomplete
        //loop through events in todolist, if events viewable, add them to a string variable
        //if string variable equal to expected string variable output, test successfully
    }

    @Test
    void displayIncompletedEvents() {
        //create todo list object
        //create several Event objects
        //set some events to completed and some to incomplete
        //loop through events in todolist, if events viewable, add them to a string variable
        //if string variable equal to expected string variable output, test successfully
    }

    @Test
    void editEventDescription() {
        //create event object
        //initialize object with name, description, and date using methods
        //use getDescription method
        //if returned value equals expected string value, tested successfully; false otherwise;
    }

    @Test
    void editEventDueDate() {
        //create event object
        //initialize object with name, description, and date using methods
        //use getDate method
        //if returned value equals expected string value, tested successfully; false otherwise;
    }

    @Test
    void editListTitle() {
        //create todoList object
        //initialize object with title
        //use getTitle method
        //if returned value equals expected string value, tested successfully; false otherwise;
    }
}