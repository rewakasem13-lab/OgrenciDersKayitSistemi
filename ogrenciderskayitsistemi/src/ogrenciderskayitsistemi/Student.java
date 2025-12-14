package ogrenciderskayitsistemi;


	import java.util.ArrayList;
	import java.util.List;
	// Bu sınıf öğrenciyi ve kayıtlı derslerini temsil eder
	public class Student {

	    private int id;
	    private String name;
	    private String major;
	    private List<Course> enrolledCourses;

	    public Student(int id, String name, String major) {
	        this.id = id;
	        this.name = name;
	        this.major = major;
	        this.enrolledCourses = new ArrayList<>();
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getMajor() {
	        return major;
	    }

	    public List<Course> getEnrolledCourses() {
	        return enrolledCourses;
	    }

	   
	    public boolean addCourse(Course course) {
	        if (course == null) {
	            return false;
	        }
	        if (enrolledCourses.contains(course)) {
	            return false; 
	        }
	        return enrolledCourses.add(course);
	    }

	   
	    public boolean removeCourse(Course course) {
	        if (course == null) {
	            return false;
	        }
	        return enrolledCourses.remove(course);
	    }

	    
	    public double calculateTuition() {
	        return enrolledCourses.size() * 500.0;
	    }

	    
	    public double gpaHesapla() {
	        
	        return 0.0;
	    }
	}

