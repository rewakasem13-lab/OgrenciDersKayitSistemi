package ogrenciderskayitsistemi;

//Ders bilgilerini ve ders programını tutar
	public class Course {

	    private String courseId;
	    private String courseName;
	    private int credits;
	    private String schedule;      
	    private Instructor instructor;

	    public Course(String courseId, String courseName, int credits, String schedule) {
	        this.courseId = courseId;
	        this.courseName = courseName;
	        this.credits = credits;
	        this.schedule = schedule;
	    }

	    public String getCourseId() {
	        return courseId;
	    }

	    public String getCourseName() {
	        return courseName;
	    }

	    public int getCredits() {
	        return credits;
	    }

	    public String getSchedule() {
	        return schedule;
	    }

	    public Instructor getInstructor() {
	        return instructor;
	    }

	    public void setInstructor(Instructor instructor) {
	        this.instructor = instructor;
	    }
	}

