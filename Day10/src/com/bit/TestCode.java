package com.bit;
import java.util. *;
public class TestCode {
    public static void main(String[] args) {
        boolean boo = true;
        Student[] studentList = new Student[0];
        while (boo) {
            Scanner sc = new Scanner(System. in);
            try {
                int input = sc.nextInt();
                if (input == 1) {
                    for (Student st : studentList) {
                        System.out.print(
                        		 " java : "
                        + st.java + " web : " + st.web + " framework : " + st.framework);
                        System.out.println();
                    }
                }
                if (input == 2) {
                    try {
                            int num = sc.nextInt();
                            if (dup(num, studentList)) 
                                continue;
                            
                            int java = sc.nextInt();
                            int web = sc.nextInt();
                            int framework = sc.nextInt();
                            Student st = new Student(num, java, web, framework);
                            Student[] stArr = new Student[studentList.length + 1];
                            System.arraycopy(studentList, 0, stArr, 0, studentList.length);
                            stArr[studentList.length] = st;
                            studentList = stArr;
                            +" java : " + java + " web : " + web + " framework : " + framework
                        );
                    } catch (InputMismatchException e) {
                        continue;
                    }
                }
                if (input == 3) {
                    try {
                        int num = sc.nextInt();
                        for (Student st : studentList) {
                            if (st.num == num) {}
                        }
                    } catch (InputMismatchException e) {
                        continue;
                    }
                }
                if (input == 4) {
                    try {
                        int num = sc.nextInt();
                        if (num == 0) {
                            continue;
                        }
                        if (empty(num, studentList)) 
                            continue;
                        
                        for (int removeIndex = 0; i < studentList.length; removeIndex ++) {
                            if (studentList[removeIndex].num == num) {
                                Student[] stArr = new Student[studentList.length - 1];
                                System.arraycopy(studentList, 0, stArr, 0, removeIndex);
                                System.arraycopy(studentList, removeIndex + 1, stArr, removeIndex, studentList.length - removeIndex - 1);
                                studentList = stArr;
                            }
                        }
                    } catch (InputMismatchException e) {
                        continue;
                    }
                }
                if (input == 0) {
                    boo = false;
                    break;
                }
            } catch (InputMismatchException e) {}
        }
        public static double totalAvg(Student[] studentList) {
            double avgTotal = 0;
            for (int i = 0; i < studentList.length; i ++) {
                avgTotal += studentList[i].avg;
            }
            return avgTotal / studentList.length;
        }
        public static boolean dup(int num, Student[] studentList) {
            for (Student st : studentList) {
                if (st.num == num) {
                    return true;
                }
            }
            return false;
        }
        public static boolean empty(int num, Student[] studentList) {
            for (Student st : studentList) {
                if (st.num == num) {
                    return false;
                }
            }
            return true;
        }
        class Student {
            int num;
            int java;
            int web;
            int framework;
            double avg;
            int sum;
            String grade;
            Student(int num, int java, int web, int framework) {
                this.num = num;
                this.java = java;
                this.web = web;
                this.framework = framework;
                this.sum = this.java + this.web + this.framework;
                this.avg = (sum * 100 / 3) / 100.0;
                grade(this.avg);
            }
            void grade(double avg) {
                int remainder = (int)(avg * 10);
                while (remainder / 10 > 1) {
                    remainder %= 10;
                }
                int avgInt = (int)avg;
                if (remainder >= 5) {
                    avgInt += 1;
                }
                if (100 >= avgInt && avgInt > 90) {
                    this.grade = "A";
                }
                if (90 >= avgInt && avgInt > 80) {
                    this.grade = "B";
                }
                if (80 >= avgInt && avgInt > 70) {
                    this.grade = "C";
                }
                if (70 >= avgInt && avgInt > 60) {
                    this.grade = "D";
                }
                if (60 >= avgInt) {
                    this.grade = "F";
                }
            }
        }
    }