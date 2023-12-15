package person;

    class instructor extends person {
    
        private double salary;
    
        public instructor(String name, int yearOfBirth, int salary) {
            super(name, yearOfBirth);
            this.salary = salary;
        }
    
        // Getter and setter methods for salary
        public double getSalary() {
            return salary;
        }
    
        public void setSalary(double salary) {
            this.salary = salary;
        }
    
        // toString method
        public String toString() {
            return "Instructor [name=" + getName() + ", yearOfBirth=" + getYearOfBirth() + ", salary=" + salary + "]";
        }

    }


     

