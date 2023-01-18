public abstract class Person {
    public String name;
    public String email;

    public Person(){

    }
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public abstract String personDetails(); //abstract method with no base implementation




    @Override
    public String toString(){
        return "Name="+this.name+" Email="+this.email;
    }

}


