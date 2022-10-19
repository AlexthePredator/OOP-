import java.awt.*;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int width = 10;
        int height = 20;

        int newX = 5;
        int newY = 5;

        double area;
        double perimeter;

        Rectangle box = new Rectangle(x,y,width,height);
        area = box.getWidth() * box.getHeight();
        perimeter =  2*(box.getHeight() + 2*box.getWidth());

        System.out.println(box);
        System.out.println (area);
        System.out.println (perimeter);
        //parte 2
        int movX = 3, movY = 3;
        box.translate(movX,movY);
        System.out.println(box);

        int width2 = 20, height2 = 10;
        Rectangle box1 = new Rectangle(movX+width,movY, width2, height2);
        Rectangle box2 = new Rectangle(movX+width,movY+height2, width2, height2);
        Rectangle box3 = new Rectangle(movX,movY+height, width+width2, height2);

        Rectangle boxTotal = new Rectangle(movX,movY,width+width2, height+height2);
        System.out.println(boxTotal);
        area = boxTotal.getWidth() * box.getHeight();
        perimeter =  2*(boxTotal.getHeight()+boxTotal.getWidth());
        System.out.println (area);
        System.out.println (perimeter);
    }
}