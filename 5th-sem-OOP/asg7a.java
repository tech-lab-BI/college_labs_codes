
import java.util.Scanner;

class Room{
    int width;
    int height;
    int breadth;
    int volume(){
        return (width*height*breadth);
    }
}
class RoomDemo extends Room{
    RoomDemo(int width, int height, int breadth){
        this.width = width;
        this.height = height;
        this.breadth = breadth;
    }
}
public class asg7a{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width , height , breadth of room : ");
        int w = sc.nextInt();
        int h = sc.nextInt();
        int b = sc.nextInt();
        Room r = new RoomDemo(w, h, b); // use constractor
        System.out.println("Volume of the room : "+r.volume());
        sc.close();
    }
}
/*
Enter width , height , breadth of room : 2 3 4
Volume of the room : 24
 */