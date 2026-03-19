public class pattern_advance {
   

    }
    public static void hollow_rectangle(int row,int col){
        //outer loop or total lines
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
               if(i==1 || i==row || j==1 || j==col){
                System.out.print("*");
               }
               else System.out.print(" ");

            }
                           System.out.println(" ");
        }
    }

    public static void inverted_pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void inverted_half_pyramid(int n){
        //outer or total line
        for(int i=1;i<=n;i++){
            //for number
            for(int j=1;j<=(n+1)-i;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
    public static void floyd_triangle(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println(" ");
        }
    }
    public static void _0_1_triangle(int n){
        for(int i= 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum % 2==0){
                    System.out.print(1+" ");
                }
                else System.out.print(0+" ");
            }
            System.out.println(" ");
        }
    }
    public static void butterfly_pattern(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
                        System.out.println(" ");

        }
    }
    public static void solid_rhombus(int n){
        for (int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" "+" ");
            }
            //star
            for(int j=1;j<=n;j++){
                System.out.print("*"+" ");
            }
         
            System.out.println();
        }
    }
    public static void hollow_rhombus(int n){
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //hollow_rectangle
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void dimond_pattern(int n){
        //half_diamond
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //inverted diamond
        for(int i=n;i>=1;i--){
               //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void number_pyramid(int n){
        int count=1;
        for(int i=1;i<=n;i++){
            //inner-loop=space+number
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //number
            for(int j=1;j<=(2*i)-1;j++){
                if(j%2 ==0){
                    System.out.print(" ");
                }
                else {
                    System.out.print(count);
                }
            }
            count ++;
            System.out.println();
        }
    }
    public static void palindrome_number_pattern(int n){
        //outer_loop
        for(int i=1 ;i<=n;i++){
            //inner_loop=space+number
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //number(decsending)
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //number(ascending)
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
     public static void main(String args[]){
        // hollow_rectangle(5, 5 );
        // inverted_pyramid(5);
        // inverted_half_pyramid(5);
        // floyd_triangle(5);
        // _0_1_triangle(5);
        // butterfly_pattern(5);
        // solid_rhombus(5);
        // hollow_rhombus(5);
        // dimond_pattern(5);
        // number_pyramid(9);
        palindrome_number_pattern(5);
}
