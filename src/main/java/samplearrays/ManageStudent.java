package samplearrays;

import java.util.Arrays;
import java.util.Comparator;

public class ManageStudent {


    // 2) Find the Oldest Student
    public static Student findOldest(Student[] students) {
        Student oldest = students[0];
        for (Student student: students){
            if (student.getAge()>oldest.getAge()){
                oldest = student;
            }
        }

        return oldest;
    }

    // 3) Count Adult Students (age >= 18)
    public static int countAdults(Student[] students) {
        int count=0;
        for (Student student:students){
            if (student.getAge()>=18){
                count++;
            }
        }
        return count;
    }

    // 4) Average Grade (returns NaN if no students or grades)
    public static double averageGrade(Student[] students) {
        double average =0;
        for (Student student:students){
            average+=student.getGrade();

        }
        return average/(double) students.length;

    }

    // 5) Search by Name (case-sensitive; change to equalsIgnoreCase if desired)
    public static Student findStudentByName(Student[] students, String name) {
        for (Student student:students){
            if (student.getName().equals(name)){
                return student;
            }
        }
        return null;


    }

    // 6) Sort Students by Grade (descending)
    public static void sortByGradeDesc(Student[] students) {
        for (int i=0;i<students.length;i++){
            for (int j=i+1;j<students.length;j++){
                if (students[i].getGrade()<students[j].getGrade()){
                    Student temp = students[i];
                    students[i]= students[j];
                    students[j]=temp;

                }
            }
        }



    }

    // 7) Print High Achievers (grade >= 15)
    public static void printHighAchievers(Student[] students) {
        for (Student student:students){
            if (student.getGrade()>=15){
                System.out.println(student.getName()+"\n");

            }
        }

    }

    // 8) Update Student Grade by id
    public static boolean updateGrade(Student[] students, int id, int newGrade) {
        for (Student student:students ){
            if (student.getId()==id){
                student.setGrade(newGrade);
                return true;
            }
        }
        return false;


    }

    // 9) Find Duplicate Names
    public static boolean hasDuplicateNames(Student[] students) {
        boolean flag = false;
        for (int i=0;i<students.length;i++){
            for (int j=i+1;j<students.length;j++){
                if (students[i].getName().equals(students[j].getName())){
                    flag=true;
                }
            }
        }
        return flag;

    }

    // 10) Expandable Array: return a new array with one more slot and append student
    public static Student[] appendStudent(Student[] students, Student newStudent) {
        Student[] updated = new Student[students.length+1];
        for (int i=0;i<students.length;i++){
            updated[i]=students[i];  // we copy each element to the updated array

        }
        updated[students.length] = newStudent;
        return updated ;

    }

    // 1) Create an Array of Students + demos for all tasks
    public static void main(String[] args) {
        // Create & initialize array of 5 students

        Student std1= new Student(1,"Salma",20,15);
        Student std2 = new Student(2, "Saida", 48,20);
        Student std3 = new Student(3,"Lamiae", 24,19);
        Student std4 = new Student(4,"Faouzi",26,17);
        Student std5 = new Student(5,"Soufiane", 30,16);
        Student[] arr = {std1,std2,std3,std4,std5};





        // Print all
        System.out.println("== All Students ==\n");
        for (Student s :arr) System.out.println(s);
        System.out.println("\n");
        System.out.println("Total created: " + Student.getNumStudent()+"\n");

        // 2) Oldest
        Student oldest = ManageStudent.findOldest(arr);
        System.out.println("Oldest student in the class in arr: "+oldest.getName()+"\n");


        // 3) Count adults
        System.out.println("Number of adults in arr:" +ManageStudent.countAdults(arr)+"\n");



        // 4) Average grade
        System.out.println("Average grade of students in arr: "+averageGrade(arr)+"\n");



        // 5) Find by name

        System.out.println("Find the student with the name salma");
        Student salma=ManageStudent.findStudentByName(arr, "Salma");
        System.out.println(salma.toString());
        System.out.println("\n");

        // 6) Sort by grade desc

        // sort function
        ManageStudent.sortByGradeDesc(arr);
        System.out.println("\n== Sorted by grade (desc) ==");
        for (Student s : arr) System.out.println(s);
        System.out.println("\n");

        // 7) High achievers >= 15
        System.out.println("\nHigh achievers:");
        ManageStudent.printHighAchievers(arr);
        System.out.println("\n");

        // 8) Update grade by id
        // function
        System.out.println("Update the grade of student Lamiae with id =3");
        ManageStudent.updateGrade(arr,3,18);
        Student newStd= ManageStudent.findStudentByName(arr, "Lamiae");
        System.out.println(newStd.toString());
        System.out.println("\n");

        // 9) Duplicate names
        if (ManageStudent.hasDuplicateNames(arr)){
            System.out.println("There is a duplicated name in arr\n");

        }else{
            System.out.println("There is no duplicated name in arr\n");
        }


        // 10) Append new student
        Student student=new Student( 6, "Ahmed",20,17);
        Student[] newArr=ManageStudent.appendStudent(arr,student);
        System.out.println("The updated array after adding a student:\n");
        for (Student std: newArr){
            System.out.println(std.toString());

        }
        System.out.println("\n");


        //11)Representing the school
        //create the school 2D array
        Student[][] school = new Student[2][3];
        //create students of each class
        //class1
        Student student1= new Student(10, "Ali", 12,19);
        Student student2= new Student(11, "Maroua", 13,18);
        Student student3= new Student(12, "Safae", 12,15);

        //class2
        Student student4= new Student(13, "Safae", 13,17);
        Student student5= new Student(14, "Saad", 13,18);
        Student student6= new Student(15, "Assia", 12,19);

        // filling class1
        school[0][0]=student1;
        school[0][1]=student2;
        school[0][2]=student3;
        //filling class 2
        school[1][0]=student4;
        school[1][1]=student5;
        school[1][2]=student6;

        //Print the names of all students class by class
        System.out.println("==The names of All Students class by class\n");
        for (int i=0;i<school.length;i++){
            System.out.println("Class"+(i+1)+":");
            for (int j=0;j<school[i].length;j++){
                System.out.println(school[i][j].getName());

            }
            System.out.println("\n");
        }
        System.out.println("\n");
        System.out.println("==Name of top student in each class");
        for (int i=0;i<school.length;i++){
            System.out.println("Name of top student in class"+(i+1));
            ManageStudent.sortByGradeDesc(school[i]);
            System.out.println(school[i][0].getName()+"\n");
        }



    }
}
