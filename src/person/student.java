
package person;

/**
 *
 * @author Aj Cervantes
 */
class student extends person {
    
    private String major;

    public student(String name, int yearOfBirth, String major) {
        
        //kining super is ayha rana magamit og nag extend ka sa uban nga class
        super(name, yearOfBirth);
        this.major = major;
    }

    // Getter and setter methods for major
    public String getMajor() {
        return major;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }

    // toString method
    public String toString() {
        return "Student [name=" + getName() + ", yearOfBirth=" + getYearOfBirth() + ", major=" + major + "]";
    }
}
