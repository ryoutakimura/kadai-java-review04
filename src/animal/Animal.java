package animal;

public class Animal {
    //フィールド
    private String name;
    private int age;

    //引数なしコンストラクタ
    public Animal() {

    }
    //引数ありコンストラクタ
    public Animal(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void say() {
        System.out.println(this.name + "です。" + this.age + "です。");
    }

}
