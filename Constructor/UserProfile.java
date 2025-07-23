public class UserProfile {
    private String username;
    private String email;
    private int age;
    private String country;

    // Constructor with all parameters and validation
    public UserProfile(String username, String email, int age, String country) throws IllegalArgumentException {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty.");
        }
        if (!email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Invalid email format.");
        }
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120.");
        }
        if (country == null || country.trim().isEmpty()) {
            throw new IllegalArgumentException("Country cannot be empty.");
        }

        this.username = username;
        this.email = email;
        this.age = age;
        this.country = country;
    }

    // Overloaded constructor for basic profile (default country)
    public UserProfile(String username, String email, int age) throws IllegalArgumentException {
        this(username, email, age, "Unknown"); // Chaining to the main constructor
    }

    // Overloaded constructor for minimal profile (default age and country)
    public UserProfile(String username, String email) throws IllegalArgumentException {
        this(username, email, 25); // Chaining to the basic profile constructor
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public static void main(String[] args) {
        try {
            UserProfile user1 = new UserProfile("john_doe", "john.doe@example.com", 30, "USA");
            System.out.println("User 1: " + user1.getUsername() + ", " + user1.getEmail() + ", " + user1.getAge() + ", "
                    + user1.getCountry());

            UserProfile user2 = new UserProfile("jane_smith", "jane.smith@example.com", 28);
            System.out.println("User 2: " + user2.getUsername() + ", " + user2.getEmail() + ", " + user2.getAge() + ", "
                    + user2.getCountry());

            UserProfile user3 = new UserProfile("peter_jones", "peter.jones@example.com");
            System.out.println("User 3: " + user3.getUsername() + ", " + user3.getEmail() + ", " + user3.getAge() + ", "
                    + user3.getCountry());

            // This will throw an IllegalArgumentException
            // UserProfile invalidUser = new UserProfile("invalid", "invalid", 150,
            // "Canada");

        } catch (IllegalArgumentException e) {
            System.err.println("Error creating user profile: " + e.getMessage());
        }
    }
}