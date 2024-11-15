public class SwordsMan extends Role {
    @Override
    public void fight() {
        super.fight(); //呼叫父類別的方法fight()
        System.out.println("揮劍攻擊");
    }
}