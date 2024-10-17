package base;

public abstract class  AbstractAnimal {
    protected String name;  //名字
    protected int age;      //年龄
    protected String gender;  //性别
    protected double price;  //价格

    public AbstractAnimal() {
    }

    //一个全参的构造方法
    public AbstractAnimal(String name, int age, String gender, double price) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.price = price;
    }

    //一个抽象的toString方法
    @Override
    public abstract String toString();

    //以下为相应的get和set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
