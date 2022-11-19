public class Cat extends Pet{
    private double weight;
    public Cat(String name,boolean sex,double weight){
        setName(name);
        setSex(sex);
        this.weight=weight;
    }
    @Override
    public void talk() {
        System.out.println("喵喵喵");
        if(isSex()){
            System.out.println("猫猫说它是公的");
        }else {
            System.out.println("猫猫说它是母的");
        }
        System.out.println("猫猫说它叫"+getName());
        System.out.println("你发现它的体重是"+weight+"kg");
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void climb(){
        System.out.println("猫咪爬树━((*′д｀)爻(′д｀*))━!!!!");
    }
}
