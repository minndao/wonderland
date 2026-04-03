
package FOP_Lab06.src;

 class L6Q6 {
    public static boolean method0 (int a){
        if (a <= 1){
            return false;}
           

             for (int i = 2; i <= Math.sqrt(a); i += 2) {
                if (a % i == 0) {
                    return false;
                }
            }
        return true;
    }
    public static boolean  method1 (int a){
           
        String b = Integer.toString(a);
        for (int i = 0; i < b.length()/2; i++) {
        if (b.charAt(i) != b.charAt(b.length() -1 - i)) {
        return false;
            }
           
            
    } 
        return  method0(a);
    }

    public static boolean method2 (int a){
        int temp = a;
      if (!method0(a)){
        return false;
      }
      int reversed = 0;
      while ( a > 0){
        int last = a % 10;
        reversed = reversed * 10 + last;
        a = a / 10;
      }
      if (!method0(reversed)){
        return false;
      }
      return reversed != temp;
        

    }
    

    public static void main(String[] args) {
        int cnt1 = 0;
        int cnt2 = 0;
        int i = 0;
        int j = 0;

        while(cnt1 < 20){
            
        if (method1(i)){
            System.out.print(i + " ");
            cnt1++;
        }
        i++;}

            System.out.println();

        while (cnt2 < 20){
        j++;
        if (method2(j)){
            System.out.print(j + " ");
            cnt2++;
        }
        
}




}}
