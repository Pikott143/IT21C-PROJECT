package person;

  class person {
    
    private String name;
    private int yearOfBirth;

    public person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    // Getter and setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for yearOfBirth
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    // toString method
    public String toString() {
        return "Person [name=" + name + ", yearOfBirth=" + yearOfBirth + "]";
    }
}

