/**
 * Author: Nathan van der Velde
 * Date Created: 2018-03-19
 * Last Modified By: 2018-05-28
 * Date Last Modified: Nathan van der Velde
 */

//IMPORTS
import entities.internal.DigitalFile;
import gui.GUI_scene_fileGrabber;
import gui.GUI_scene_tableView;
import javafx.application.Application;
import javafx.stage.Stage;

public class GUI_run extends Application
{
    //PROGRAM CONSTANT
    public static final String PROGRAM_TITLE = "Zyosis - Anomoly Detector";

    public static void main(String [] args)
    {
        //Launch the JavaFX application
        Application.launch(args);
    }//END main
    
    @Override
    public void start(Stage stage)
    {
        DigitalFile digital_fileOne = new DigitalFile();
        DigitalFile digital_fileTwo = new DigitalFile();
        //Creating the original scene
        GUI_scene_fileGrabber scene_fileGrabber = new GUI_scene_fileGrabber(digital_fileOne, digital_fileTwo);
        //Creating the main scene
        GUI_scene_tableView scene_tableView = new GUI_scene_tableView(digital_fileOne, digital_fileTwo);

        //COMMENTED OUT SO I CAN START WORKING ON NEW SCENE
        /*stage.setScene(scene_fileGrabber.getScene());*/
        //COMMENTED OUT SO I CAN START WORKING ON NEW SCENE

        stage.setScene(scene_tableView.getScene());

        /*These are the last lines of start method */
        stage.setTitle(PROGRAM_TITLE);// Set a title for the Stage - Zyosis -> The name of the program
        stage.show();// Showing the stage
    }//END start
}//END class GUI_run