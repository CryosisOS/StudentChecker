/**
 * Name: BArnabas Madai
 * FileName: io.file.FileIO.java
 * Description: Reads and writes files.
 */
package io.file;

import java.io.*;

public class FileIO
{
    //returns true if directory provided exists
    public static boolean isFileExist(String directory)
    {
        File f = new File(directory);
        return (f.exists() && !f.isDirectory());
    }
    
    //deletes given file.
    public static boolean delete(String directory)
    {
        File f = new File(directory);
        return f.delete();
    }
    
    //reads file.
    public static String readFile(String directory)
    {
        String text = "";
        String line = null;
        
        try
        {
            FileReader fileReader = new FileReader(directory);
            
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null)
            {
                text += line + "\n";
            }
            bufferedReader.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Unable to open the file: " + directory);
        }
        catch(IOException e)
        {
            System.out.println("Error reading the file: " + directory);
        }
        return text;
    }

    //writes file.
    public static void writeFile(String inFile, String inName)
    {
        BufferedWriter writer = null;
        try
        {
            writer = new BufferedWriter( new FileWriter( inName));
            writer.write(inFile);
        }
        catch ( IOException e)
        {
        }
        finally
        {
            try
            {
                if ( writer != null)
                    writer.close( );
            }
            catch ( IOException e)
            { 
            }
        }
    }
 
    //returns size of file in bytes
    public static long fileSize(String directory)
    {
        File f = new File(directory);
        return f.length();
    }
    //creates a blank file
    public static void createFile(String directory)
    {
        PrintWriter writer = null;
        try
        {
            writer = new PrintWriter(directory,"UTF-8");
            writer.write("");
            writer.close();
        }
        catch(IOException e)
        {
            writer.close();
        }
        
    }
}
