package javatest;

public class Author {
    String name;
    String email;
    char gender;

    public Author(String n,String e,char g){
        name=n;
        email=e;
        gender=g;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }
    public String toString() {
        if (gender == 'M') {
            return this.name + "(m) at " + this.email;
        }
        else if (gender=='F'){
            return this.name + "(ms) at " + this.email;
        }
        else {
            return this.name + " at " + this.email;
        }
    }
}
