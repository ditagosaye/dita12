public class Student {
    private String fullname;
    private int id;
    private int age;
    private String department;
    private String  gender;


    public Student(String fullname,int id,int age,String department,String gender){
        this.fullname=fullname;
        this.id=id;
        this.age=age;
        this.department=department;
        this.gender=gender;

    }
    public String getFullname(){
        return fullname;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String getGender() {
        return gender;
    }

}

