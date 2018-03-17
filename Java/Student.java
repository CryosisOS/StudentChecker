/**
 * Author: Nathan van der Velde
 * Date Created: 2018-03-17
 * Last Modified By: --
 * Date Last Modified: --
 * Description: This class contains the source code the Student Objects that will be used in this program.
 */

public class Student
{
    /*
     * The class fields that this Object has purely depend on the CSV format being used.
     * It is assumed the format will not be changed from the format provided for development.
     * The class fields are assumed to be constant for this version of the program.
     */
    //CLASS FIELDS
    private String _id;                         //index 01
    private String _surname;                    //index 02
    private String _firstname;                  //index 03
    private String _regno;                      //index 04
    private String _rto_issued_num;             //index 05
    private Employer _emp_details;              //index 06 = _emp_issued_num, 12 = _emp_name, 13 = _emp_phone
    private String _email;                      //index 07
    private String _mobile;                     //index 08
    private String _rto_num;                    //index 09
    private String _rto_name;                   //index 10
    private String _campus_name;                //index 11
    private String _status;                     //index 14
    private String _start_date;                 //index 15
    private String _expected_completion;        //index 16
    private String _active_weeks;               //index 17
    private String _cards_submitted;            //index 18
    private String _cards_verified;             //index 19
    private String _outstanding_cards;          //index 20
    private Units _units;                       //index 21 - 44

    /**
     * DEFAULT CONSTRUCTOR
     */
    public Student()
    {

    }//END DEFAULT CONSTRUCTOR

}//END class Student