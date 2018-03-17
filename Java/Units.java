/**
 * Author: Nathan van der Velde
 * Date Created: 2018-03-17
 * Last Modified By: --
 * Date Last Modified: --
 * Description: This class contains the source code the Units Objects that will be used in this program.
 */

public class Units
{
    //CLASS CONSTANTS
    private static final int _INITIAL_SIZE = 10;
    //CLASS FIELDS
    private String [] _units;

    /**
     * DEFAULT CONSTRUCTOR
     */
    public Units()
    {
        _units = new String[_INITIAL_SIZE];
        for(int ii=0;ii<units.length;ii++)
        {
            _units[ii] = "NULL";
        }//END FOR
    }//END DEFAULT CONSTRUCTOR

    /**
     * ALTERNATE CONSTRUCTOR
     * @param inUnits (Array containing units)
     */
    public Units(String [] inUnits)
    {
        setUnits(inUnits);
    }//END ALTERNATE CONSTRUCTOR

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\
    // ACCESSORS / MUTATORS \\
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//

    /**
     * SUBMODULE setUnits
     * @param inUnits (Array containing units)
     */
    public void setUnits(String [] inUnits)
    {
        _units = new String[inUnits.length];
        for(int ii=0;ii<_units.length;ii++)
        {
            _units[ii] = inUnits[ii];
        }//END FOR
    }//END setUnits

    /**
     * SUBMODULE getUnits
     * @return _units (reference to a copy of _units)
     */
    public String [] getUnits()
    {
        String [] outArr = new String[_units.length];
        for(int ii=0;ii<outArr.length;ii++)
        {
            outArr[ii] = _units[ii];
        }
        return outArr;
    }//END getUnits

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\
    // PUBLIC DOING METHODS \\
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//

    /**
     * SUBMODULE equals
     * @return boolean (value of whether or not the two units are equals)
     */
    public boolean equals(Units inUnits)
    {
        int index = 0;
        String [] temp = inUnits.getUnits();
        while(this._units[index].equals(temp[ii]))
        {
            index++;
        }//END WHILE
        if(index == this._units.length)
        {
            return true;
        }//ENDIF
        return false;
    }//END equals
}//END class Units