public class TypeCasting {
    public static void main(String[] args) {
        byte  x =5;
        short a=x;
        int b=a;
        float c=b;
        double d=c;
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


        Animals obj=new Animals("lion",5);
        Dog dog_obj=new Dog("tony",2,"brown");
        obj=dog_obj;
        obj.animal();
    }
}



class Animals {
    String name;
    int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void animal() {
        System.out.println("animal info");
        System.out.println("animal :" + name);
        System.out.println("animal age :"+ age);
    }
}

class Dog extends Animals {
    String color;

    public Dog(String name, int age,String color){
        super(name,age);
        this.color=color;
    }

    public void dog() {
        System.out.println("dog info");
        System.out.println("dog name:" + name);
        System.out.println("dog age :"+ color);
    }
}
