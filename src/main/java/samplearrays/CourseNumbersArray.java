package samplearrays;

import java.util.Arrays;

public class CourseNumbersArray {
    public static void main(String[] args) {
        int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};

        //Add a new element to resgisteredCourses array by adding it to a larger array
        int[] updatedCourses = new int[registeredCourses.length+1];  //Declare a new array of larger length (new length = registredCourses length +1)
        for (int i=0;i<registeredCourses.length;i++) {

            updatedCourses[i]=registeredCourses[i];   //we copy each course in registeredCourses to updatedCourses
        }
        updatedCourses[registeredCourses.length]=1011; //We add a new value



        //We check if the updatedCourses array contain Course 2160
        boolean flag = false;
        for (int i : updatedCourses) {
            if (i==2160){
                flag =true;
            }
        }
        if(flag==true){
            System.out.println("Course 2160 exists");
        }else{
            System.out.println("Course 2160 does not exist");
        }

    }
}
