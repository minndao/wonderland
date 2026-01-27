public class T4Q4 {
    public static void main(String[] args) {
String ori = "Lucifer";
int l = ori.length();
StringBuilder rev = new StringBuilder();

for (int i = l-1; i >=0 ; --i) {
    char c = ori.charAt(i);
    System.out.println(c);
    rev.append(c);
}

System.out.println(rev);
    } 
}
