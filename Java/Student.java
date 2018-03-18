/**
 * Author: Nathan van der Velde
 * Date Created: 2018-03-17
 * Last Modified By: Nathan van der Velde
 * Date Last Modified: 2018-03-18
 * Description: This class contains the source code the Student Objects that will be used in this program.
 */

//IMPORTS
import java.io.Serializable;

public class Student implements Serializable
{
    /*
     * The class fields that this Object has purely depend on the CSV format being used.
     * It is assumed the format will not be changed from the format provided for development.
     * The class fields are assumed to be constant for this version of the program.
     */
    //CLASS FIELDS
    private String _id;                         //index 00
    private String _surname;                    //index 01
    private String _firstname;                  //index 02
    private String _regno;                      //index 03
    private Rto _rto_details;                   //index 04 = _rto_issued_num, 08 = _rto_num, 09 = _rto_name
    private Employer _emp_details;              //index 05 = _emp_issued_num, 11 = _emp_name, 12 = _emp_phone
    private String _email;                      //index 06
    private String _mobile;                     //index 07
    private String _campus_name;                //index 10
    private String _status;                     //index 13
    private String _start_date;                 //index 14
    private String _expected_completion;        //index 15
    private String _active_weeks;               //index 16
    private String _cards_submitted;            //index 17
    private String _cards_verified;             //index 18
    private String _outstanding_cards;          //index 19
    private Units _units;                       //index 20 -> n | n = number of Units

    /**
     * DEFAULT CONSTRUCTOR
     */
    public Student()
    {
        _id = "NULL";
        _surname = "NULL";
        _firstname = "NULL";
        _regno = "NULL";
        _rto_details = new Rto();
        _emp_details = new Employer();
        _email = "NULL";
        _mobile = "NULL";
        _campus_name = "NULL";
        _status = "NULL";
        _start_date = "NULL";
        _expected_completion = "NULL";
        _active_weeks = "NULL";
        _cards_submitted = "NULL";
        _cards_verified = "NULL";
        _outstanding_cards = "NULL";
        _units = new Units();
    }//END DEFAULT CONSTRUCTOR

    /**
     * ALTERNATE CONSTRUCTOR #1
     */
    public Student(String [] studentDetails)
    {
        _id = studentDetails[0];                                                                        //index 00
        _surname = studentDetails[1];                                                                   //index 01
        _firstname = studentDetails[2];                                                                 //index 02
        _regno = studentDetails[3];                                                                     //index 03
        _rto_details = new Rto(studentDetails[4], studentDetails[8], studentDetails[9]);                //index 04 = _rto_issued_num, 08 = _rto_num, 09 = _rto_name
        _emp_details = new Employer(studentDetails[5], studentDetails[11], studentDetails[12]);         //index 05 = _emp_issued_num, 11 = _emp_name, 12 = _emp_phone
        _email = studentDetails[6];                                                                     //index 06
        _mobile = studentDetails[7];                                                                    //index 07
        _campus_name = studentDetails[10];                                                              //index 10
        _status = studentDetails[13];                                                                   //index 13
        _start_date = studentDetails[14];                                                               //index 14
        _expected_completion = studentDetails[15];                                                      //index 15
        _active_weeks = studentDetails[16];                                                             //index 16
        _cards_submitted = studentDetails[17];                                                          //index 17
        _cards_verified = studentDetails[18];                                                           //index 18
        _outstanding_cards = studentDetails[19];                                                        //index 19
        String [] temp = new String[studentDetails.length-20];                                          //index 20 -> n | n = number of Units
        for(int ii=0;ii<temp.length;ii++)
        {
            temp[ii] = studentDetails[ii+20];
        }//END FOR
        _units = new Units(temp);
    }//END ALTERNATE CONSTRUCTOR

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\
    // ACCESSORS / MUTATORS \\
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//

    public String getId()
    {
        return _id;
    }//END getId

    public String getSurname()
    {
        return _surname;
    }//END getSurname

    public String getFirstname()
    {
        return _firstname;
    }//END getFirstname

    public String getRegno()
    {
        return _regno;
    }//END getRegno

    public Rto getRtoDetails()
    {
        return _rto_details;
    }//END getRtoDetails

    public Employer getEmpDetails()
    {
        return _emp_details;
    }//END getEmpDetails

    public String getEmail()
    {
        return _email;
    }//END getEmail

    public String getMobile()
    {
        return _mobile;
    }//END getMobile

    public String getCampusName()
    {
        return _campus_name;
    }//END getStatus

    public String getStatus()
    {
        return _status;
    }//END getStatus

    public String getStartDate()
    {
        return _start_date;
    }//END getStartDate

    public String getExpectedCompletion()
    {
        return _expected_completion;
    }//END getExpectedCompletion

    public String getActiveWeeks()
    {
        return _active_weeks;
    }//END getActiveWeeks

    public String getCardsSubmitted()
    {
        return _cards_submitted;
    }//END getCardsSubmitted

    public String getCardsVerified()
    {
        return _cards_verified;
    }//END getCardsVerfified

    public String getOutstandingCards()
    {
        return _outstanding_cards;
    }//END getOutstandingCards

    public Units getUnits()
    {
        return _units;
    }//END getUnits

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\
    // PUBLIC DOING METHODS \\
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//

    public boolean equals(Student inStudent)
    {
        if(this._id.equals(inStudent.getId()))
            if(this._surname.equals(inStudent.getSurname()))
                if(this._firstname.equals(inStudent.getFirstname()))
                    if(this._regno.equals(inStudent.getRegno()))
                        if(this._rto_details.equals(inStudent.getRtoDetails()))
                            if(this._emp_details.equals(inStudent.getEmpDetails()))
                                if(this._email.equals(inStudent.getEmail()))
                                    if(this._mobile.equals(inStudent.getMobile()))
                                        if(this._campus_name.equals(inStudent.getCampusName()))
                                            if(this._status.equals(inStudent.getStartDate()))
                                                if(this._start_date.equals(inStudent.getStartDate()))
                                                    if(this._expected_completion.equals(inStudent.getExpectedCompletion()))
                                                        if(this._active_weeks.equals(inStudent.getActiveWeeks()))
                                                            if(this._cards_submitted.equals(inStudent.getCardsSubmitted()))
                                                                if(this._cards_verified.equals(inStudent.getOutstandingCards()))
                                                                    if(this._units.equals(inStudent.getUnits()))
                                                                        return true;
        return false;
    }//END equals

}//END class Student