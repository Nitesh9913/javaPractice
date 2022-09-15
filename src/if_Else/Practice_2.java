package if_Else;

public class Practice_2 {

    public static void checkStudentPassOrFail(int marks){
        if (marks>=35 && marks<=50){
            System.out.println("Student is passed" +marks);
        }
        else if(marks>=60 && marks<=61){
            System.out.println("Student is passed with first class"+marks);
        }
        else if(marks>=66 && marks<=75){
            System.out.println("Student is failed"+marks );
        }

    }

    public static void main(String[] args) {
        checkStudentPassOrFail(60 );
    }
}
