
package FOP_Lab06.src;

import java.util.Arrays;

 class L6Q3 {
    public static void reverse (int[] array){
        
        for(int i = 0; i < array.length/2 ; i++){
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }


    
}

 static void main(String[] args) {
    int[] oriarray = new int[]{1,2,3,4,5,6,7,8,9,10};
   System.out.println(Arrays.toString(oriarray));

   reverse(oriarray);
   System.out.println(Arrays.toString(oriarray));
}
}
