import java.util.Scanner;
public class TimeAdder {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Current Hour: " );
        int Hour = sc.nextInt();
        System.out.println("Enter Current Minute: " );
        int Minute = sc.nextInt();
        System.out.println("Enter Current Second: " );
        int Second = sc.nextInt();
        System.out.println("Enter Hours Forword: " );
        int HourForword = sc.nextInt();
        System.out.println("Enter Minute Forword: " );
        int MinuteForword = sc.nextInt();
        System.out.println("Enter Second Forword: " );
        int SecondForword = sc.nextInt();


        int answerHour = 0, answerMinute = 0, answerSecond = 0;

        int carrySecond = 0, carryMinute = 0; 

        boolean isNextDay = false; 

        answerSecond = Second + SecondForword;
            if ( answerSecond >= 60) {
                answerSecond -= 60; 
                carrySecond =01; 
            }
            answerMinute = Minute + MinuteForword + carrySecond;
            if ( answerMinute >= 60) {
                answerMinute -= 60; 
                carryMinute = 01; 
            }

            answerHour = Hour + HourForword + carryMinute;
            if ( answerHour >= 12) {
                answerHour -= 12; 
                isNextDay = true; 
            }
            if (isNextDay) {
                System.out.println(answerHour + " : " + answerMinute  +" : " + answerSecond + " : " );
         }

         else {
            System.out.println(answerHour + " : " + answerMinute + " : " + answerSecond);
         }
    }
    
}
