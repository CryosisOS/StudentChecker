/***************
*Name: Barnabas Madai
*FileName: Tables.java
*Purpose: Stores the two tables.
***************/
import java.util.ArrayList;
public class Tables
{
    //CSVParser is a classfield as it will 
    //store respective parsing errrors, not yet implemented
    private CSVParser csvParserA;
    private CSVParser csvParserB;
    private ArrayList tableA;
    private ArrayList tableB;

    public Tables(String tableAName,String tableBName)
    {
        if(FileIO.isFileExist(tableAName))
        {
            //file is first loaded into a csv parser.
            csvParserA = new CSVParser(
            FileIO.readFile(tableAName));
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
        }
        else
        {
            throw new IllegalArgumentException(
            "The first name provided does not exist.");
        }

        if(FileIO.isFileExist(tableBName))
        {
            csvParserB = new CSVParser(
            FileIO.readFile(tableBName));
            csvParserB.nullify();
            tableB = new ArrayList();
            for(int i = 0; i < csvParserB.length();i++)
            {
                tableB.add(new Student(
                csvParserB.getValues(i)));
            }
            Sorts.sortArrayList(tableB);
        }
        else
        {
            throw new IllegalArgumentException(
            "The second name provided does not exist.");
        }
    }

    public ArrayList getTableA()
    {
        return tableA;
    }

    public ArrayList getTableB()
    {
        return tableB;
    }
}
