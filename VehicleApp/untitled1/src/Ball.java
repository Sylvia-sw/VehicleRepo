import java.util.Scanner;

public class Ball.Java. {
public static void main(String[]args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入您的爱好（篮球或足球）");
    String k = "";
    k = sc.nextLine();
    if(k.equals("篮球"))
    {
        System.out.println("请输入购买篮球的数量及单价");
    }
    else
    {
        System.out.println("请输入购买足球的数量及单价");
    }
    System.out.println("请输入购买足球的数量及单价");
    int quantity = sc.nextInt();
    double unitPrice = sc.nextDouble();
    double totalAmount = quantity * unitPrice;
    if (quantity > 5) {
        quantity++;
        System.out.println("因为您购买的球多于 5 个，所以额外赠送一个，您共获得 " + quantity + " 个球。");
    }

    if (totalAmount > 150) {
        totalAmount -= 10;
        System.out.println("因为您的购买金额多于 150 元，所以为您减去 10 元，您最终需支付 " + totalAmount + " 元。");
    }
    else
    {

        System.out.println("您需支付 " + totalAmount + " 元。");
    }

    scan.close();
}
}

