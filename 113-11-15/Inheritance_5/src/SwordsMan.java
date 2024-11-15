public class SwordsMan extends Role {
    @Override
    public void fight() {
        super.fight(); //呼叫父類別的方法fight()
        System.out.println("揮劍攻擊");
    }

    @Override
    public String toString() {
        return String.format("劍士：%s", super.toString());
    }
}