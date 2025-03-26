public class cla {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //created a pen object called p1 
        p1.setColor("red");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        BanckAccount myacc = new BanckAccount();
        myacc.userName = "pranav dewangan";
        myacc.stepassword("absddbhdhuihausih");
    }
}

class BanckAccount {
   public String userName;
   private String password;
   public void stepassword(String pwd){
    password = pwd;
   }
}

class Pen {
    //attributes+functions
   private String color;
   private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }


    void setColor(String newColor) {
        color = newColor;
    }

   
    void setTip(int newTip){
        tip = newTip;
    }
}