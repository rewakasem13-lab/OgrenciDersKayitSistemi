package ogrenciderskayitsistemi;

	public class GraduateStudent extends Student {

	    public GraduateStudent(int id, String name, String major) {
	        super(id, name, major);
	    }

	    @Override
	    public double calculateTuition() {
	        // طالب ماجستير يدفع أكثر
	        return getEnrolledCourses().size() * 800.0;
	    }
	}

