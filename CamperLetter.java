
/**
 * Writes "personalized" letters to summer campers.
 *
 * @author Michael Buescher for APCS-A @ HB
 * @version 2019-09-01
 */
public class CamperLetter
{
    private String letterText;
    private String footerText;
    
    public CamperLetter (Camper c)
    {
        letterText = "\nWelcome to Camp FunFun!\n" +
            "Hello, parents!  We are so glad " + c.getFirstName() + " will be joining us this summer.\n" +
            "Just a few things to get ready for a great camp exerience.\n" +
            "First, please refer to the packing list, and make sure all of " +
            c.getFirstName() + "\'s things have\n" + c.getPossessivePronoun() +
            " name on them.  Remember that " + c.getPersonalPronoun() + "\n" +
            "will be sharing a cabin with five other campers, and things can get mixed around.\n" +
            "We are looking forward to greeting " + c.getSubjectPronoun() +
            " on Sunday and spending a great week together!";
        
        footerText = c.getLastName() + ", " + c.getFirstName() + "\n" +
            c.getGender() + "\nCabin " + c.getCabin();
    }
    
    public String toString()
    {
        return letterText + "\n\n" + footerText + "\n\n";
    }
    
    
    // ----------------------------------------------------------------------------
    //  The main method for testing the Camper and CamperLetter classes
    // ----------------------------------------------------------------------------
    public static void main (String[] args)
    {
        Camper a = new Camper ("Allen", "Alicia", Camper.GENDER_FEMALE);
        Camper b = new Camper ("Bell", "Bryan", Camper.GENDER_MALE);
        // Camper c = new Camper ("Carter", "Cecilia", Camper.GENDER_CAMPER_PROVIDED, "they", "them", "theirs");
        
        CamperLetter letterA = new CamperLetter(a);
        CamperLetter letterB = new CamperLetter(b);
        // CamperLetter letterC = new CamperLetter(c);
        
        System.out.println (letterA);
        System.out.println (letterB);
        // System.out.println (letterC);
        
    }
}
