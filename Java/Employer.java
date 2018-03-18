/**
 * Author: Nathan van der Velde
 * Date Created: 2018-03-17
 * Last Modifeid By: Nathan van der Velde
 * Date Last Modified: 2018-03-18
 * Description: This class handles the source code for the Employer Object that will be used in this program.
 */

//IMPORTS
import java.io.Serializable;
import java.lang.IllegalArgumentException;

public class Employer implements Serializable
{
    /// CLASS FIELDS
    private String _emp_issued_num;
    private String _emp_name;
    private String _emp_phone;

    /**
     * DEFAULT CONSTRUCTOR
     */
    public Employer()
    {
        _emp_issued_num = "NULL";
        _emp_name = "NULL";
        _emp_phone = "NULL";
    }//END DEFAULT CONSTRUCTOR

    /**
     * ALTERNATE CONSTRUCTOR
     * @param inEmpIssNum (Employer issued num)
     * @param inEmpName (Employers name)
     * @param inEmpPhone (Employers phone number)
     * @throws IllegalArgumentException
     */
    public Employer(String inEmpIssNum, String inEmpName, String inEmpPhone) throws IllegalArgumentException
    {
        if(inEmpPhone.length() >= 8 && inEmpPhone.length() <= 13)
        {
            _emp_issued_num = inEmpIssNum;
            _emp_name = inEmpName;
            _emp_phone = inEmpPhone;
        }
        else
        {
            throw new IllegalArgumentException("Invalid phone number.");
        }//ENDIF
    }//END inEmpPhone

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\
    // ACCESSORS / MUTATORS \\
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//

    /**
     * SUBMODULE getEmpIssNum
     * @return _emp_issued_num
     */
    public String getEmpIssNum()
    {
        return _emp_issued_num;
    }//END getEmpIssNum

    /**
     * SUBMODULE setEmpIssNum
     * @param inEmpIssNum (The employer issued number)
     */
    public void setEmpIssNum(String inEmpIssNum)
    {
        _emp_issued_num = inEmpIssNum;
    }//END setEmpIssNum

    /**
     * SUBMODULE getEmpName
     * @return _emp_name (The name of the employer)
     */
    public String getEmpName()
    {
        return _emp_name;
    }//END getEmpName

    /**
     * SUBMODULE setEmpName
     * @param inEmpName (The name of the employer)
     */
    public void setEmpName(String inEmpName)
    {
        _emp_name = inEmpName;
    }//END setEmpName

    /**
     * SUBMODULE getEmpPhone
     * @return _emp_phone (The phone number of the employer)
     */
    public String getEmpPhone()
    {
        return _emp_phone;
    }//END getEmpPhone

    /**
     * SUBMODULE setEmpPhone
     * @param inEmpPhone (The phone number of the employer)
     * @throws IllegalArgumentException
     */
    public void setEmpPhone(String inEmpPhone) throws IllegalArgumentException
    {
        if(inEmpPhone.length() >= 7 && inEmpPhone.length() <= 13)
        {
            _emp_phone = inEmpPhone;
        }
        else
        {
            throw new IllegalArgumentException("Invalid phone number.");
        }
    }//END setEmpPhone

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\
    // PUBLIC DOING METHODS \\
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//

    /**
     * SUBMODULE equals
     * @return boolean (value of whether or not two objects are equal)
     */
    public boolean equals(Employer inEmp)
    {
        if(this._emp_issued_num.equals(inEmp.getEmpIssNum()))
            if(this._emp_name.equals(inEmp.getEmpName()))
                if(this._emp_phone.equals(inEmp.getEmpPhone()))
                    return true;//ENDIF
        return false;
    }//END equals
}//END class Employer