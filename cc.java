public class cc {
    String name;
    int age;

    public cc() {
        this.name = " ";
        this.age = 0;
    }

    public cc(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public cc(cc neww) {
        this.name = neww.name;
        this.age = neww.age;
    }

    public void display() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public static void main(String[] args) {
        cc obj1 = new cc("IT", 19);
        cc obj2 = new cc(obj1);
        obj2.display();
        obj1.display();
    }
}



