package Tasks;

public class FirstOop {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Ram";
        person1.age = 10;
        person1.gender = 'M';
        System.out.println(person1.name);
        person1.introduction();

        // Task create an two object of person and call introduction function
        Person person2 = new Person();
        person2.name = "Hari";
        person2.age = 21;
        person2.gender = 'M';
        person2.introduction();

        Person person3 = new Person();
        person3.name = "Nari";
        person3.age = 20;
        person3.gender = 'M';
        person3.introduction();

        Rectangle recl1 = new Rectangle();
        recl1.length = 10;
        recl1.breadth = 20;

        int areaRec1 = recl1.areaOfRectangle();
        System.out.println("Area of recl1 is " + areaRec1);

        car car1 = new car();
        car1.Name = "Ford";
        car1.color = " white";
        car1.year = 2024;

        car car2 = new car();
        car2.Name = "Audi";
        car2.color = "Black";
        car2.year = 2023;

        car car3 = new car();
        car3.Name = "Hilux";
        car3.color = "Black";
        car3.year = 2022;

        car1.start();
        car2.start();
        car3.start();

        car1.stop();

        System.out.println(car2.expiring());
        System.out.println(car3.expiring());


       Student nam1 = new Student();
       nam1.firstName = "Niraj";
       nam1.lastName = "chand";
       nam1.studentId = 101;
       nam1.age = 20;

       System.out.println(nam1.fullName());
       nam1.description();
       System.out.println(nam1.overEighteen());



    }
}


class Person{
    String name;
    int age;
    char gender;
    
    void introduction(){
        System.out.println("Name : "+ name +" Age " + age);
    }
}

class Rectangle{
    int length;
    int breadth;

    int areaOfRectangle(){
        int area = length * breadth;
        return area;
    }
}

class car{
    String Name;
    String color;
    int year;

    void start(){
        System.out.println(Name + "is starting");
    }

    void stop(){
        System.out.println(Name + "of" + color + " is stopping.");
    }
    
    int expiring(){
        int a= 100 + year;
        return a;
    }
}

// Task2
class Student{
    String firstName;
    String lastName;
    int studentId;
    int age;

    String fullName(){
        return firstName + lastName;
    }

    void description(){
        String a = fullName();
        System.out.println(a + "and" + studentId);
    }

    boolean overEighteen(){
        if (age>18) {
            return true;
        }else{
            return false;
        }
    }
}