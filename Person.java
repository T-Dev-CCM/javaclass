
public class Person {
    //Things a person has 

    private String first_name;
    private String last_name; 
    private int age; 

    // Constructor for person, called once per object, multiple times per class

    public Person(String first_name, String last_name, int age) {
        this.first_name = first_name; 
        this.last_name = last_name; 
        this.age = age;
    } 

    public void introduce() {
        System.out.println("\n\nHello, my name is " + this.first_name + " " + this.last_name + " and I'm " + this.age + " years old. \n"); 
    }

    public static void main(String[] args){

        Person person01 = new Person(first_name:"Cody", last_name:"Rayworth", age:12);
        obj_person01.introduce(); 
        Person person02 = new Person(first_name:"Alice", last_name:"Carter", age:13);
        obj_person02.introduce(); 
        Person person03 = new Person(first_name:"Ash", last_name:"Hayes", age:26);
        obj_person03.introduce(); 
        Person person04 = new Person(first_name:"Isaac", last_name:"Cliffton", age:13); 
        obj_person04.introduce(); 
        Person person05 = new Person(first_name:"Droid", last_name:"32", age:1);
        obj_person05.introduce();
        
        
      
  
    }

}