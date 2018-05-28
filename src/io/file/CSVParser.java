/*************
 * Name: Barnabas Madai
 * FileName: io.file.CSVParser.java
 * Purpose: Stores a csv file and the  methods to manipulate it.
 *          In more detail. First and foremost, 
 *          verifies if the csv file is in correct syntax.
 * Last Modified: 2018-05-28
 * By: Nathan van der Velde
 * **********/

package io.file;

//IMPORTS
import algorithms.entities.StringManipulator;

public class CSVParser
{
    //Structured storage of the csv file.
    //Each entry is a line in the csv file
    private Entry entries[];
    //Recieves a csv file as string and structures it.
    public CSVParser(String inFile)
    {
        String csv = inFile;
        //each line is an entry, except the first one.
        String tmp[] = csv.split("\n");
        entries = new Entry[tmp.length-1];
        for(int i = 0; i < entries.length; i++)
        {
            entries[i] = new Entry(tmp[i+1]);
        }
    }
    

    //Not Needed Here!!!
    //Counts the number of entries, with a given Title.
    //inTitle represents the title being looked for.
    public int countEntries(String inTitle)
    {
        int result = 0;
        for(int i = 0; i < entries.length; i++)
        {
            if(entries[i].getTitle().equals(inTitle))
            {
                result ++;
            }
        }
        return result;
    }

    //returns a string array of all the values of an entry.
    public String[] getValues(int index)
    {
        String result[] = null; 
        if(index < entries.length)
        {
            result = new String[entries[index].length()];
            for(int i = 0; i < result.length;i++)
            {
                result[i] = entries[index].getValue(i);
            }
        }
        else
        {
            throw new IllegalArgumentException(
            "Error.\n"+
            "Index provided in io.file.CSVParser.getValues() is too high.");
        }
        return result;
    }

    public String toString()
    {
        String result = "";
        for(int i = 0; i < entries.length; i++)
        {
            if(i != 0)
            {
                result+= "\n";
            }
            result += entries[i].toString();
        }
        result += "\n";
        return result;
    }

    public boolean equals(String inCSV)
    {
        return toString().equals(inCSV);
    }

    //Sets all empty values in fields to 
    public void nullify()
    {
        for(int i = 0; i < entries.length; i++)
        {
            entries[i].nullify();
        }
    }

    public int length()
    {
        return entries.length;
    }

    //private class, represents a line in the csv file.
    private class Entry
    {
        //Title of Entry (the first word). Not utilised here.
        private Title title;
        //All other content (Abiding by the syntax ofcourse.)
        private Field fields[];
        
        //Recieves a line from the csv file as string
        public Entry(String inLine)
        {
            String tmp[] = inLine.split(",",-1);
            //title = new Title(tmp[0]);
            fields = new Field[tmp.length];
            for(int i = 0; i < tmp.length; i++)
            {
                fields[i] = new Field(tmp[i]);
            }
        }

        public String getTitle()
        {
            return title.toString();
        }

        //returns a field
        public String getField(int index)
        {
            Field result;
            if(index < fields.length)
            {
                result = fields[index];
            }
            else
            {
                throw new IllegalArgumentException();
            }
            return result.toString();
        }

        //returns the value of the 'index'th field
        public String getValue(int index)
        {
            String value = "";
            if(index < fields.length)
            {
                value = fields[index].getValue();
            }
            else
            {
                throw new IllegalArgumentException(
                "Error.\n"+
                "Index provided in io.file.CSVParser is too large.");
            }
            return value;
        }

        public void nullify()
        {
            for(int i = 0; i < fields.length;i++)
            {
                fields[i].nullify();
            }
        }
  
        public String toString()
        {
            String result = "";
            //result += title.toString();
            for(int i = 0; i < fields.length;i++)
            {
                if(i != 0)
                {
                    result += ",";
                }
                result += fields[i].toString();
            }
            return result;
        }

       public int length()
       {
           return fields.length;
       }

        //ATTENTION!!
        //this csv format does not have title s, therefore this is ignored.
        private class Title
        {
            String title;

            public Title(String inTitle)
            {
                int divider1 = StringManipulator.count(inTitle,'=');
                int divider2 = StringManipulator.count(inTitle,':');
                if(divider1 == 0 && divider2 == 0)
                {
                    title = inTitle;
                }
                else
                {
                    throw new IllegalArgumentException(
                    "Title has properties of a field.");
                }
            }
            
            public String toString()
            {
                return title;
            }
        }

        //Represents a field of an Entry.
        private class Field
        {
            String value;
            
            public Field(String inField)
            {
                value = inField;
            }

            public void nullify()
            {
                if(value.equals(""))
                {
                    value = "NULL";
                }
            }

            public String toString()
            {
                String result = "";
                result += value;
                return result;
            }
            
            public String getValue()
            {
                return value;
            }
        }
    }


}
