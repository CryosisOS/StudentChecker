/**
 * Author: Nathan van der Velde
 * Date Created: 2018-03-17
 * Last Modifeid By: --
 * Date Last Modified: --
 * Description: This class handles sorting a data structure into ascending order.
 */
package algorithms.collections;

//IMPORTS
import entities.external.Student;
import java.util.ArrayList;

public class Sorts
{

    //sorting dedicated for ArrayList of entities.external.Student s.
    public static void sortArrayList(ArrayList inArrayList)
    {
        //
        for(int i = 0; i < inArrayList.size();i++)
        {
            if(! (inArrayList.get(i) instanceof Student))
            {
                throw new IllegalArgumentException(
                "Error in Sorts.\n"+
                "Item in arrayList is not a entities.external.Student.");
            }
        }
        quickSortRecurse(inArrayList,0,inArrayList.size()-1);
    }

    //utilised by sortArrayList to sort entities.external.Student s
    private static void quickSortRecurse(ArrayList A, int leftIdx, int rightIdx)
    {
        int pivotIdx;
        int newPivotIdx;
        if(rightIdx > leftIdx)
        {
            pivotIdx = (leftIdx+rightIdx)/2;
            newPivotIdx = doPartitioning(A,leftIdx,rightIdx,pivotIdx);
            
            quickSortRecurse(A,leftIdx,newPivotIdx-1);
            quickSortRecurse(A,newPivotIdx+1,rightIdx);
        }
        
    }//quickSortRecurse()

    //utilised by sortArrayList to sort entities.external.Student s
    private static int doPartitioning(
    ArrayList A, int leftIdx, int rightIdx, int pivotIdx)
    {
        Student pivotVal = ((Student) (A.get(pivotIdx)));
        A.set(pivotIdx,A.get(rightIdx));
        A.set(rightIdx,pivotVal);
        int currIdx = leftIdx;
        int newPivotIdx = 0;
        Student tmpStudent;
        for(int ii = leftIdx;ii<rightIdx;ii++)
        {
            if(((Student)(A.get(ii))).getId().compareToIgnoreCase(pivotVal.getId()) < 0)
            {
                tmpStudent = (Student)A.get(ii);
                A.set(ii,A.get(currIdx));
                A.set(currIdx,tmpStudent);
                currIdx++;
            }
        }
        newPivotIdx = currIdx;
        A.set(rightIdx,A.get(newPivotIdx));
        A.set(newPivotIdx,pivotVal);
	return newPivotIdx;
    }//doPartitioning

}//END class Sorts
