package education;

public interface Commands {

    //User Commands

    String EXIT = "0";
    String LOGIN="1";
    String REGISTER="2";
   // String PRINT_USERS="3";

     String LOGOUT = "0";
     String ADD_LESSON = "1";
     String ADD_STUDENT = "2";
     String PRINT_STUDENTS = "3";
     String PRINT_STUDENTS_BY_LESSON = "4";
     String PRINT_LESSONS = "5";
     String DELETE_LESSON_BY_NAME = "6";
     String DELETE_STUDENT_BY_EMAIL = "7";



     static void printLoginRegisterCommandsForUser() {
         System.out.println("For logging in please input"+LOGIN);
         System.out.println("For registering please input"+REGISTER);
         System.out.println("For exit pleas input"+ EXIT);

    }
    static void printCommands() {

        System.out.println("Please input " + LOGOUT + " for EXIT");
        System.out.println("Please input " + ADD_LESSON + " for ADD_LESSON");
        System.out.println("Please input " + ADD_STUDENT + " for ADD_STUDENT");
        System.out.println("Please input " + PRINT_STUDENTS + " for PRINT_STUDENTS");
        System.out.println("Please input " + PRINT_STUDENTS_BY_LESSON + " for PRINT_STUDENTS_BY_LESSON");
        System.out.println("Please input " + PRINT_LESSONS + " for PRINT_LESSONS");
        System.out.println("Please input " + DELETE_LESSON_BY_NAME + " for DELETE_LESSON_BY_NAME");
        System.out.println("Please input " + DELETE_STUDENT_BY_EMAIL + " for  DELETE_STUDENT_BY_EMAIL");


    }
    static void printCommandsForuser() {
    System.out.println("Please input " + LOGOUT + " for EXIT");
        System.out.println("Please input " + ADD_LESSON + " for ADD_LESSON");
        System.out.println("Please input " + ADD_STUDENT + " for ADD_STUDENT");
        System.out.println("Please input " + PRINT_STUDENTS + " for PRINT_STUDENTS");
        System.out.println("Please input " + PRINT_STUDENTS_BY_LESSON + " for PRINT_STUDENTS_BY_LESSON");
        System.out.println("Please input " + PRINT_LESSONS + " for PRINT_LESSONS");
        //System.out.println("Please input " + PRINT_USERS + " for PRINT_USSERS");




}

}

