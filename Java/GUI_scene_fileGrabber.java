/**
 * Author: Nathan van der Velde
 * Date Created: 2018-03-27
 * Last Modified By: --
 * Date Last Modified: --
 */

//IMPORTS
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class GUI_scene_fileGrabber
{
    //Class Fields
    private Scene _scene;

    /**
     * DEFAULT CONSTRUCTOR
     */
    public GUI_scene_fileGrabber()
    {
        //Creating the FileObjects
        //DigitalFile fileOne = new DigitalFile();
        //DigitalFile fileTwo = new DigitalFile();
        //Creating the VBox root
        VBox root = new VBox();
        root.setSpacing(5);

        /*
         * The section where the nav bar is made - one option File <- load, exit,
         */

        HBox navbar = new HBox();

        ChoiceBox choiceBox_file = new ChoiceBox();
        choiceBox_file.setItems(FXCollections.observableArrayList("File",new Separator(), "Load","Exit"));
        choiceBox_file.setValue("File");
        navbar.getChildren().add(choiceBox_file);
        
        //END THIS SECTION
        root.getChildren().add(navbar);

        //Creating the initial message
        Label ini_msg = new Label("Please enter in the file paths to the wanted files.");
        VBox.setMargin(ini_msg, new Insets(5, 10, 5, 10));//top - right - bottom - left
        ini_msg.setAlignment(Pos.TOP_CENTER);
        root.getChildren().add(ini_msg);

        //Creating the Pane
        HBox file_path_one = new HBox();
        HBox file_path_two = new HBox();
        /*
         * CREATING LABELS AND BUTTONS
         */
        Label label_namefilePathOne = new Label("File one: ");
        HBox.setMargin(label_namefilePathOne, new Insets(2,1,2,10));//top - right - bottom - left
        file_path_one.getChildren().add(label_namefilePathOne);
        TextField text_nameFilePathOne = new TextField();
        HBox.setMargin(text_nameFilePathOne, new Insets(2,4,2,2));//top - right - bottom - left
        HBox.setHgrow(text_nameFilePathOne, Priority.ALWAYS);
        file_path_one.getChildren().add(text_nameFilePathOne);

        Label label_namefilePathTwo = new Label("File two: ");
        HBox.setMargin(label_namefilePathTwo, new Insets(2,1,2,10));//top - right - bottom - left
        file_path_two.getChildren().add(label_namefilePathTwo);
        TextField text_nameFilePathTwo = new TextField();
        HBox.setMargin(text_nameFilePathTwo, new Insets(2,4,2,2));//top - right - bottom - left
        HBox.setHgrow(text_nameFilePathTwo, Priority.ALWAYS);
        file_path_two.getChildren().add(text_nameFilePathTwo);

        //Adding the file_paths grid pane to the root VBox.
        root.getChildren().addAll(file_path_one, file_path_two);

        /*
         * CREATING BUTTONS
         */
        HBox buttons = new HBox();
        buttons.setAlignment(Pos.CENTER_RIGHT);

        Button button_ok = new Button("Ok");
        button_ok.setPrefSize(60, 15);//width - height
        HBox.setMargin(button_ok, new Insets(1));
        buttons.getChildren().add(button_ok);

        Button button_cancel = new Button("Cancel");
        button_cancel.setPrefSize(60, 15);//width - height
        HBox.setMargin(button_cancel, new Insets(1));
        buttons.getChildren().add(button_cancel);

        Button button_exit = new Button("Exit");
        button_exit.setPrefSize(60, 15);//width - height
        HBox.setMargin(button_exit, new Insets(1,4,1,1));//top - right - bottom - left
        buttons.getChildren().add(button_exit);

        //Adding the buttons grid pane to the root VBox.
        root.getChildren().add(buttons);

        /**
         * Creating the Button Handlers
         */
        button_ok.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent e)
            {
                //try
                //{
                    //fileOne.setFilePath(file_path_one.getChildren().get(1).getAccessibleText());//returns string from textfield
                //}//END TRY
                //catch(FileNotFoundException fnfex)
                //{
                   //Output message saying file(s) not found try again.
                //}//END CATCH
                //try
                //{
                    //fileTwo.setFilePath(file_path_two.getChildren().get(1).getAccessibleText());//returns string from textfield
                //}//END TRY
                //catch(FileNotFoundException fnfex)
                //{

                //}//END CATCH 
            }//END handle
        });//END anonymous class

        button_cancel.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent e)
            {
                text_nameFilePathOne.setText("");
                text_nameFilePathTwo.setText("");
            }//END handle
        });//END anonymous class

        button_exit.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent e)
            {
                Platform.exit();
            }//END Handle
        });//END anonymous class
        /**
         * End of creating the button handlers
         */
        _scene = new Scene(root, 350, 132);// width - height
    }//END DEFAULT CONSTRUCTOR

    /**
     * SUBMODULE getScene
     * @return _scene (Scene Object)
     */
    public Scene getScene()
    {
        return _scene;
    }//END getScene
}//END class GUI_scene_fileGrabber