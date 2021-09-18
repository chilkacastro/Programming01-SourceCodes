/*
 * The MIT License
 *
 * Copyright 2021 Chilka Castro .
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package student;

/**
 * Class of Student, basic OOP exercise
 * @author Chilka Castro
 */
public class Student {                                                          // public -> access modifier -> anybody can use it/ see it
    private String name;                                                        // private -> you can only use this name in this class -> if you have a data member, put it in private
    private String id;                                                          // why not int? why String --> because of Octal 0123 vs 1234 -> If there's a zero it will give you something crazy because of Octal
    private int age;
    private String tel;                                                         // in a class, whatever method can read and write a data member -> ypu have direct access to the data members when you are in the class
    
    // Constructor - is a special method that is used to create or initialize an object of that class. 
    // Usually we can have more than one constructors in one class and we write constructors at the 
    //very beginning of tha class, just under the data members. 
    // Constructor is always public, with no return type -> not even void because void is still kindof a return type  | public void xxxxx(xxxx) 
    // Name of the cosntructor is always the same as the class name(first character uppercase)
    
    // NOTE : When you shift to OOP, you usually dont use static.
    // this.name = name   // . -> 's   this object
    // Overload -> same name but diff parameters

    /**
     * Default Constructor
     * Why is it called default constructor? because when you dont have any constructor, java gives you a default constructor. Also, there is no PARAMETER -> no value needed-> everything inside is a DEFAULT VALUE. Not necessarily everything is put by Java, you can give your own default value. Nobody can give value from the outside
     */
    public Student() {  // empty parameter
        this.name = "Unknown";    // you can use this.name because the data members are located in this class but this would be a problem if you use the data members in the Test class
        this.id = "Unknown";
        this.age = 0;
        this.tel = null;
    }
    // Example of when a default constructor is used : in game programming, you just want randomly generated x and y for the dog -> you dont need any information from the outside. Nothing is provided so just use default constructor with no parameters
    
    /**
     * Constructor with two data members
     * @param name the name of the student
     * @param id the id of the student
     */
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.age = 0;  // or -1 
        this.tel = null;
    }
    
    /**
     * Constructor with three data members
     * @param name the name of the student
     * @param id the id of the student
     * @param age the age of the student
     */
    public Student(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.tel = null;                                                          // can be empty String "" or null(doesnt exist) --> can only do this to class like 
        // if you didnt write this.tel = ""; java would initialize it for you -> int -> 0, double -> 0. char -> 0, boolean -> false;
        // better to always put the data members inside by yourself
    }
    
    /**
     * Constructor with four data members
     * @param name the name of the student
     * @param id the id of the student
     * @param age the age of the student
     * @param tel the telephone of the student
     */
    public Student(String name, String id, int age, String tel) {               // parameters comes from outside
        this.name = name;                                                       //. -> 's    this -> this object    this object's name      |   this.name -> by adding this. it helps differentiate the name that came from outside   | I will take a name(paramater name, right side) and put it in this object's name (class data member) 
        this.id = id;               // right side -> normal variables
        this.age = age;
        this.tel = tel;
    } 
    
    /**
     * Copy constructor
     * @param student the student to copy 
     */
    public Student(Student student) {
        this.name = student.name;
        this.id= student.id;
        this.age = student.age;
        this.tel = student.tel;
    }
    
    /*
    toString() method is used to convert an object to a String, usually ity is
    used to create a string to represent the object so it contains some data members
    
    Why do we need toString? memory allocation. Its because when you have primitive data type. For example, double, char int, boolean-> it only holds one piece of memory but when you create an object, there are 2 pieces of memory
    The first piece is the reference or the address where to find the real values of the object. The reference is the address. The real data is stored somewhere else. Student s1 -> s1 is the reference and not the value. 
    The reason why we need toString is we dont need to see the address; we really wanna see the real informatioon like name, age, id etc.
    */
    /**
     * A string that represents a student object
     * @return the string that represents a student object
     */
    @Override
    public String toString() {   // no parameter -> just want to convert object to a string -> those object means the data members
        String str = "";
        
        str += String.format("%-10s: %s\n", "Name", name);
        str += String.format("%-10s: %s\n", "ID", id);
        str += String.format("%-10s: %d\n", "Age", age);
        str += String.format("%-10s: %s\n", "Tel", tel);
        
        return str;
    }
    
    /** Overload version -> compare to same type of you |    there is hidden equals method. Here, same name method but diff parameter; the hidden one has Object object as parameter
     * 
     * @param student
     * @return 
     */
    public boolean equals(Student student) {                                    // temporal solution for programming 1
        return this.name.equals(student.name) &&                                       // this.name    and    student.name
                this.id.equals(student.id) && 
                this.age == student.age &&                                      // .equals is a method that compares them
                this.tel.equals(student.tel);           
    }
    
    // getter(get the value) and setter(modify the value)  | better to always put it in the end of the code
    public String getName() { // no parameter because it can directly read  // ex: Wang -> W***
        String str = name.charAt(0) + "";
        
        for (int i = 0; i < name.length() - 1; i++)  // you wont reach the last one; this is why it starts with 0 so its W*** not W****
            str += "*";
        
        return str;
            
    }
    
    public void setName(String name) {  // need a parameter so I can modify the data member -> void because you can directly modify it
        this.name = name;
    } 
    
    
    // Why do we need GETTER and SETTER? Why don't we just make the data members 
    // public instead of making them private?
    /*
    Reasons:
    1. if you make the data members public instead of private -> that means you give the people outside of the class both the authority to read and write
    2. By doing these, you are separating the reading and writing. You can say OK for some places but not all.
    You can allow just reading or you can just allow writing for some places. You can literally control the reading and writing. You can distinguish the authorities there.
    
    - You dont't want to literally throw the value / or show the value to people. 
    Example in game: Do you wanna show the double points thats 92.44394739438 (very long). The value can be really ugly so you
    dont want to show that to the people. You just want to show one decimal point, not everything.
    
    You can customize the getter and show one single character
    */
}
