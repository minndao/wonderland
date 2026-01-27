public class T7Q2 {
  
        //a
        PrintWriter out = new PrintWriter (new FileOuputStream ("d:\\data\\matrix.txt"));

        //b
        try {
            PrintWriter out = new PrintWriter (new FileOutputStream ("data.txt"));
            out.close();
        }catch (IOException e){
            System.out.println("Problem with file output");
        }

        //c
        ObjectInputStream a = new ObjectInputStream (new FileInputStream ("data.dat"));
        num = a.readInt();
        a.close();

        //d
        ObjectOutputStream o = new ObjectOutputStream (new FileOutputStream("data.dat"));
        o.writeChar('A');
        o.close();
        



    
    
}
