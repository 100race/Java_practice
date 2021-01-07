package com.encore.self.service;

import com.encore.self.vo.Student;

public class StudentService {
		private Student[] students;
		public int index; //스택처럼 쌓기 배열 마지막 요소의 인덱스+1****
		public static final int MAX_SIZE = 10;
		
		public StudentService() {
			students = new Student[MAX_SIZE];//10
		}
		
		//CRUD 기능을 정의
		public void addStudent(Student s) {
			if( index == MAX_SIZE || s==null) {
				System.out.println("error : 가능한 용량을 초과했습니다 ( 10명 ) 또는 추가하려는 학생이 없습니다....");
				return;
			}else
				students[index++] = s;
		}
		
	
		public void deleteStudent(int ssn) {
        	for(int i =0; i<index; i++) {
        		if(students[i] != null &&students[i].getSsn()==ssn) {
        			if(i < index-1) {
        				for(int j = i;j<index-1;j++) {
        					students[j] = students[j+1];
        			}}
        			students[i]=null;
        			index--;
        		}
        	}	
        	
        }
		
		public void updateStudentAdd(int ssn,String address) {
        	for(int i =0; i<index; i++) {
        		if(students[i] != null && students[i].getSsn()==ssn) {
        			students[i].changeAddress(address);
        		}
        	}	
        }
	
        
		 //method overloading
        
        public Student findStudent(int ssn) {
        	Student student = null;
        	for( Student s : students) {
        		if(s ==null) continue;
        		if(s.getSsn()==ssn) student = s;
        	}
        	return student;
        }
        
        public Student[] findStudent(String address) { //같은 동네의 사람
        	Student[] findSs = new Student[students.length];
        	for(int i =0; i<index; i++) {
        		if(students[i] != null && students[i].getAddress()==address)
        			findSs[i] = students[i];
        	}
        	return findSs;
        }
        
        public void showAllStudentInfo() {
        	System.out.println("==============학생정보===============");
        	for(Student s: students) {
        		if(s!=null) {
        			System.out.println(s.getName()+", "+s.getAddress()+", "+s.getAge()+", "+s.getHakbun()); //index까지 출력해주면 좋을텐데
        		}
        		
        	}
        }
		
		
}
