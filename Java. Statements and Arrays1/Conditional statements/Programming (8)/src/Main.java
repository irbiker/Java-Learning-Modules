import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    //Get unit size
    Scanner scanner = new Scanner(System.in);
    int unitsize = scanner.nextInt();

    //fewer than 1: no army
    String a = "no army";
    //from 1 to 4: few
    String b = "few";
    //from 5 to 9: several
    String c = "several";
    //from 10 to 19: pack
    String d = "pack";
    //from 20 to 49: lots
    String e = "lots";
    //from 50 to 99: horde
    String f = "horde";
    //from 100 to 249: throng
    String g = "throng";
    //from 250 to 499: swarm
    String h = "swarm";
    //from 500 to 999: zounds
    String i = "zounds";
    //1000 or more: legion
    String j = "legion";

    if (unitsize >= 500 && unitsize <=999){
      System.out.println(i);
    }else if(unitsize >= 250 && unitsize <= 499){
      System.out.println(h);
    }else if (unitsize >= 100 && unitsize <= 249) {
      System.out.println(g);
    }else if (unitsize >= 50 && unitsize <= 99) {
      System.out.println(f);
    }else if (unitsize >= 20 && unitsize <= 49) {
      System.out.println(e);
    }else if (unitsize >= 10 && unitsize <= 19) {
      System.out.println(d);
    }else if (unitsize >= 5 && unitsize <= 9) {
      System.out.println(c);
    }else if (unitsize >= 1 && unitsize <= 4) {
      System.out.println(b);
    }else if (unitsize >= 1000) {
      System.out.println(j);
    }else {
      System.out.println(a);
    }
  }
}