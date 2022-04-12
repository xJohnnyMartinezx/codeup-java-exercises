public class Person {

    public static void main(String[] args) {
        Person person = new Person("Johnny");
        Person person2 = new Person("Joe");
        person.sayHello();
        person2.sayHello();

    }

//PROPERTIES
    private String name;


//    CONSTRUCTOR
public Person (String name) {
    this.name = name;
}

//    GETTERS AND SETTERS
public String getName(){
//TODO: return the person's name
    return this.name;
}

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello " + this.getName());
    }


}
