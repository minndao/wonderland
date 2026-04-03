package Tutorial_08.T8Q5.src;

public class Connection {
    private static int numberOfConnection = 0;

    private boolean isConnected;

    public Connection(){
        numberOfConnection ++;
        isConnected = true;
        System.out.println("Connected to the server!");
    }

    public void Disconnect(){
        if(isConnected){
            numberOfConnection --;
            isConnected = false;
            System.out.println("Disconnected!");
        }
        else{
            System.out.println("This connection is already closed.");
        }
    }

    public void display(){
        System.out.println("Number of connection: " + numberOfConnection);
    }

}
