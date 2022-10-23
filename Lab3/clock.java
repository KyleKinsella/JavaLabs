import java.util.Calendar;

public class clock {

   public static void main(String[] args) {
    int i;

    Calendar cal = Calendar.getInstance();
    Time t = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));

  
    for(i=0; i<1000; i++) {
      t.tick();
      System.out.print("Current time in milliseconds = ");
      System.out.println(System.currentTimeMillis());
    }
   }
}


    

