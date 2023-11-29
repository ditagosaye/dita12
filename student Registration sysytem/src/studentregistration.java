import java.util.Scanner;

public class studentregistration {
    public static <illegalArgumentException> void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try{
            System.out.println("enter fullname:");
            String fullname=scanner.nextLine();
            System.out.println("enter id:");
            int id= scanner.nextInt();
            int age =0;
            if(age<=0||age>=40){
                System.out.println("invalid age provided");


            }
            System.out.println("enter department:");
            String department=scanner.nextLine();
            System.out.println("enter gender:");
            String gender=scanner.nextLine();
            Student student=new Student( fullname,  id, age, department,  gender);
            System.out.println("student registration succesfull:");
            System.out.println("Name:"+student.getFullname());
            System.out.println("id:"+student.getId());
            System.out.println("age:"+student.getId());
            System.out.println("department:"+student.getDepartment());
            System.out.println("gender:"+ student.getGender());
             
        }catch(NumberFormatException e)
        {
            System.out.println("error:id and age should be numeric values ");
        }catch
        ( Exception  e){
            System.out.println("error:"+e);
        }
    }
}
