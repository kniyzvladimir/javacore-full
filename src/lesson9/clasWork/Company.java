package lesson9.clasWork;

public class Company {
    private String name;
    private String countryFounded;

    protected String code;

    public Company(String name, String countryFounded) {
        this.name = name;
        this.countryFounded = countryFounded;
    }

    public String getCountryFounded() {
        return countryFounded;
    }

    public String getName() {
        return name;
    }

    public void setCountryFounded(String countryFounded) {
        this.countryFounded = countryFounded;
    }
}
