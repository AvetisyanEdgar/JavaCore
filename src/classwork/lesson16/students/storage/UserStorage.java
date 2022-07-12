package classwork.lesson16.students.storage;

import classwork.lesson16.students.model.Lesson;
import classwork.lesson16.students.model.User;

public class UserStorage {

    private User[] users = new User[10];
    private int size = 0;

    public void add(User user) {
        if (users.length == size) {
            extend();
        }
        users[size++] = user;
    }

    public void printUsers() {
        for (int i = 0; i < size; i++) {
            System.out.println(users[i]);

        }
        System.out.println();
    }

    private void extend() {
        User[] temp = new User[users.length + 10];
        if (size >= 0) System.arraycopy(users, 0, temp, 0, size);
        users = temp;
    }

    public boolean isEmpty(User[] array) {
        return (size == 0);
    }


    public void deleteByIndex(int index) {
        if (index < 0 || index > size) {
            System.out.println("This index does not exist!");
        } else {
            System.arraycopy(users, index + 1, users, index, size - index);
            size--;
        }
    }

    public void add(int index, User student) {
        if (index < 0 || index > size) {
            System.out.println("This index does not exist!");
            System.out.println();
        } else {
            for (int i = index; i < users.length - 1; i++) {
                users[i + 1] = users[i];
                users[index] = student;
            }
            System.out.println("User has been added");
        }
    }
    public User getUserByIndex(int index){
        if (index < 0 || index > size){
            return null;
        }
        return users[index];
    }
    public User getUserByEmail(String email){
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email)){
                return users[i];
            }
        }
        return null;
    }
    public int getSize() {
        return size;
    }


}



