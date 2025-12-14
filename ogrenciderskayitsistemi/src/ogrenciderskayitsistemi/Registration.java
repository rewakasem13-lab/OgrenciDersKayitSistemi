package ogrenciderskayitsistemi;

public class Registration implements Registrable {

    @Override
    public boolean register(Student student, Course course) {
        if (student == null || course == null) {
            return false;
        }

        // منع التسجيل بنفس المادة
        if (student.getEnrolledCourses().contains(course)) {
            return false;
        }

        // منع تضارب الوقت
        if (hasScheduleConflict(student, course)) {
            return false;
        }

        return student.addCourse(course);
    }

    @Override
    public boolean drop(Student student, Course course) {
        if (student == null || course == null) {
            return false;
        }
        return student.removeCourse(course);
    }

    // فحص تعارض الوقت (بسيط)
    private boolean hasScheduleConflict(Student student, Course newCourse) {
        for (Course c : student.getEnrolledCourses()) {
            if (c.getSchedule().equals(newCourse.getSchedule())) {
                return true;
            }
        }
        return false;
    }
}
