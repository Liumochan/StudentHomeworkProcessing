package Handle;

public class Student {
	
	//定义关于学生的属性
		 String name;	//姓名
		 String sex;	//性别
		 String age;	//年龄
		 String number;	//学号
		 String grade;	//班级
		 String major;	//专业
		 
		 String courseName;  //课程名称
		 String locationOfClass;  //上课地点
		 String schoolTime;   //上课时间
		 String lectureTeacher;   //授课教师
		 
		 
		//构造函数
		Student(){		//无参构造函数
			
		}
		
		public Student(String name, String sex, String age, String number, String grade, String major,
				String courseName, String locationOfClass, String schoolTime, String lectureTeacher) {
			super();
			this.name = name;
			this.sex = sex;
			this.age = age;
			this.number = number;
			this.grade = grade;
			this.major = major;
			this.courseName = courseName;
			this.locationOfClass = locationOfClass;
			this.schoolTime = schoolTime;
			this.lectureTeacher = lectureTeacher;
		}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public String getGrade() {
			return grade;
		}
		public void setGrade(String grade) {
			this.grade = grade;
		}
		public String getMajor() {
			return major;
		}
		public void setMajor(String major) {
			this.major = major;
		}
		
		public String getCourseName() {
			return courseName;
		}
		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}
		public String getLocationOfClass() {
			return locationOfClass;
		}
		public void setLocationOfClass(String locationOfClass) {
			this.locationOfClass = locationOfClass;
		}
		public String getSchoolTime() {
			return schoolTime;
		}
		public void setSchoolTime(String schoolTime) {
			this.schoolTime = schoolTime;
		}
		public String getLectureTeacher() {
			return lectureTeacher;
		}
		public void setLectureTeacher(String lectureTeacher) {
			this.lectureTeacher = lectureTeacher;
		}
		@Override
		public String toString() {
			return "Student [姓名：=" + name + ", 性别：=" + sex + ", 年龄：=" + age + ", 学号=" + number + ", 班级=" + grade
					+ ", 专业=" + major + ", 课程名称=" + courseName + ", 上课地点=" + locationOfClass
					+ ", 上课时间=" + schoolTime + ", 授课教师=" + lectureTeacher + "]\n";
		}
	
}
