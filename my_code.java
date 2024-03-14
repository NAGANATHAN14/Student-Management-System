import java.util.*;
class Student {
    String studentId;
    String name;
    int age;
    String grade;

    public Student(String studentId , String name, int age,String grade){
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    
}
public class my_code {
    public static void add_student(ArrayList<Student> list , Scanner sc){
        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();
        System.out.print("ENTER STUDENT NAME: ");
        String name = sc.nextLine();
        System.out.print("ENTER STUDENT AGE: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("ENTER STUDENT GRADE: ");
        String grade = sc.nextLine();

        Student student = new Student(id, name, age, grade);
        list.add(student);
        System.out.println("-------- STUDENT ADDED SUCCESFULLY -------");
    }
    public static void search_student(ArrayList<Student> list , Scanner sc){
        System.out.println("ENTER STUDENT ID TO SEARCH: ");
        String id = sc.nextLine();

        for( Student student : list){
            if( student.studentId.equals(id)){
                System.out.println("-------------------------------------");
                System.out.println("STUDENT FOUND:\nID: " + student.studentId + "\nName: " + student.name +
                        "\nAge: " + student.age + "\nGrade: " + student.grade);
                System.out.println("-------------------------------------");
                return;
            }
        }
        System.out.println("ID  DOES NOT EXIST");
    }
    public static void remove_student(ArrayList<Student> list , Scanner sc){
        System.out.println("ENTER STUDENT ID TO REMOVE : ");
        String id = sc.nextLine();

        for( Student student : list){
            if( student.studentId.equals(id)){
                list.remove(student);
                System.out.println("---------- STUDENT REMOVED SUCCESFULLY ---------");
                return;
            }
        }
        System.out.println("ID  DOES NOT EXIST");
    }
    public static void show_student(ArrayList<Student> list){
        if(list.isEmpty()){
            System.out.println("----------- NO STUDENTS IN RECORD ----------");
            return;
        }
        for( Student student : list){
                System.out.println("-------------------------------------");
                System.out.println("ID: " + student.studentId + "\nName: " + student.name +
                        "\nAge: " + student.age + "\nGrade: " + student.grade);
                System.out.println("-------------------------------------");
                
        }
        return;
    }
    public static void update_student(ArrayList<Student> list, Scanner sc){
        System.out.println("ENTER STUDENT ID TO UPDATE : ");
        String id = sc.nextLine();
       
        System.out.println("SELECT THE FEILD TO UPDATE\n1. ID\n2. NAME\n3. AGE\n4. GRADE\n5. EXIT");
        int choice = sc.nextInt();
        sc.nextLine();

        for(Student student : list){
            if(student.studentId.equals(id)){
                switch (choice) {
                    case 1:
                        System.out.print("ENTER ID TO UPDATE : ");
                        String new_id = sc.nextLine();
                        student.studentId = new_id;
                        break;
                    case 2:
                        System.out.print("ENTER NAME TO UPDATE : ");
                        String new_name = sc.nextLine();
                        student.name = new_name;
                        break;
                    case 3:
                        System.out.print("ENTER AGE TO UPDATE : ");
                        int new_age = sc.nextInt();
                        sc.nextLine();
                        student.age = new_age;
                        break;
                    case 4:
                        System.out.print("ENTER GRADE TO UPDATE : ");
                        String new_grade = sc.nextLine();
                        student.grade = new_grade;
                        break;
                    case 5:
                        System.out.println("---------- STUDENT DETAILS UPDATED SUCCESFULLY ---------");
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                        break;
                }
            }
        }
    }
    public static void main(String[] args){
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("MENU\n1. ADD STUDENT\n2. SEARCH STUDENT\n3. REMOVE STUDENT\n4. SHOW STUDENT\n5. UPDATE STUDENT DEATILS\n6. EXIT");
            System.out.print("ENTER YOUR CHOICE: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    add_student(list,sc);
                    break;
                case 2:
                    search_student(list,sc);
                    break;
                case 3:
                    remove_student(list,sc);
                    break;
                case 4:
                    show_student(list);
                    break;
                case 5:
                    update_student(list,sc);
                    break;
                case 6:
                    System.out.println("--------- END ---------");
                    sc.close();
                    System.exit(0);
            
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }

    }
}