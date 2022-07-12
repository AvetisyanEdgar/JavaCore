package classwork.lesson16.students;

import classwork.lesson16.students.command.Commands;
import classwork.lesson16.students.model.Lesson;
import classwork.lesson16.students.model.Student;
import classwork.lesson16.students.model.User;
import classwork.lesson16.students.model.UserType;
import classwork.lesson16.students.storage.LessonStorage;
import classwork.lesson16.students.storage.StudentStorage;
import classwork.lesson16.students.storage.UserStorage;

import java.util.Scanner;

public class StudentDemo implements Commands {
    private static final Scanner scanner = new Scanner(System.in);
    private static final StudentStorage studentStorage = new StudentStorage();
    private static final LessonStorage lessonStorage = new LessonStorage();
    private static User currentUser = null;
    public static void main(String[] args) {
        initData();
        boolean run = true;
        while (run) {
            Commands.printLoginCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
                    break;
                default:
                    System.out.println("Invalid command");

            }
        }
    }

    private static void login() {
        System.out.println("Input email and password with comma");
        String emailPasswordStr = scanner.nextLine();
        String[] emailPassword = emailPasswordStr.split(",");
        User user = userStorage.getUserByEmail(emailPassword[0]);
        if (user == null) {
            System.out.println("No user with " + emailPassword[0] + " does not exist Try again");
            login();
        } else {
            if (user.getPassword().equals(emailPassword[1])) {
                currentUser = user;
                if (user.getUserType() == UserType.ADMIN) {
                    loginAdmin();
                } else if (user.getUserType() == UserType.USER) {
                    loginUser();
                }
            } else {
                System.out.println("The Password is wrong!");
            }
        }
    }

    private static void loginUser() {
        boolean run = true;
        while (run) {
            Commands.printUserCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case LOGOUT:
                    System.out.println("GoodBye!");
                    run = false;
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_ALL_STUDENTS:
                    studentStorage.printStudents();
                    break;
                case PRINT_STUDENTS_BY_LESSON_NAME:
                    printStudentByLessonName();
                    break;
                case PRINT_STUDENTS_COUNT:
                    System.out.println(studentStorage.getSize());
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

    private static void register() {
        System.out.println("Input your name, surname, email, password");
        String userDataStr = scanner.nextLine();
        String[] userData = userDataStr.split(",");
        if (userData.length < 4) {
            System.out.println("Input correct data");
        }
        if (userStorage.getUserByEmail(userData[2]) == null) {
            User user = new User();
            user.setName(userData[0].trim());
            user.setSurname(userData[1].trim());
            user.setEmail(userData[2].trim());
            user.setPassword(userData[3].trim());
            user.setUserType(UserType.USER);
            userStorage.add(user);
            System.out.println("the User has been created!");
        } else {
            System.out.println("User with email " + userData[0] + " already exists");
        }
    }

    private static void loginAdmin() {
        System.out.println("Welcome " + currentUser.getName());
        boolean run = true;
        while (run) {
            Commands.printAdminCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case LOGOUT:
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


    private static final UserStorage userStorage = new UserStorage();

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
        studentStorage.printStudentsByLessonName(lessonName);

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

                Student student = new Student(name, surname, age, phoneNumber, city, lesson, currentUser);
                studentStorage.add(student);
                System.out.println("Student has been created!");
            }
        }
    }

    static void initData() {
        User admin = new User("Admin", "Admin", "admin@gmail.com", "onlyAdmin", UserType.ADMIN);
        userStorage.add(admin);
        Lesson java = new Lesson("Java", "Karen", 7, 35000);
        Lesson PHP = new Lesson("PHP", "Narek", 6, 25000);
        Lesson MySQL = new Lesson("MySQL", "Vazgen", 3, 20000);
        LessonStorage.add(java);
        LessonStorage.add(PHP);
        LessonStorage.add(MySQL);
        studentStorage.add(new Student("Poxos", "Legendar", 33, "098989898", "Gyumri", java, admin));
        studentStorage.add(new Student("Petros", "Abrahamyan", 28, "093939393", "Armavir", PHP, admin));
        studentStorage.add(new Student("Martiros", "Shant", 29, "077777777", "Yerevan", MySQL, admin));
    }
}
