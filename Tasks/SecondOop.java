package Tasks;

public class SecondOop {
    public static void main(String[] args) {
        NewClass p = new NewClass();
        p.name = "Nirmal";
        p.age = 10;
        p.NewClassInfo();

        NewClass p2 = new NewClass();
        p2.name = "Shyam";
        p2.age = 12;
        p2.NewClassInfo();

        p2.setThisNumber("686690");

        String geting = p2.getPhNumber();
        System.out.println(geting);

        football f1 = new football();
        f1.homeTeam = "riders";
        f1.awayTeam = "kings";
        f1.time = "2AM";

        f1.setGoal(20);
        System.out.println(f1.getGoal());
        


        Task1 t1 = new Task1();
        t1.Address = "Kanchanpur";
        t1.setNameAge("Niraj", 20);
        t1.getNameAge();

    }
}


class NewClass{
    String name;
    int age;
    // access modfier, it is "default" if not specified 
    private String phNumber;
    public int salary;
    void NewClassInfo(){
        System.out.println(name);
    }

    void setPhNumber(){
        this.phNumber = "9090";
    }

    void setNewPhNumber(String num){
        this.phNumber = num;
    }

    String getPhNumber(){
        return phNumber;
    }

    void setThisNumber(String phNumber){
        this.phNumber = phNumber;
    }

}

// Task 
// create a class football
// make a two attribute 
// String homeTeam and awayTeam 
// make another attribute time 
// make private attribute goal
// make setter for goal 
// make a getter for goal 
// make private attribute winner as String 
// make only setter for winner 
// make function detail() -> print winner name, time and total goal 
// mkae object of football and fill all the attribute 


class football{
    String homeTeam;
    String awayTeam;
    String time;
    private int goal;
    private String winner;

    void setGoal(int goal){
        this.goal = goal;
    }

    int getGoal(){
        return goal;
    }
}

class Thisexample{
    private int length; // "this.length" in this class represent this length;
    private int breadth;
    void fillData(int length,int breadth){
        this.length = length; //this represent current class attribute
        this.breadth = breadth; // the breadth without this represent the args/parameter of function
    }

}


// Task1
// create a private variable for Name, age 
// create public variable for Address 
// make a function to fill data for Name and Age  
// Make a function to print Name, Age and Address 

class Task1{
    private String Name;
    private int age;
    String Address;

    void setNameAge(String name, int age){
        this.Name = name;
        this.age = age;
    }

    void getNameAge(){
        System.out.println(Name);
        System.out.println(age);
        System.out.println(Address);

    }
}