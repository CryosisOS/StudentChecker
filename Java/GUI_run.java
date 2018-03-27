/**
 * Author: Nathan van der Velde
 * Date Created: 2018-03-19
 * Last Modified By: 2018-03-27
 * Date Last Modified: Nathan van der Velde
 */

//IMPORTS
import javafx.application.Application;
import javafx.scene.Scene;
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
        //Creating the original scene
        GUI_scene_fileGrabber scene_fileGrabber = new GUI_scene_fileGrabber();
        //Creating the main scene

        /*These are the last lines of start method */
        stage.setTitle(PROGRAM_TITLE);// Set a title for the Stage - Zyosis -> The name of the program
        stage.setScene(scene_fileGrabber.getScene());
        stage.show();// Showing the stage
    }//END start
}//END class GUI_run