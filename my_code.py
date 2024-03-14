class Student:
    def __init__(self, id, name , age, grade):
        self.id = id
        self.name = name
        self.age = age
        self.grade = grade

def add_student(list):
    print("Enter Student ID : ")
    id = input()
    print("ENTER STUDENT NAME : ")
    name = input()
    print("ENTER STUDENT AGE : ")
    age = int(input())
    print("ENTER STUDENT GRADE : ")
    grade = input()
    
    new_student = Student(id,name,age,grade)
    list.append(new_student)
    print("-------- STUDENT ADDED SUCCESFULLY -------")

def search_student(list):
    print("ENTER STUDENT ID TO SEARCH : ")
    id = input()
    
    for student in list:
        if student.id == id:
            print("-------------------------------------")
            print(f"STUDENT FOUND:\nID: {student.id}\nName: {student.name}\nAge: {student.age}\nGrade: {student.grade}")
            print("-------------------------------------")
            return 
    
    print("ID  DOES NOT EXIST")
    
def remove_student(list):
    print("ENTER STUDENT ID TO REMOVE : ")
    id = input()
    
    for student in list:
        if student.id == id:
            list.remove(student)
            print("---------- STUDENT REMOVED SUCCESFULLY ---------")
            return 
        
    print("ID  DOES NOT EXIST")
    
def show_student(list):
    
    if not list:
        print("----------- NO STUDENTS IN RECORD ----------")
    
    for student in list:
         print("-------------------------------------")
         print(f"STUDENT FOUND:\nID: {student.id}\nName: {student.name}\nAge: {student.age}\nGrade: {student.grade}")
         print("-------------------------------------")

def update_student(list):
    print("ENTER STUDENT ID TO UPDATE : ")
    id = input()
    
    print("SELECT THE FEILD TO UPDATE\n1. ID\n2. NAME\n3. AGE\n4. GRADE\n5. EXIT")
    choice = int(input())
    
    for student in list:
        if student.id == id:
            if choice == 1:
                print("ENTER ID TO UPDATE : ")
                id = input()
                student.id = id
            elif choice == 2:
                new_name = input("Enter NAME to update : ")
                student.name = new_name
            elif choice == 3:
                new_age = int(input("Enter AGE to update : "))
                student.age = new_age
            elif choice == 4:
                new_grade = input("Enter GRADE to update : ")
                student.grade = new_grade
            elif choice == 5:
                print("---------- STUDENT DETAILS UPDATED SUCCESSFULLY ---------")
                return
            else:
                print("Invalid choice. Please enter a number between 1 and 5.")
                return
students_list = []

while True:
    print("MENU\n1. ADD STUDENT\n2. SEARCH STUDENT\n3. REMOVE STUDENT\n4. SHOW STUDENT\n5. UPDATE STUDENT DEATILS\n6. EXIT")
    choice = int(input("ENTER YOUR CHOICE: "))

    if choice == 1:
        add_student(students_list)
    elif choice == 2:
        search_student(students_list)
    elif choice == 3:
        remove_student(students_list)
    elif choice == 4:
        show_student(students_list)
    elif choice == 5:
        update_student(students_list)
    elif choice == 6:
        print("--------- END ---------")
        break
    else:
        print("Invalid choice. Please enter a number between 1 and 6.")
                
            
    