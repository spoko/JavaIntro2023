package oop;

public class Address {
    private String city;
    private String country;
    private String location;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Address(String city, String country, String location) {
        setCity(city);
        setCountry(country);
        setLocation(location);
    }
}
