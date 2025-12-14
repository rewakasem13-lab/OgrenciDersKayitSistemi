package ogrenciderskayitsistemi;

//Öğrencinin ders kayıt ve silme işlemlerini yönetir
public class Registration implements Registrable {

    @Override
    public boolean register(Student student, Course course) {
        if (student == null || course == null) {
            return false;
        }

        
        if (student.getEnrolledCourses().contains(course)) {
            return false;
        }

        
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

    
    private boolean hasScheduleConflict(Student student, Course newCourse) {
        for (Course c : student.getEnrolledCourses()) {
            if (c.getSchedule().equals(newCourse.getSchedule())) {
                return true;
            }
        }
        return false;
    }
}
