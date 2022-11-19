public abstract class Pet {
   private String name;
   private boolean sex;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public boolean isSex() {
      return sex;
   }

   public void setSex(boolean sex) {
      this.sex = sex;
   }

   public Pet(){

   }
   public Pet(String name,boolean sex){

   }
   public abstract void talk();
   public abstract void eat();
}
