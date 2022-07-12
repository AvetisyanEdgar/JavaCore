package classwork.lesson16.students.storage;

import classwork.lesson16.students.model.Student;

public class StudentStorage {

    private Student[] students = new Student[10];
    private int size = 0;

    public void add(Student student) {
        if (size == students.length) {
            increaseArray();
        }
        students[size++] = student;
    }


    public void printStudents() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + students[i].toString());
        }
        System.out.println();
    }

    private void increaseArray() {
        Student[] temp = new Student[students.length + 10];
        System.arraycopy(students, 0, temp, 0, size);
        students = temp;
    }

    public void deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("invalid index");
        } else {
            System.arraycopy(students, index + 1, students, index, size - index);
            size--;
        }
    }

    public void printStudentsByLessonName(String lessonName) {
        for (int i = 0; i < size; i++) {
            if (students[i].getLesson().equals(lessonName)) {
                System.out.println(students[i]);
            }
        }
    }

    public int getSize() {
        return size;
    }

    public Student getStudentByIndex(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return students[index];
    }
}



