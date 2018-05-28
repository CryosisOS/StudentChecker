/**
 * Author: Nathan van der Velde
 * Date Created: 2018-03-17
 * Last Modifeid By: --
 * Date Last Modified: --
 * Description: This class handles all the userInput.
 */

package io.terminal;

//IMPORTS
import java.lang.IllegalArgumentException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.out;

public class UserInput
{
    /**
     * Submodule getInteger
     * @param prompt (The prompt to prompt to the user)
     * @param parameters (should only be a max of three ints, 1st = lower, 2nd = upper, 3rd = exception)
     * @return input (The integer that the user inputs)
     */
    public static int getInteger(String prompt, int [] parameters)
    {
        /// DECLERATION OF VARIABLES
        int input = 0;

        /// DEFINEMENT OF METHOD
        try
        {
            if(parameters.length==2)
            {
                input = twoParamGetInteger(prompt, parameters);
            }
            else if(parameters.length==3)
            {
                input = threeParamGetInteger(prompt, parameters);
            }
            else
            {
                throw new IllegalArgumentException("Invalid parameters sent to method. Received: "+parameters.length+" Expected 2 or 3");
            }//ENDIF
        }//END TRY
        catch(IllegalArgumentException iaex)
        {
            out.print("There was an error in getting user input.\n");
            out.println(iaex.getMessage());
            iaex.printStackTrace();
        }//END CATCH
        return input;
    }//END getInteger

    /**
     * SUBMODULE getString
     * @param prompt (The prompt to prompt to the user)
     * @return input (The string inputted by the user)
     */
    public static String getString(String prompt)
    {
        /// DECLERATION OF VARIABLES
        String input;
        Scanner sc = new Scanner(System.in);

        /// DEFINEMENT OF METHOD
        do
        {
            out.println(prompt);
            input = sc.next();
        }while(input.equals(""));
        //sc.close();
        return input;
    }//END getString

    /*
     * PRIVATE METHODS FOR THIS CLASS
     */
    private static int twoParamGetInteger(String prompt, int[] parameters)
    {
        /// DECLERATION OF VARIABLES
        int input = 0;
        int repeatNumber = 0;
        boolean isNotValid = true;
        Scanner sc = new Scanner(System.in);

        /// DEFINEMENT OF METHOD
        do
        {
            isNotValid = true;
            try
            {
                out.println(prompt);
                sc.reset();
                input = sc.nextInt();
                while(input < parameters[0] || input > parameters[2])
                {
                    out.print("This is not a valid input. Please try again.\n");
                    out.print("\n");
                    repeatNumber++;
                    if(repeatNumber==3)
                    {
                        repeatNumber = 0;
                        out.println(prompt);
                    }//ENDIF
                    input = sc.nextInt();
                }//END WHILE
                isNotValid = false;
            }//END TRY
            catch(InputMismatchException immex)
            {
                out.print("You have not input an integer, please try again\n");
                sc.reset();
                sc.next();
                isNotValid = true;
            }//END CATCH
        }while(isNotValid);//END DO-WHILE
        sc.close();
        return input;
    }//END twoParamGetInteger

    private static int threeParamGetInteger(String prompt, int[] parameters)
    {
        /// DECLERATION OF VARIABLES
        int input = 0;
        int repeatNumber = 0;
        boolean isNotValid = true;
        Scanner sc = new Scanner(System.in);

        /// DEFINEMENT OF METHOD
        do
        {
            isNotValid = true;
            try
            {
                out.println(prompt);
                sc.reset();
                input = sc.nextInt();
                while(input < parameters[0] || input > parameters[2] && input != parameters[2])
                {
                    out.print("This is not a valid input. Please try again.\n");
                    out.print("\n");
                    repeatNumber++;
                    if(repeatNumber==3)
                    {
                        repeatNumber = 0;
                        out.println(prompt);
                    }//ENDIF
                    input = sc.nextInt();
                }//END WHILE
                isNotValid = false;
            }//END TRY
            catch(InputMismatchException immex)
            {
                out.print("You have not input an integer, please try again\n");
                sc.reset();
                sc.next();
                isNotValid = true;
            }//END CATCH
        }while(isNotValid);//END DO-WHILE
        sc.close();
        return input;
    }//END twoParamGetInteger
}//END class io.terminal.UserInput
