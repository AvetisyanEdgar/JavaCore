package classwork.lesson16.students.command;

public interface Commands {

    int EXIT = 0;
    int ADD_STUDENT = 1;
    int PRINT_ALL_STUDENTS = 2;
    int DELETE_STUDENT_BY_INDEX = 3;
    int PRINT_STUDENTS_BY_LESSON_NAME = 4;
    int PRINT_STUDENTS_COUNT = 5;
    int CHANGE_STUDENTS_LESSON = 6;
    int ADD_LESSON= 7;
    int PRINT_ALL_LESSONS = 8;
    static void printCommands(){
        System.out.println("Input " + EXIT + " for exit");
        System.out.println("Input " + ADD_STUDENT + " to add student");
        System.out.println("Input " + PRINT_ALL_STUDENTS + " to print all students");
        System.out.println("Input " + DELETE_STUDENT_BY_INDEX + " to delete student by index");
        System.out.println("Input " + PRINT_STUDENTS_BY_LESSON_NAME + " to show students by lesson");
        System.out.println("Input " + PRINT_STUDENTS_COUNT + " to print students count");
        System.out.println("Input " + CHANGE_STUDENTS_LESSON + " to change student's lesson");
        System.out.println("Input " + ADD_LESSON + " to add lesson");
        System.out.println("Input " + PRINT_ALL_LESSONS + " to print all lessons");

    }
}
