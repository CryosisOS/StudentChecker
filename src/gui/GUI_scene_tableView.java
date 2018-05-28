/**
 * Author: Nathan van der Velde
 * Date Created: 2018-03-28
 * Last Modified By: Nathan van der Velde
 * Date Last Modified: 2018-05-28
 */

package gui;

//IMPORTS
import entities.internal.DigitalFile;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class GUI_scene_tableView
{
    //CLASS FIELDS
    Scene _scene;
    /**
     * DEFAULT CONSTRUCTOR
     */
    public GUI_scene_tableView(DigitalFile digital_fileOne, DigitalFile digital_fileTwo)
    {
        //First line of Default Constructor
        BorderPane layout = new BorderPane();


        //Last line of Default Constructor
        _scene = new Scene(layout);
    }//END DEFAULT CONSTRUCTOR

    /**
     * SUBMODULE getScene
     * @return _scene
     */
    public Scene getScene()
    {
        return _scene;
    }//END getScene
}//END class gui.GUI_scene_tableView