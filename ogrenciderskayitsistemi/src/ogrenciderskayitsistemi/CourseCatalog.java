package ogrenciderskayitsistemi;

import java.util.ArrayList;
import java.util.List;

//Sistemdeki derslerin yönetimini sağlar

public class CourseCatalog {

    private List<Course> courses;

    public CourseCatalog() {
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        if (course != null && !courses.contains(course)) {
            courses.add(course);
        }
    }

    public List<Course> listCourses() {
        return courses;
    }

    public Course findCourse(String courseId) {
        for (Course c : courses) {
            if (c.getCourseId().equals(courseId)) {
                return c;
            }
        }
        return null;
    }
}
