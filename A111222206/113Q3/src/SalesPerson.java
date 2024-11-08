import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.ArrayList;
import java.util.Arrays;

public class SalesPerson {
    private String id;
    private String name;
    private double grossSales;
    private double commissionRate;

    private Order[] orderArray = new Order[3];
    private int orderCount = 0;

    public SalesPerson(String id, String name) {
        //預設commissionRate = 0.01
        this.id = id;
        this.name = name;
        this.commissionRate = 0.01;
    }

    public SalesPerson(String id, String name, double commissionRate) {
        this.id = id;
        this.name = name;
        this.commissionRate = commissionRate;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
       return this.name;
    }

    public void setCommissionRate(double commissionRate) {
        //檢查獎金比例必須為0~1!
        if(commissionRate < 0 || commissionRate > 1) {
            System.out.println("獎金比例必須為0~1!");
        }
        this.commissionRate = commissionRate;
    }

    public void setOrderArray(String itemName, double itemPrice, int amount) {
        //*************************
        //(加分項)若陣列長度不足，將陣列長度x2
        //(必要)新增order到orderArray
        //*************************
        if (orderCount >= orderArray.length) {
            orderArray = Arrays.copyOf(orderArray, orderArray.length * 2);
        }
        orderArray[orderCount++] = new Order(itemName, itemPrice, amount);
    }

    public double getGrossSales() {
        //*************************
        //計算總銷售額，並回傳
        //*************************
        double total = 0;
        for (Order order : orderArray) {
            if (order != null) {
                total += order.totalSale();
            }
        }
        return total;
    }

    
    public String getOrders() {
        //****************************************
        //將所有oder的內容，整合為一個字串，並回傳
        //****************************************
        String result = "";
        for (Order order : orderArray) {
            if (order != null) {
                result += order.toString();
            }
        }
        return result;
    }

    
    public double salary() {
       //****************************************
        //利用getGrossSales()計算薪資
        //****************************************
        return getGrossSales() * this.commissionRate;
    }

    public String toString() {
        return String.format("業務員編號：%s%n業務員姓名：%s%n銷售金額：%.1f%n獎金比例：%.2f%n薪資：%.1f%n",
                this.id, this.name, this.grossSales, this.commissionRate, salary() );
    }
}
