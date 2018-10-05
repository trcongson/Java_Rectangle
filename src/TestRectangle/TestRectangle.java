package TestRectangle;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chiều dài: ");
        double width = sc.nextDouble();
        System.out.print("Nhập vào chiều rộng: ");
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width,height);

        System.out.println("Hình chữ nhật \n" + rectangle.display());
        System.out.println("Chu vi hình chữ nhật: " + rectangle.getPerimeter());
        System.out.println("Diện tích chình chữ nhật: " + rectangle.getArea());
    }
}

