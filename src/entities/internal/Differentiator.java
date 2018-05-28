/*****************
*Name: Barnabas Madai
*FileName: entities.internal.Differentiator.java
*Purpose: Declares and initialises all methods necessary for
*         the program tto function.
*Last Modified: 2018-05-28
*By: Nathan van der Velde
*****************/

//TODO Figure out what anomaly detector is meant to do and fix it.

package entities.internal;

//IMPROTS
import entities.internal.DigitalFile;
import entities.internal.Directory;
import io.terminal.UserInput;


public class Differentiator
{
    DigitalFile digitalFileA;
    DigitalFile digitalFileB;
    //stores the tables.
    Tables tables;
    //Detects differences in the tables stored in a entities.internal.Tables object.
    //TODO: Figure this out AnomalyDetector anomalyDetector;
    public Differentiator()
    {
        digitalFileA = new DigitalFile(new Directory(UserInput.getString(
        "Provide the directory of the first table.")));
        digitalFileB = new DigitalFile(new Directory(UserInput.getString(
        "Provide the directory of the second table.")));
        tables = new Tables(digitalFileA,
        digitalFileB);
        //TODO: Figure this out anomalyDetector = new AnomalyDetector(tables);
    }//END DEFAULT CONSTRUCTOR
}//END DIFFERENTIATOR
