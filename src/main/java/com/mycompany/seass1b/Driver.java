package com.mycompany.seass1b;

import com.mycompany.seass1.CourseProgramme;
import com.mycompany.seass1.Module;
import com.mycompany.seass1.Student;
import org.joda.time.DateTime;

public class Driver {
    
    public static void main(String[] args){
        
        Student s1 = new Student("DrewPeacock", "30-07-98", 22, 17462946);
        Student s2 = new Student("ChrisPeacock", "30-08-98", 22, 17394726);
        Student s3 = new Student("MikeHunt", "30-09-98", 22, 17774996);
        Student s4 = new Student("OliverKlozov", "30-10-98", 22, 17488593);
        Student s5 = new Student("PhilMcHunt", "30-11-98", 22, 17392034);
        
        s1.getUsername();
        s2.getUsername();
        s3.getUsername();
        s4.getUsername();
        s5.getUsername();
        
        Module m1 = new Module("Berry Foraging","BF112");
        Module m2 = new Module("Toilet Cleaning","TC336");
        Module m3 = new Module("Conspiracy Truth Studies","CTS666");
        Module m4 = new Module("Morality in Crisis","MC47");
        
        CourseProgramme cp1 = new CourseProgramme("BP", new DateTime("2019-02-21T00:00:00Z"),
				   new DateTime("2025-07-26T00:00:00Z"));
        CourseProgramme cp2 = new CourseProgramme("BE", new DateTime("2019-11-20T00:00:00Z"),
				   new DateTime("2025-06-21T00:00:00Z"));
        
            // Adding modules to a course
     		cp1.addModuleToCourse(m1);
     		cp1.addModuleToCourse(m2);
     		cp1.addModuleToCourse(m3);
     		cp2.addModuleToCourse(m1);
     		cp2.addModuleToCourse(m3);
     		cp2.addModuleToCourse(m2);
     		cp2.addModuleToCourse(m4);

     		// Adding students to a course
     		cp1.addStudentToCourse(s1);
     		cp1.addStudentToCourse(s2);
     		cp2.addStudentToCourse(s3);
     		cp2.addStudentToCourse(s4);
     		cp2.addStudentToCourse(s5);

     		// Adding students to modules
     		m1.addStudentToModule(s1);
     		m1.addStudentToModule(s2);
     		m1.addStudentToModule(s3);
     		m2.addStudentToModule(s1);
     		m2.addStudentToModule(s2);
     		m2.addStudentToModule(s3);
     		m3.addStudentToModule(s1);
     		m3.addStudentToModule(s2);
     		m3.addStudentToModule(s3);
     		m4.addStudentToModule(s1);
     		m4.addStudentToModule(s2);
     		m4.addStudentToModule(s3);
     		m1.addStudentToModule(s4);
     		m1.addStudentToModule(s5);
     		m3.addStudentToModule(s4);
     		m3.addStudentToModule(s5);
     		m4.addStudentToModule(s4);
     		m4.addStudentToModule(s5);
     
     		System.out.println(cp1.toString());
     		System.out.println(cp2.toString());

     	}
    
    
}
