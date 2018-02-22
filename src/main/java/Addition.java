import java.util.ArrayList;
import java.util.List;

public class Addition {
    public static void main(String[] args) throws StringIndexOutOfBoundsException {
        System.out.println("This is adding");
        int a=10;
        int b=20;
        int sum=a+b;
        System.out.println("The sum is "+sum);
    }

    int sum(int a,int b){
        return a+b;
    }

    String sum(String fname, String lname){
        return fname+lname;
    }

    List sum(List listA, List listB){
        List list=new ArrayList();
        list.addAll(listA);
        list.addAll(listB);
        return list;
    }

    float sum(float a,float b){
        return a+b;
    }

    Integer sumInt(Integer a,Integer b){
        return a+b;
    }


}