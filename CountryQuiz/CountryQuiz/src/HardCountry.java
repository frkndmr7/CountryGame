public class HardCountry extends Country {
    private String previousHardCountry;
    private String previousPreviousHardCountry;
    public HardCountry() {
        super();

        previousHardCountry = "";
        previousPreviousHardCountry = "";
    }

    public void addCountryhard(String name, String capital, String language, String continent, String currency) {
        String[] details = {name, capital, language, continent,currency};
        countrieshard.put(name, details);
    }

    public String[] getCountryhardDetails(String name) {
        return countrieshard.get(name);
    }

    public String getRandomHardCountryName() {
        String randomCountry = null;
        do {
            Object[] countryNames = countrieshard.keySet().toArray();
            int randomIndex = random.nextInt(countryNames.length);
            randomCountry = (String) countryNames[randomIndex];
        } while (randomCountry.equals(previousHardCountry) || randomCountry.equals(previousPreviousHardCountry));
        previousPreviousHardCountry = previousHardCountry;
        previousHardCountry = randomCountry;
        return randomCountry;
    }



}