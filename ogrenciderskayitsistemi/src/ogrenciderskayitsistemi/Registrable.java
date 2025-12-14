package ogrenciderskayitsistemi;

//Ders kayıt işlemleri için arayüz
public interface Registrable {

    boolean register(Student student, Course course);

    boolean drop(Student student, Course course);
}
