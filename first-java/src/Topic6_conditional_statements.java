public class Topic6_conditional_statements {

    public static void main (String[] args){

        //conditional statemnts

        int salary = 25400;
        if (salary > 260000){
            salary += 1000;
            System.out.println(salary);
        }else if(salary > 25000){
            salary += 2000;
            System.out.println(salary);
        }
        else {
            salary += 500;
            System.out.println(salary);
        }
    }
}
