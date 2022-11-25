//Java Program to illustrate how to define a class and fields  
//Defining a Student class.  
class Hello{
    //defining fields
    int id = 5;//field or data member or instance variable
    String name = "Deepesh";
    //creating main method inside the Student class
    public static void main(String args[]){
        //Creating an object or instance
        Hello s1=new Hello();       //creating an object of Student
        //Printing values of the object
        System.out.println(s1.id);//accessing member through reference variable
        System.out.println(s1.name);
    }
}  