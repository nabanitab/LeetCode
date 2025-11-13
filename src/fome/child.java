package fome;

public class child extends parent{

    public String cName;

    public int cAge;

    public child(String name,int age,String cName, int cAge) {
        super(name,age);
        this.cName = cName;
        this.cAge = cAge;
    }

  void displayChildinfo(){
        //inherited method

      displayParentInfo();
      System.out.println("cname:"+ cName);
      System.out.println("age:"+ cAge);
  }
}
