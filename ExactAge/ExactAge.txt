import java.util.*;
public class ExactAge {
  public static void main(String args[]) {
    String nom;
    int dd, mm, yyyy, h, m, s;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("When were you born?");
    System.out.println("Day (dd)");
    //nom = keyboard.nextLine();
    dd = keyboard.nextInt();
    System.out.println("Month (mm)");
    //nom = keyboard.nextLine();
    mm = keyboard.nextInt();
    System.out.println("Year (yyyy)");
    //nom = keyboard.nextLine();
    yyyy = keyboard.nextInt();
    System.out.println("Hour: 1-24 (If unkown enter 12)");
    h = keyboard.nextInt();
    System.out.println("Minute (If unkown enter 0)");
    m = keyboard.nextInt();
    System.out.println("Second (If unkown enter 0)");
    s = keyboard.nextInt();
    System.out.println("Date of Birth is: "+dd+"/"+mm+"/"+yyyy+" at "+h+":"+m+":"+s);
    //System.out.println("Calculating...");
    String months[] = {
      "01", "02", "03", "04", "05", "06",
      "07", "08", "09", "10", "11", "12"};
    int year, yr, month, day, hour, hr, min, mn, sec, sc; 
    GregorianCalendar gcalendar = new GregorianCalendar();
    year = gcalendar.get(Calendar.YEAR);
    month = gcalendar.get(Calendar.MONTH);
    day = gcalendar.get(Calendar.DATE);
    hour = gcalendar.get(Calendar.HOUR);
    min = gcalendar.get(Calendar.MINUTE);
    sec = gcalendar.get(Calendar.SECOND);
    if(month<=mm && day<dd) {
      yr = year-1;
    } 
    else{
      yr = year;
    }
    if(hour>=h) {
      hr = hour-h;
    } 
    else{
      hr = hour+(24-h);
    }
    if(hour<h) {
      day = day-1;
    }
    else {
      day = day;
    }
    if(min<m && sec<s) {
      hr = hr-1;
    }
    else{
      hr = hr;
    }
    if(sec<s) {
      mn = 60-(m-min);
    }
    else{
      mn = min-m;
    }
    if(sec<s) {
      sc = 60-(s-sec);
    }
    else{
      sc = sec-s;
    }
    System.out.println("Age: "+(yr-yyyy)+" years "+((12-mm)+month)+" months "+(day+(31-dd))+" days "+hr+" hours "+ mn+" minutes "+sc+" seconds");
}
}
    