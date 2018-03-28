/***************
*Name: Barnabas Madai
*FileName: Tables.java
*Purpose: Stores the two tables.
*Last Modified 28/03/2018
*BY: Barnabas Madai
***************/
import java.util.ArrayList;
public class Tables
{
    //CSVParser is a classfield as it will 
    //store respective parsing errrors, not yet implemented
    private CSVParser csvParserA;
    private CSVParser csvParserB;
    //Stores each table
    private ArrayList tableA;
    private ArrayList tableB;
    //stores each original file, incase needed
    private DigitalFile tableAFile;
    private DigitalFile tableBFile;
    public Tables(DigitalFile inTableAFile,DigitalFile inTableBFile)
    {
        tableAFile = inTableAFile;
        tableBFile = inTableBFile;
        //file is first loaded into a csv parser.
        csvParserA = new CSVParser(
        tableAFile.getFile()
        );
        csvParserA.nullify();
        tableA = new ArrayList();
        
        for(int i = 0; i < csvParserA.length();i++)
        {
            tableA.add(new Student(
            csvParserA.getValues(i)));
        }
        Sorts.sortArrayList(tableA);
        for(int i = 0; i < tableA.size();i++)
        {
            System.out.println(((Student)(tableA.get(i))).toString());
        }
        csvParserB = new CSVParser(
        tableBFile.getFile());
        csvParserB.nullify();
        tableB = new ArrayList();
        for(int i = 0; i < csvParserB.length();i++)
        {
            tableB.add(new Student(
            csvParserB.getValues(i)));
        }
        Sorts.sortArrayList(tableB);
 
    }//END OF ALTERNATE CONSTRUCTOR

    

}
