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
package oop;

/**
 * Class of Student, basic OOP exercise
 * @author Chilka Castro
 */
public class Student {
    private String name;        // independent from the other data members-> the name is independent from the age and the gender
    private int age;            // independent from age and name
   // private int nextYearAge   // dependent -> YOU DON'T NEED THIS -> 4  | if you change age then you ALSO need to change nextYearAge -> but what if you forget to update the nextYearAge? Everytime you change age you need to chaneg two things
    private String gender;      // independent from name and age 

    /**
     * Default constructor
     */
    public Student() {
        this.name = "";
        this.age = 0;
        this.gender = "";
    }
    
    /**
     * Constructor with threee data members
     * @param name the name of the student
     * @param age the age of the student
     * @param gender the gender of the student
     */
    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    /**
     * Copy constructor
     * @param student the student to copy
     */
    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.gender = student.gender;
    }
    
    /**
     * Compares if two student objects are the same or not
     * @param student the student object to compare with
     * @return True if they are the same and False if they are not.
     */
    public boolean equals(Student student) {
        return this.name.equals(student.name) &&
                this.age == student.age &&
                this.gender.equals(student.gender);
    }
    
    /**
     * Creates a String that represents a String
     * @return a String that represents a String
     */
    public String toString() {
        String str = "";
        
        str += String.format("%-10s : %s\n", "Name", name);
        str += String.format("%-10s : %d\n", "Age", age);
        str += String.format("%-10s : %s\n", "Gender", gender);
        
        return str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
