public class MultiLevelInterface {
    
    public static void main(String[] args) {
        Student st = new Student();
        st.profession = "Student";
        System.out.println(st.profession);
        Teacher t = new Teacher();
        t.profession = "Teacher";
        System.out.println(t.profession);
        Person p = new Student();
        p.enroll = "Science";
        System.out.println(p.enroll);
        
        
    }
    
}

class Person {
    String profession;   
    String course;
    String enroll;
}

class Teacher extends Person {
    String course;    
}

class Student extends Teacher{   
    String enroll;
}


