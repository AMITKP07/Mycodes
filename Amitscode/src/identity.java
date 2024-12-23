public class identity {
    public static void main(String[] args) {
      int rows,cols;
      boolean f=true;
      int a[][] = {{1,0,0},
              {0,1,0},
              {0,0,1}};
      rows=a.length;
      cols=a[0].length;

      if(rows != cols) {
          System.out.println("square matrix");
      }
      else
      {
          for (int i=0;i<rows;i++) {
              for (int j=0;j<cols;j++) {
                  if(i==j && a[i][j] != 1) {
                      f=false;
                      break;
                  }
                  if (i!=j && a[i][j] != 0) {
                      f=false;
                      break;

                  }
              }
          }
          if (f) {
              System.out.println("identity");
          }
          else {
              System.out.println("not identity");
          }
      }
    }
}
