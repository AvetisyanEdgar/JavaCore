package classwork.lesson16.students;

import java.util.Scanner;

public class StudentDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();
    private static Student student = new Student();

    public static void main(String[] args) {

        studentStorage.add(new Student("Poxos", "Poxosyan", 24, "4563845", "London", "PHP"));
        studentStorage.add(new Student("Petros", "Petrosyan", 26, "45615483", "Lennagan", "JS"));
        studentStorage.add(new Student("Babken", "Babkenyan", 34, "456354845", "Armavir", "Java"));

        boolean run = true;
        while (run) {
            System.out.println("Input 0 for exit");
            System.out.println("Input 1 to add student");
            System.out.println("Input 2 to print all student");
            System.out.println("Input 3 to delete student by index");
            System.out.println("Input 4 to show students by lesson");
            System.out.println("Input 5 to print students count");
            System.out.println("Input 6 to change student's lesson");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case EXIT:
                    run = false;
                    break;

                case ADD_STUDENT:
                    addStudent();
                    break;

                case PRINT_ALL_STUDENTS:
                    studentStorage.printStudents();
                    break;

                case DELETE_STUDENT_BY_INDEX:
                    deleteByIndex(scanner.nextInt());
                    break;

                case PRINT_STUDENTS_BY_LESSON_NAME:
                    printStudentByLessonName(scanner.nextLine());
                    break;

                case PRINT_STUDENTS_COUNT:
                    System.out.println(studentStorage.getSize());
                    break;

                case CHANGE_STUDENTS_LESSON:
                    changeStudentsLesson();
                    break;

                default:
                    System.out.println("invalid command!");
                    break;
            }

        }
    }

    private static void changeStudentsLesson() {
        System.out.println("Input the index");
        int index = Integer.parseInt(scanner.nextLine());
        System.out.println("Input the lesson's name");
        String lessonName = scanner.nextLine(); // Sxal ban run tvi
        studentStorage.changeStudentLesson(index, lessonName);
    }

    private static void printStudentByLessonName(String lessonName) {
        System.out.println("Please input lesson");
        studentStorage.printStudentByLessonName(scanner.nextLine());

    }

    private static void deleteByIndex(int index) {
        studentStorage.printStudents();
        System.out.println("Input student's index");
        index = Integer.parseInt(scanner.nextLine());
        studentStorage.deleteByIndex(index);
    }

    private static void addStudent() {
        System.out.println("Please input student's name: ");
        String name = scanner.nextLine();
        System.out.println("Please input student's surname: ");
        String surname = scanner.nextLine();
        System.out.println("Please input student's age: ");
        String ageStr = scanner.nextLine();
        System.out.println("Please input student's phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please input student's city: ");
        String city = scanner.nextLine();
        System.out.println("Please input student's lesson: ");
        String lesson = scanner.nextLine();

        int age = Integer.parseInt(ageStr);

        Student student = new Student(name, surname, age, phoneNumber, city, lesson);
        studentStorage.add(student);
        System.out.println("Student created!");

    }
}
