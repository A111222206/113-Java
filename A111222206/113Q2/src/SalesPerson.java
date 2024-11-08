public class SalesPerson {
    private String id;
    private String name;
    private double grossSales;
    private double commissionRate;

    public SalesPerson(String id, String name) {
        //需修改
        this.id = id;
        this.name = name;
        this.grossSales = 0;
        this.commissionRate = 0.01;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setGrossSales(double grossSales) {
        //檢查銷售金額必須為正值!
        if(grossSales < 0) {
            System.out.println("銷售金額必須為正值!");
        }
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        //檢查獎金比例必須為0~1!
        if(commissionRate < 0 || commissionRate > 1) {
            System.out.println("獎金比例必須為0~1!");
        }
        this.commissionRate = commissionRate;
    }

    public double salary() {
        //薪資為銷售額乘上分紅比
        return this.grossSales * this.commissionRate;
    }

    public String toString() {
        return String.format("業務員編號：%s%n業務員姓名：%s%n銷售金額：%.1f%n獎金比例：%.1f%n薪資：%.1f%n",
                this.id, this.name, this.grossSales, this.commissionRate, salary() );
    }
}
