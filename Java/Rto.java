/**
 * Author: Nathan van der Velde
 * Date Created: 2018-03-18
 * Last Modified By: --
 * Date Last Modified: --
 * Description: This class contains the source code the RTO Objects that will be used in this program.
 */

 //IMPORTS
import java.io.Serializable;

public class Rto implements Serializable
{
    //CLASS FIELDS
    private String _rto_issued_num;
    private String _rto_num;
    private String _rto_name;

    /**
     * DEFAULT CONSTRUCTOR
     */
    public Rto()
    {
        _rto_issued_num = "NULL";
        _rto_num = "NULL";
        _rto_name = "NULL";
    }

    /**
     * ALTERNATE CONSTRUCTOR
     * @param inRtoIssNum (The RTO issued number)
     * @param inRtoNum (The number of the RTO) //This could be the phone number, need to check on that.
     * @param inRtoName (The name of the RTO).
     */
    public Rto(String inRtoIssNum, String inRtoNum, String inRtoName)
    {
        _rto_issued_num = inRtoIssNum;
        _rto_num = inRtoNum;
        _rto_name = inRtoName;
    }//END ALTERNATE CONSTRUCTOR

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\
    // ACCESSORS / MUTATORS \\
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//

    /**
     * SUBMODULE getRtoIssNum
     * @return _rto_issued_num (The RTO issued number)
     */
    public String getRtoIssNum()
    {
        return _rto_issued_num;
    }//END getRtoIssNum

    /**
     * SUBMODULE setRtoIssNum
     * @param inRtoIssNum (The RTO issued number)
     */
    public void setRtoIssNum(String inRtoIssNum)
    {
        _rto_issued_num = inRtoIssNum;
    }//END setRtoIssNum

    /**
     * SUBMODULE getRtoNum
     * @return _rto_num (The number of the RTO)
     */
    public String getRtoNum()
    {
        return _rto_num;
    }//END getRtoNum

    /**
     * SUBMODULE setRtoNum
     * @param inRtoNum (The number of the RTO)
     */
    public void setRtoNum(String inRtoNum)
    {
        _rto_num = inRtoNum;
    }//END setRtoNum

    /**
     * SUBMODULE getRtoName
     * @return _rto_name (The name of the RTO)
     */
    public String getRtoName()
    {
        return _rto_name;
    }//END getRtoName

    /**
     * SUBMODULE setRtoName
     * @param _rto_name (The name of the RTO)
     */
    public void setRtoName(String inRtoName)
    {
        _rto_name = inRtoName;
    }//END setRtoName

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\
    // PUBLIC DOING METHODS \\
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//

    /**
     * SUBMODULE equals
     * @param inRto (The Rto Object that is being compared against this one)
     * @return boolean (The value of whether or not the two Objects are equal)
     */
    public boolean equals(Rto inRto)
    {
        if(this._rto_issued_num.equals(inRto.getRtoIssNum()))
            if(this._rto_num.equals(inRto.getRtoNum()))
                if(this._rto_name.equals(inRto.getRtoName()))
                    return true;
        return false;
    }//END equals
}//END class Rto