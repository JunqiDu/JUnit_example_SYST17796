/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexampartc;

/**
 * The program below uses utility methods to determine whether
 * a candidate will be selected for an interview.
 * This is used as the basis for the unit test
 * @author Junqi Du, 2019
 */
public class CandidateSelector {

    /**
     * A method that returns whether or not a candidate for
     * a job will be qualified for an interview.
     * @param yearsExperience - how many years work experience
     * @param transcriptAverage - their average from their college transcript
     * @return true if their experience + average >=60, false otherwise
     */
    public static boolean getsQualified(int yearsExperience, double transcriptAverage)
    {
        boolean interview = false;
        if((yearsExperience + transcriptAverage)>=60)
        {
            interview = true;
        }
        return interview;
    }
    
}
