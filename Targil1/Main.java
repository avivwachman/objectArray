package Targil1;
//    :) Happily by Aviv Wachman YA2


//import java.util.Arrays; //(for test)

public class Main {

  public static void main(String[] args) {


   // --------------Main--------------

    Channel[] array = new Channel[22];
    for (int i = 0; i < 10; i++) {
        array[i]= new Channel(String.valueOf(i),i,0); //יצירת 10 ערוצי ספורט (מ0 עד 9 = 10)
    }
    array[10] = new Channel("10", 10, 4);//יצירת ערוץ ילדים נוסף (סהכ 11 ערוצי ספורט + ילדים)
    for (int i = 11; i < array.length; i++) {
      array[i]= new Channel(String.valueOf(i),i,2); //מילוי שארית המערך בערוצים מסוג משפחה
    }
   // System.out.println(Arrays.toString(array)); //-----------הדפסת המערך למען הנוחות-----------
    System.out.println(willAlon(array));



  }

  public static boolean willAlon(Channel[] array) {
    int countS = 0; //Sport
    int countK = 0; //Kids
    for (Channel channel : array) { //כל המערך
      if (channel.getType().equals("ספורט")) countS++;//חישוב כמות ערוצי הספורט
      else { //  elif in Python :)
        if (channel.getType().equals("ילדים")) countK++; //חישוב כמות ערוצי הילדים
      }
    }
    //ניתן לוותר על הגדרת הנתונים האלו אך אם נרצה לשנות את התנאים, כך יהיה יותר קל וכמו כן יותר מסודר בצורה זו
    double sum= countK + countS;
    double half = 0.5*array.length; //חצי מכמות הערוצים
    return countS >= 10 && sum >= half;
  }


}
