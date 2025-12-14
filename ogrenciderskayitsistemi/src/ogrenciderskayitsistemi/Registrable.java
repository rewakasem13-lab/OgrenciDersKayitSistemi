package ogrenciderskayitsistemi;

public interface Registrable {

    boolean register(Student student, Course course);

    boolean drop(Student student, Course course);
}
