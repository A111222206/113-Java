public class Magician extends Role {
    @Override
    public void fight() {
        super.fight(); //呼叫父類別的方法fight()
        System.out.println("魔法攻擊");
    }

    public void cure() {
        System.out.println("魔法治療");
    }
}
