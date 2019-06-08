
/**
 * This class represents a Camper at a summer camp.
 *
 * @author Michael Buescher for APCS-A @ HB, modified by _____________
 * @version 2019-09-01
 */
public class Camper
{
    public static final int GENDER_FEMALE = 1;
    public static final int GENDER_MALE = 2;
    
    private String firstName, lastName;
    private int gender;
    private int cabinNum;
    
    private String personalPronoun, possessivePronoun, subjectPronoun;
    
    // -----------------------------------------------------------------------------
    //    Constructors and Helper Methods
    // -----------------------------------------------------------------------------
    
    /**  Constructor for objects of type Camper
     *   @param lname The last name of the camper
     *   @param fname The first name of the camper
     *   @param gend  The gender of the camper
     */
    public Camper (String lname, String fname, int gend)
    {
        firstName = fname;
        lastName = lname;
        assignCabin();
        
        gender = gend;
        if (gender == GENDER_FEMALE)
        {
            personalPronoun = "she";
            subjectPronoun = "her";
            possessivePronoun = "her";
        }
        else if (gender == GENDER_MALE)
        {
            personalPronoun = "he";
            subjectPronoun = "him";
            possessivePronoun = "his";
        }
    }
    
    private void assignCabin ()
    {
        cabinNum = (int)(20 * Math.random()) + 1;
    }
    
    // -----------------------------------------------------------------------------
    //    Accessor Methods
    // -----------------------------------------------------------------------------
    
    /** @return the Camper's first name */
    public String getFirstName()
    {   return firstName;   }
    
    /** @return the Camper's last name */
    public String getLastName()
    {   return lastName;   }
    
    /** @return the Camper's cabin number */
    public int getCabin()
    {   return cabinNum;   }
    
    /** @return the Camper's gender */
    public String getGender()
    {   
        if (gender == GENDER_FEMALE)
        {
            return "FEMALE";
        }
        else 
        {
            return "MALE";
        }
    }
    
    /** @return the Camper's personal pronoun  */
    public String getPersonalPronoun()
    {   return personalPronoun;   }
    
    /** @return the Camper's subject pronoun */
    public String getSubjectPronoun()
    {   return subjectPronoun;   }
    
    /** @return the Camper's possessive pronoun */
    public String getPossessivePronoun()
    {   return possessivePronoun;   }
    
    
}
