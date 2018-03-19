/**
 * Author: Nathan van der Velde
 * Date Created: 2018-03-19
 * Last Modified By: --
 * Date Last Modified: --
 */

//IMPORTS
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
        // Set a title for the Stage - Zyosis -> The name of the program
        stage.setTitle(PROGRAM_TITLE);
        // Showing the stage
        stage.show();
    }//END start
    
}//END class GUI_run