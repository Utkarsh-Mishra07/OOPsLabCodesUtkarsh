package codes;
class CourseFullException extends Exception{
		public CourseFullException(String message) {
			super(message);
		}
	}
	class course{
		private String courseName;
		private int capacity;
		private int enrolledStudents;
		course(String courseName,int capacity,int enrolledStudents){
			this.courseName =courseName;
			this.capacity = capacity;
			this.enrolledStudents =enrolledStudents;
		}
		void enrollStudent() throws CourseFullException{
			if (capacity >= enrolledStudents){
				throw new CourseFullException("Course is full!!!");
			}
			else {
				System.out.println("Welcome to the course!!");
			}
		}
	}
	public class L10Q1{
	 public static void main(String[] args) throws CourseFullException {
		 course course = new course("CSE", 10, 10);
		 course.enrollStudent();
	 }
	}


