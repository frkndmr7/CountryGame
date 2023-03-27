public class MediumCountry extends Country {
    private String previousMediumCountry;
    private String previousPreviousMediumCountry;

    public MediumCountry() {
        super();

        previousMediumCountry = "";
        previousPreviousMediumCountry = "";
    }

    public void addCountrymedium(String name, String capital, String language, String continent, String currency) {
        String[] details = {name, capital, language, continent, currency};
        countriesmedium.put(name, details);
    }

    public String[] getCountrymediumDetails(String name) {
        return countriesmedium.get(name);
    }

    public String getRandomCountryeasyName() {
        String randomCountry = null;
        do {
            Object[] countryNames = countriesmedium.keySet().toArray();
            int randomIndex = random.nextInt(countryNames.length);
            randomCountry = (String) countryNames[randomIndex];
        } while (randomCountry.equals(previousMediumCountry) || randomCountry.equals(previousPreviousMediumCountry));
        previousPreviousMediumCountry = previousMediumCountry;
        previousMediumCountry = randomCountry;
        return randomCountry;
    }

}