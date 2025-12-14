package ogrenciderskayitsistemi;


	import java.util.ArrayList;
	import java.util.List;

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

	    // إضافة مادة (مع منع التكرار)
	    public boolean addCourse(Course course) {
	        if (course == null) {
	            return false;
	        }
	        if (enrolledCourses.contains(course)) {
	            return false; // نفس المادة مسجّلة
	        }
	        return enrolledCourses.add(course);
	    }

	    // حذف مادة
	    public boolean removeCourse(Course course) {
	        if (course == null) {
	            return false;
	        }
	        return enrolledCourses.remove(course);
	    }

	    // حساب الرسوم (طالب عادي)
	    public double calculateTuition() {
	        return enrolledCourses.size() * 500.0;
	    }

	    // حساب GPA (بسيط – اختياري)
	    public double gpaHesapla() {
	        // لاحقًا يمكن تطويره، حاليًا نرجّع قيمة افتراضية
	        return 0.0;
	    }
	}

