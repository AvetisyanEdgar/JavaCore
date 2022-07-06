package classwork.lesson16.students;

import classwork.lesson16.students.command.Commands;
import classwork.lesson16.students.model.Lesson;
import classwork.lesson16.students.model.Student;
import classwork.lesson16.students.storage.LessonStorage;
import classwork.lesson16.students.storage.StudentStorage;

import java.util.Scanner;

public class StudentDemo implements Commands {
    private static final Scanner scanner = new Scanner(System.in);
    private static final StudentStorage studentStorage = new StudentStorage();
    private static final LessonStorage lessonStorage = new LessonStorage();

    public static void main(String[] args) {
        Lesson java = new Lesson("Java", "Karen", 7, 35000);
        Lesson PHP = new Lesson("PHP", "Narek", 6, 25000);
        Lesson MySQL = new Lesson("MySQL", "Vazgen", 3, 20000);
        lessonStorage.add(java);
        lessonStorage.add(PHP);
        lessonStorage.add(MySQL);
        studentStorage.add(new Student("Poxos", "Legendar", 33, "098989898", "Gyumri", java));
        studentStorage.add(new Student("Petros", "Abrahamyan", 28, "093939393", "Armavir", PHP));
        studentStorage.add(new Student("Martiros", "Shant", 29, "077777777", "Yerevan", MySQL));

        boolean run = true;
        while (run) {
            Commands.printCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            }catch(NumberFormatException e){
                command = -1;
            }
            switch (command) {
                case EXIT:
                    System.out.println("GoodBye!");
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
                    printStudentByLessonName();
                    break;

                case PRINT_STUDENTS_COUNT:
                    System.out.println(studentStorage.getSize());
                    break;

                case CHANGE_STUDENTS_LESSON:
                    changeStudentsLesson();
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case PRINT_ALL_LESSONS:
                    lessonStorage.printLessons();
                    break;
                default:
                    System.out.println("invalid command!");
                    break;
            }
        }
    }

    private static void addLesson() {
        System.out.println("Input new lesson's name");
        String lessonName = scanner.nextLine();
        System.out.println("Input teacher's name");
        String teacherName = scanner.nextLine();
        System.out.println("Input lesson's duration in months");
        int duration = Integer.parseInt(scanner.nextLine());
        System.out.println("Input lesson's price");
        double price = Integer.parseInt(scanner.nextLine());

        Lesson lesson = new Lesson(lessonName, teacherName, duration, price);
        LessonStorage.add(lesson);
        System.out.println("Lesson has been created");
    }

    private static void changeStudentsLesson() {
        studentStorage.printStudents();
        System.out.println("Input student's index");
        int index = Integer.parseInt(scanner.nextLine());
        Student student = studentStorage.getStudentByIndex(index);
        if (student == null) {
            System.out.println("Wrong index!");
            changeStudentsLesson();
        } else {
            if (lessonStorage.getSize() != 0) {
                lessonStorage.printLessons();
                System.out.println("Input lesson's index");
                int lessonIndex = Integer.parseInt(scanner.nextLine());
                Lesson lesson = lessonStorage.getLessonByIndex(lessonIndex);
                if (lesson != null) {
                    student.setLesson(lesson);
                    System.out.println("Lesson has been changed");
                }
            }
        }
    }

    private static void printStudentByLessonName() {
        System.out.println("Please input lesson");
        String lessonName = scanner.nextLine();
        studentStorage.printStudentByLessonName(lessonName);

    }

    private static void deleteByIndex(int index) {
        studentStorage.printStudents();
        System.out.println("Input student's index");
        index = Integer.parseInt(scanner.nextLine());
        studentStorage.deleteByIndex(index);
    }

    private static void addStudent() {
        if (lessonStorage.getSize() != 0) {
            lessonStorage.printLessons();
            System.out.println("Input lesson's index");
            int lessonIndex = Integer.parseInt(scanner.nextLine());
            Lesson lesson = lessonStorage.getLessonByIndex(lessonIndex);
            if (lesson == null) {
                System.out.println("Input valid index");
                addStudent();
            } else {
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
                int age = Integer.parseInt(ageStr);

                Student student = new Student(name, surname, age, phoneNumber, city, lesson);
                studentStorage.add(student);
                System.out.println("Student has been created!");
            }
        }
    }
}
