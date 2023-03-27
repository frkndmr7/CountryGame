import java.util.HashMap;
import java.util.Random;

public class Country {
    /*private HashMap<String,String[]> countrieseasy = new HashMap<String,String[]>();
    private HashMap<String,String[]> countriesmedium = new HashMap<String,String[]>();
    private HashMap<String,String[]> countrieshard = new HashMap<String,String[]>();*/

    protected HashMap<String, String[]> countrieseasy;
    protected HashMap<String, String[]> countriesmedium;
    protected HashMap<String, String[]> countrieshard;
    protected String previousEasyCountry;
    protected String previousMediumCountry;
    protected String previousHardCountry;
    protected Random random;

    public Country() {
        countrieseasy = new HashMap<>();
        countriesmedium = new HashMap<>();  // create a new HashMap object
        countrieshard = new HashMap<>();
        previousEasyCountry = null;
        previousMediumCountry = null;
        previousHardCountry = null;
        random = new Random();
    }
}