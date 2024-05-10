/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.com.mycompany.online_courses_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 *
 * @author hp
 */
// deadline >starttime
//time  positive ,months<12 ,years>2024 ,days<=31 ,Switchday(31,30,29,28), hours<=23,min<60
    // array of student in project ,no of students in the project 
    //sort 

public class ComMycompanyOnline_courses_system {
    public static void main(String[] args) {
        // creating instructor 
        Site site=new Site();
        Scanner input = new Scanner(System.in);
        Site.Add_Users( new Instructor("Tasneem" , "Tasneem@eng.asu.edu.eg","Faculty of engineering ASU","Computer and systems",25,"Female","12379"));
        //Users stud3 = new Student ( "jan", "jan@eng.asu.edu.eg","Faculty of engineering ASU","Computer and systems",21,"Male","51237");
//        String username1 = input.next();
//        String password1 = input.next();
//        Site.Get_User("Tasneem").login(username1, password1);
        // Creating courses
        ((Instructor)Site.Get_User("Tasneem")).addCourses(new Courses("java","CSE213","Udamy","Three Months"));
        ((Instructor)Site.Get_User("Tasneem")).addCourses(new Courses("C++","CSE211","Udamy","Two Months"));
        ((Instructor)Site.Get_User("Tasneem")).addTask("java",new Quiz(new Time(2024,5,3,1,5),30,"Quiz",new Time(2024,5,3,1,5)));
        ((Instructor)Site.Get_User("Tasneem")).addTask("java",new Assignment(15,"Assignment",new Time(2024,5,3,1,5)));
        ((Instructor)Site.Get_User("Tasneem")).addTask("java",new Project(40,"Project",new Time(2024,12,4,2,7)));
        ((Instructor)Site.Get_User("Tasneem")).addTask("C++",new Quiz(new Time(2024,8,4,1,10),10,"Quiz",new Time(2023,5,3,1,5)));
        ((Instructor)Site.Get_User("Tasneem")).addTask("C++",new Assignment(15,"Assignment",new Time(2024,4,5,7,20)));
        ((Instructor)Site.Get_User("Tasneem")).addTask("C++",new Project(20,"Project",new Time(2024,3,9,8,25)));
//        List <Courses> GergesCourses = new ArrayList<>();
//        GergesCourses.add(Site.Get_Course("java"));
//        GergesCourses.add(Site.Get_Course("C++"));
//        List <Courses> YoustinaCourses = new ArrayList<>();
//        YoustinaCourses.add(Site.Get_Course("C++"));
        Site.Add_Users( new Student ( "Gerges", "gerges@eng.asu.edu.eg","Faculty of engineering ASU","Computer and systems",21,"Male","57379"));
        Site.Add_Users(new Student ( "Youstina", "yous@eng.asu.edu.eg","Faculty of engineering ASU","Computer and systems",21,"Female","57439"));
//        String username2 = input.next();
//        String password2 = input.next();
//        Site.Get_User("Gerges").login(username2, password2);
//        String username3 = input.next();
//        String password3 = input.next();
//        Site.Get_User("Youstina").login(username3, password3);
        List <Courses> GergesCourses = new ArrayList<>();
        GergesCourses.add(Site.Get_Course("java"));
        GergesCourses.add(Site.Get_Course("C++"));
        List <Courses> YoustinaCourses = new ArrayList<>();
        YoustinaCourses.add(Site.Get_Course("C++"));
        ((Student)Site.Get_User("Gerges")).setCourses(GergesCourses);
        ((Student)Site.Get_User("Youstina")).setCourses(YoustinaCourses);
        for(Courses c:((Student)Site.Get_User("Gerges")).getCourses() ){
        System.out.println(c);
        }
//        ((Student)Site.Get_User("Gerges")).addCourses(Site.Get_Course("java"));
//        ((Student)Site.Get_User("Gerges")).addCourses(Site.Get_Course("C++"));
//        ((Student)Site.Get_User("Youstina")).addCourses(Site.Get_Course("C++"));
        ((Instructor)Site.Get_User("Tasneem")).setGrade((Student)Site.Get_User("Gerges"),Site.Get_Course("java"), Site.Get_Course("java").getATask("Quiz"),25 );
        ((Instructor)Site.Get_User("Tasneem")).setGrade((Student)Site.Get_User("Gerges"),Site.Get_Course("java") , Site.Get_Course("java").getATask("Assignment"),12 );
        ((Instructor)Site.Get_User("Tasneem")).setGrade((Student)Site.Get_User("Gerges"),Site.Get_Course("java") , Site.Get_Course("java").getATask("Project"),30 );
        ((Instructor)Site.Get_User("Tasneem")).setGrade((Student)Site.Get_User("Youstina"),Site.Get_Course("C++") , Site.Get_Course("C++").getATask("Quiz"),3 );
        ((Instructor)Site.Get_User("Tasneem")).setGrade((Student)Site.Get_User("Youstina"),Site.Get_Course("C++") , Site.Get_Course("C++").getATask("Assignment"),5 );
        ((Instructor)Site.Get_User("Tasneem")).setGrade((Student)Site.Get_User("Youstina"),Site.Get_Course("C++") , Site.Get_Course("C++").getATask("Project"),8 );
        ((Instructor)Site.Get_User("Tasneem")).setGrade((Student)Site.Get_User("Gerges"),Site.Get_Course("C++") , Site.Get_Course("C++").getATask("Quiz"),8 );
        ((Instructor)Site.Get_User("Tasneem")).setGrade((Student)Site.Get_User("Gerges"),Site.Get_Course("C++") , Site.Get_Course("C++").getATask("Assignment"),7 );
        ((Instructor)Site.Get_User("Tasneem")).setGrade((Student)Site.Get_User("Gerges"),Site.Get_Course("C++") , Site.Get_Course("C++").getATask("Project"),15 );
        System.out.println(((Student)Site.Get_User("Youstina")).getCourseGrade(Site.Get_Course("C++")));
        //System.out.println(((Student)Site.Get_User("Gerges")).getCourseGrade(Site.Get_Course("java")));
        System.out.println(((Student)Site.Get_User("Gerges")).getCourseGrade(Site.Get_Course("C++")));
        }
}