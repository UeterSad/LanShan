public class Dog extends Pet{
   private String color;
   public Dog(String name,boolean sex,String color){
       setName(name);
       setSex(sex);
       this.color=color;
  }
    @Override
    public void talk() {
        System.out.println("汪汪汪");
        if(isSex()){
            System.out.println("狗狗说它是公的");
        }else {
            System.out.println("狗狗说它是母的");
        }
        System.out.println("狗狗说它叫"+getName());
        System.out.println("你注意到它的颜色是"+color);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
    public void hunt(){
       System.out.println("狗狗狩猎");
    }
}
