/**************
*Name: Barnabas Madai
*File Name: entities.internal.DigitalFile.java
*Purpose: recieves a entities.internal.Directory object,
*which it will use to open and read the file found there.
*Last Modified:28/03/2018
*BY: Barnabas Madai
**************/

package entities.internal;

//IMPORTS
import io.file.FileIO;

public class DigitalFile
{
    Directory location;
    String file;

    public DigitalFile(Directory inDirectory)
    {
        location = inDirectory;
        file = FileIO.readFile(location.toString());
    }//END OF ALTERNATE CONSTRUCTOR

    public DigitalFile()
    {
        location = null;
        file = null;
    }//END OF DEFAULT CONSTRUCTOR

    public void create(Directory inDirectory)
    {
        if(location == null)
        {
            location = inDirectory;
            file = FileIO.readFile(location.toString());
        }
        else
        {
            throw new IllegalArgumentException(
            "Error.\n"+
            "entities.internal.DigitalFile already has a location. create a new one.");
        }
    }//END OF CREATE SUBMODULE

    public String getFile()
    {
        return file;
    }//END OF FILE GETTER

    public String getLocation()
    {
        return location.toString();
    }//END OF LOCATION GETTER
}
