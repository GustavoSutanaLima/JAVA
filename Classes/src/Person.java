public class Person {

    //Instance variables (also known as FIELDS or ATTRIBUTES);
    private String firstName;
    private String lastName;
    private String fullName;
    private int age = 0;

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public int getAge() {
        return this.age;
    }
    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }
    public void setAge (int age) {
        if (age > 0 && age < 100){
            this.age = age;
        }
    }
    public boolean isTeen () {
        return this.age > 12 && this.age <20;
    }
    public String getFullName (){
        if (this.lastName == null && this.firstName == null){
            return "";
        }
        else if (this.firstName == null) {
            return this.lastName;
        }
        else if (this.lastName == null) {
            return this.firstName;
        }
        else {
            return this.firstName + " " + this.lastName;
        }
    }
}
