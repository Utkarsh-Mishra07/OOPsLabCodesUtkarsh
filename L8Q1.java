package codes;
import java.util.*;

abstract class Figure {
    int x, y;

    abstract void area(int x, int y);
}

class Rectangle extends Figure {
    int area_f = 0;
    void area(int x, int y) {
        area_f = x * y;
        System.out.println("Rectangle Area: " + area_f); 
    }
}

class Square extends Figure {
    int area_f = 0;
    void area(int x, int y) {
        area_f = x * y;
        System.out.println("Square Area: " + area_f); 
    }
}

class Triangle extends Figure {
    float area_f = 0;
    void area(int x, int y) {
        area_f = x*y;
        float new_a = area_f/2;
        System.out.println("Triangle Area: " + new_a); 
    }
}

public class L8Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x and y");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x == y) {
			Square s1 = new Square();
			s1.area(x,y);
		}else {
			Rectangle r1 = new Rectangle();
			r1.area(x,y);
		}
		
		Triangle t1 = new Triangle();
		t1.area(x,y);
	}

}