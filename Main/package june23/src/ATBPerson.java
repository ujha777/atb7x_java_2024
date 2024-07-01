public class ATBPerson {
    String course="";
    String name;
    //default constructor is  a special method with no return type
    //default constructor when u create new object
    //same name has class name
    //One constructor per class
    //Advantage --DC are created to assign the value in the instance variables of the class
    //If we assign direct value to instance variable then it will be common to all the object
    //Usage is to differentiate the object and initialize the variable

ATBPerson(){
    course="Maths";
    System.out.println("Hi....");

}
//Parameterized Constructor
    ATBPerson(String givenName){
        System.out.println("Parameterized Constructor");
        //change the value of name instance variable with this givenName that is a parameterized variable in constructor
        this.name=givenName;
    }
void  ATBPerson(){

    System.out.println("Hiii..");
}


    void walk(){
        System.out.println(name+" is Walking");
    }

}
