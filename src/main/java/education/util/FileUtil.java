package education.util;

import education.model.Lesson;
import education.model.Student;
import education.model.User;


import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class FileUtil {

    private static final String DATA_PATH = "C:\\Users\\on-off\\IdeaProjects\\JavaCore\\src\\homework\\educationwithcollectins\\education\\data";


    public static void serializeLessons(List<Lesson> lessonList) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DATA_PATH + "\\lessons.dat"))) {
            out.writeObject(lessonList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }


    public static void serializeStudents(Set<Student> studentSet) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DATA_PATH + "\\students.dat"))) {
            out.writeObject(studentSet);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public static void serializeUsers(Map<String, User> userMap) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DATA_PATH + "\\users.dat"))) {
            out.writeObject(userMap);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public static List<Lesson> deserializeLessons() {
        File file = new File(DATA_PATH + "\\lessons.dat");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
                Object obj = in.readObject();
                return (List<Lesson>) obj;
            }catch (EOFException e){

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {

            }
        }
        return null;

    }


    public static Set<Student> deserializeStudents() {
        File file = new File(DATA_PATH + "\\students.dat");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
                Object obj = in.readObject();
                return (Set<Student>)  obj;
            } catch (EOFException e){

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {

            }
        }
        return null;

    }

    public static Map<String,User> deserializeUsers() {
        File file = new File(DATA_PATH + "\\users.dat");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
                Object obj = in.readObject();
                return (Map<String,User>)  obj;
            }catch (EOFException e){

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {

            }
        }
        return null;

    }










}
