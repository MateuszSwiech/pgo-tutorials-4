public class Address {

    //a)
    public String createAddress(String country) {
        return String.format("Country: %s", country);
    }

    //b)
    public String createAddress(String country, String city) {
        return String.format("Country: %s, City: %s", country, city);
    }

    //c)
    public String createAddress(String country, String city, String postalCode) {
        return String.format("Country: %s, City: %s, Postal Code: %s", country, city, postalCode);
    }

    //d)
    public String createAddress(String country, String city, String postalCode, String streetName) {
        return String.format("Country: %s, City: %s, Postal Code: %s, Street: %s", country, city, postalCode, streetName);
    }

    //e)
    public String createAddress(String country, String city, String postalCode, String streetName, int houseNumber) {
        return String.format("Country: %s, City: %s, Postal Code: %s, Street: %s, House Number: %d", country, city, postalCode, streetName, houseNumber);
    }
}
