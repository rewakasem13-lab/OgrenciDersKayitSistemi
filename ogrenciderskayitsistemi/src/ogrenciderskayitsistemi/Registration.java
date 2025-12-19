package ogrenciderskayitsistemi;

//Öğrencinin ders kayıt ve silme işlemlerini yönetir
public class Registration implements Registrable {

    @Override
 // Aynı dersin birden fazla kez kayıt edilmesini engeller
 // Kayıt işlemi sırasında sırasıyla null kontrolü, tekrar eden ders ve saat çakışması kontrol edilir
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
 // Öğrencinin kayıtlı olduğu dersi sistemden siler
    public boolean drop(Student student, Course course) {
        if (student == null || course == null) {
            return false;
        }
        return student.removeCourse(course);
    }

 // Ders saat çakışmasını kontrol eder ve çakışma varsa kayıt işlemini engeller
    private boolean hasScheduleConflict(Student student, Course newCourse) {
        for (Course c : student.getEnrolledCourses()) {
            if (c.getSchedule().equals(newCourse.getSchedule())) {
                return true;
            }
        }
        return false;
    }
}
