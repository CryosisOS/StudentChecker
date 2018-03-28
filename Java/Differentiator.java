/*****************
*Name: Barnabas Madai
*FileName: Differentiator.java
*Purpose: Declares and initialises all methods necessary for
*         the program tto function.
*Last Modified: 28/03/2018
*By: Barnabas Madai
*****************/

public class Differentiator
{
    DigitalFile digitalFileA;
    DigitalFile digitalFileB;
    //stores the tables.
    Tables tables;
    //Detects differences in the tables stored in a Tables object.
    AnomalyDetector anomalyDetector;
    public Differentiator()
    {
        digitalFileA = new DigitalFile(new Directory(UserInput.getString(
        "Provide the directory of the first table.")));
        digitalFileB = new DigitalFile(new Directory(UserInput.getString(
        "Provide the directory of the second table.")));
        tables = new Tables(digitalFileA,
        digitalFileB);
        anomalyDetector = new AnomalyDetector(tables);
    }//END DEFAULT CONSTRUCTOR
}//END DIFFERENTIATOR
