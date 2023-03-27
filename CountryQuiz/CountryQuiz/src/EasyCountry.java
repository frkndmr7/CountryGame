public class EasyCountry extends Country {
    private String previousEasyCountry;
    private String previousPreviousEasyCountry;

    public EasyCountry() {
        super();

        previousEasyCountry = "";
        previousPreviousEasyCountry = "";
    }

    public void addCountryeasy(String name, String capital, String language, String continent, String currency) {
        String[] details1 = {name, capital, language, continent, currency};
        countrieseasy.put(name, details1);
    }

    public String[] getCountryeasyDetails(String name) {
        return countrieseasy.get(name);
    }

    public String getRandomEasyCountryName() {
        String randomCountry = null;
        do {
            Object[] countryNames = countrieseasy.keySet().toArray();
            int randomIndex = random.nextInt(countryNames.length);
            randomCountry = (String) countryNames[randomIndex];
        } while (randomCountry.equals(previousEasyCountry) || randomCountry.equals(previousPreviousEasyCountry));
        previousPreviousEasyCountry = previousEasyCountry;
        previousEasyCountry = randomCountry;
        return randomCountry;
    }

}