package Java;

public class forloop {
    public static void main(String args[]) {
     /*   int n = 5;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/
      /*    int n = 5;
            for(int i=0;i<=n;i++)
        {
            for (int j=0;j<i;j++){
                System.out.print("*");
           }

              System.out.println();
       }

       */

      /*  int n = 5;
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++){
                System.out.print(""+j);
            }

            System.out.println();
        }
*/
       /* int n = 5;
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++){
                System.out.print(""+i);
            }

            System.out.println("");
        }*/

        /* int n = 5;
        for(int i=n;i>=1;i--)
        {
            for (int j=1;j<=i;j++){
                System.out.print(""+j);
            }

            System.out.println();
            }
         */

            int i,j,n=4;
            for(i=1;i<=n;i++){
                for (j=4;j>=i;j--){
                    System.out.print("");
                    for (n=1;n<=i;n++){
                        System.out.println(" *");
                }
            }
                System.out.println();
                          }}}