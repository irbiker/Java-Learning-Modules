// you can experiment here, it won't be checked

class Task {
  public static void main(String[] args) {
    int n = 10;
    for (int i = 0; i < n; i++) {
      if (i * i < 36) {
        continue;
      }
      System.out.print(i + " ");
    }
  }
}
