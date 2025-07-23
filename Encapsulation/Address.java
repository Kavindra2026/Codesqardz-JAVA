class Address {
    private String street;
    private String city;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static void main(String[] args) {
        Address ad = new Address();
        ad.setCity("Dhanaura");
        ad.setStreet("Jalilpur Mungra");
        System.out.println("City Name : " + ad.getCity());
        System.out.println("street Name : " + ad.getStreet());
    }
}