//Utilised in CSVParser
public class StringManipulator
{
    public static int count(String text,char input)
    {
        int counter = 0;
        for(int i=0; i<text.length(); i++ ) 
        {
            if(text.charAt(i) == input) 
            {
                counter++;
            } 
        }
        return counter;
    }
}
