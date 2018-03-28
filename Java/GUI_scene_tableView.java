/**
 * Author: Nathan van der Velde
 * Date Created: 2018-03-28
 * Last Modified By: --
 * Date Last Modified: --
 */

//IMPORTS
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
}//END class GUI_scene_tableView