/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Cesar Hernandez
 */

package assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class toDoListController {

    @FXML
    private MenuItem AddNewToDoListButton;

    @FXML
    private MenuItem DeleteListButton;

    @FXML
    private Button addEventButton;

    @FXML
    private MenuItem allCompletedEventsButton;

    @FXML
    private MenuItem allIncompleteEventsButton;

    @FXML
    private DatePicker dateButton;

    @FXML
    private MenuItem deleteListButton;

    @FXML
    private MenuItem editEventDescriptionButton;

    @FXML
    private MenuItem editEventDueDateButton;

    @FXML
    private MenuItem editToDoListTitleButton;

    @FXML
    private TextField eventTextButton;

    @FXML
    private MenuItem loadListButton;

    @FXML
    private MenuItem markEventCompleteButton;

    @FXML
    private MenuItem saveListButton;

    @FXML
    private MenuItem showAllEventsButton;

    @FXML
    private ListView<?> toDoEventList;

    @FXML
    private TabPane tabPlane;


    @FXML
    void addEvent(ActionEvent event) {
        //when add event button is clicked
        //invoke setItems method from toDoEventList variable to
        //      add the date picker's value to string and the event text's value to string
        //      in the following format: At [date picker's to string value] do [event test's to string value]
    }

    @FXML
    void addToDoList(ActionEvent event) {
        //create new tab object and initialise with new tab method with title of "NewList"
        //invoke TabPlane's getTabs method and invoke the add method with the new tab to add a new list to the interface

    }

    @FXML
    void deleteList(ActionEvent event) {
        //prompt another javaFX screen to ask the name of to do list to remove
        //check if file path exists to name of file on computer
        //if a path is found
        //erase all data stored inside file and delete the file to remove the list from the computer's
        //memory
    }

    @FXML
    void deleteToDoList(ActionEvent event) {
        //prompt another javaFX screen to ask the name of to do list to remove
        //iterate through all tabs to find a matching name of list to remove
        //use tabPlane's method of getTabs and method of remove to remove the list from memory
    }

    @FXML
    void displayAllEvents(ActionEvent event) {
        //traverse through event list of current list object using enhanced for loop
        //set each item in the list to be viewable
    }

    @FXML
    void displayCompletedEvents(ActionEvent event) {
        //traverse through event list of current list object using enhanced for loop
        //if item's completed flag (set from another GUI screen) is true, then set item as viewable
        //if flag is not set as true, then set item as invisible to user's screen

    }

    @FXML
    void displayIncompletedEvents(ActionEvent event) {

        //traverse through event list of current list object using enhanced for loop
        //if item's completed flag (set from another GUI screen) is true, then set item as invisible to user's screen
        //if flag is not set as true, then set item as viewable
    }

    @FXML
    void editEventDescription(ActionEvent event) {

        //Open another JavaFX GUI screen to ask what user what event to edit description
        //enhanced for loop through the events in the list and search for user entered item
        //Display text box for the associated item in an editable text box.
        //User can edit text and hit save to save changes
    }

    @FXML
    void editEventDueDate(ActionEvent event) {
        //Open another JavaFX GUI screen to ask what user what event to edit due date
        //enhanced for loop through the events in the list and search for user entered item
        //Display due date picker for the associated item in a new GUI window.
        //User can edit due date and hit save to save changes
    }

    @FXML
    void editListTitle(ActionEvent event) {
        //Open another JavaFX GUI screen to ask what user what list name to edit
        //enhanced for loop through the tabs in the TabPlane object and search for user entered list name
        //Display text box for the associated list in a new GUI window.
        //User can edit list name and hit save to save changes
        //if list name entered is greater than 3 characters, save changes
        //if list name entered is not greater than 3 characters, loop back and ask again for a name
    }

    @FXML
    void getDate(ActionEvent event) {
        //return date in date picker
    }

    @FXML
    void getEvent(ActionEvent event) {
        //return event text in text box
    }

    @FXML
    void loadList(ActionEvent event) {
        //prompt user in another GUI screen to enter name of list file to get to load list into the current GUI
        //creates a file object with the path of the entered file name
        //if file doesnt exist, display error message and end class method
        //otherwise, load file and read stored text format to create list object
        //make a new tab object with the read text data and insert list tab into the GUI interface
    }

    @FXML
    void markEventComplete(ActionEvent event) {
        //have user select event in current list to mark as complete
        //upon selection, set internal event flag's value to true for marked as complete
    }

    @FXML
    void saveList(ActionEvent event) {
        //prompt user in another GUI screen to type names of lists to save
        //loop through tab names for a match
        //if a match is found, save title, events, completed flags for the events, and descriptions in a text format
        //      inside a single text file in a specific format
    }

    @FXML
    void setList(ActionEvent event) {
        //create a new instance of a listview for list object.
    }

}
