
package FOP_Lab05.src;

import java.util.HashSet;

import java.util.Random;

import java.util.Set;

 class l5q2b {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        while (set.size() < 10) {
            set.add(random.nextInt(20) + 1);
        }
        set.forEach(value -> System.out.print(value + " "));
    }
}
