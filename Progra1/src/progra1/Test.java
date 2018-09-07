package progra1;

public class Test {

	public static void main(String[] args) {
		//Menu menu = new Menu();
		//menu.iniciarMenu();
                Point point = new Point(4,4);
                Point point2 = new Point(2, 2);
                Point point3 = new Point(3,3);
                Point point4 = new Point(5, 5);
                Line line = new Line(point, point4);
                Triangle triangle = new Triangle(point, point2, point3);
                Rectangle rectangle = new Rectangle(point, point2, point3, point4);
                
                
                
	}

}
