public  abstract class Role {
    private String name;
    private int level;
    private int blood;

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void fight() ; //抽象方法 要放在抽象類別裡 //繼承抽象類別必須實作抽象方法 或自已變成抽象類別
}
