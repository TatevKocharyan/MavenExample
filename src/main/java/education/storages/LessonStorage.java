package education.storages;

import education.model.Lesson;
import education.util.FileUtil;


import java.util.ArrayList;
import java.util.List;

public class LessonStorage {
    private List<Lesson> lessons = new ArrayList<>();


    public void add(Lesson lesson) {
        lessons.add(lesson);
        FileUtil.serializeLessons(lessons);
    }


    public void print() {
        for (Lesson lesson : lessons) {
            System.out.println(lesson);
        }
    }


    public Lesson deleteLessonByName(String name) {
        for (Lesson lesson : lessons) {
            if (lesson.getName().equals(name)) {
                lessons.remove(lesson);
            }

        }FileUtil.serializeLessons(lessons);

        return null;

    }


    public Lesson getByLessonName(String lessonname) {
        for (Lesson lesson : lessons) {
            if (lesson.getName().equals(lessonname)) {
                return lesson;
            }
        }

        return null;
    }


    public void initData() {
        List <Lesson> lessonList=FileUtil.deserializeLessons();
        if (lessonList!=null){
            lessons=lessonList;
        }
    }
}

