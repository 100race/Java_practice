package com.encore.self.test;

import com.encore.self.service.StudentService;
import com.encore.self.vo.Student;

public class StudentServiceTest {

	public static void main(String[] args) {
		Student[] students = {
				new Student(1111, "송지성", "서울시 강동구", 25, "20151560"),
				new Student(2222, "백경주", "서울시 송파구", 22, "20181160"),
				new Student(3333, "이경배", "서울시 성북구", 21, "20191110"),
				new Student(4444, "이원기", "서울시 성동구", 23, "20191960"),
				new Student(5555, "장성준", "서울시 송파구", 23, "20191133"),
				new Student(6666, "김가영", "서울시 강동구", 24, "20181200"),
				new Student(7777, "홍다미", "서울시 송파구", 24, "20181169"),
				new Student(8888, "서성준", "서울시 노원구", 24, "20181160"),
				new Student(9999, "길명준", "서울시 서초구", 25, "20181260"),
				//new Student(9998, "테스트", "서울시 서초구", 25, "20181260"),인원 초과 테스트
				new Student(0000, "성동일", "서울시 강남구", 20, "20201000")};
		StudentService sService	= new StudentService();	
		
		//1.add student
		for(Student s : students)
			sService.addStudent(s);
		
		//0.show students 
		sService.showAllStudentInfo();
		
		//2.delete student
		sService.deleteStudent(7777);
		sService.deleteStudent(0000);
		
		//0.after delete, show students
		sService.showAllStudentInfo();
			
		//3.find student
		Student findStu = sService.findStudent(4444);
		if(findStu ==null) 
			System.out.println("찾는 학생이 없습니다");
		else {
			System.out.println("==============찾는 학생정보===========");
			System.out.println(findStu.getDetails());
		}
		
		//4.find student same address
		Student[] findStus = sService.findStudent("서울시 강동구");
		if(findStus == null) 
			System.out.println("찾는 학생이 없습니다");
		else {
			System.out.println("==============찾는 학생정보===========");
			for(Student s : findStus) {
				if(s != null)
				System.out.println(s.getDetails());
			}
		}
				
		//5. update student address
		sService.updateStudentAdd(2222,"서울시 성북구");
		
		//0.after delete, show students
		sService.showAllStudentInfo();
					
		

	}

}
