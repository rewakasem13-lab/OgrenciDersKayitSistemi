package ogrenciderskayitsistemi;

//Yüksek lisans öğrencileri için özel harç hesaplama işlemleri içerir
	public class GraduateStudent extends Student {

	    public GraduateStudent(int id, String name, String major) {
	        super(id, name, major);
	    }

	    @Override
	    public double calculateTuition() {
	      
	        return getEnrolledCourses().size() * 800.0;
	    }
	}

