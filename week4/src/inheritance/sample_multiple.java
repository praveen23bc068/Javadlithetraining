package inheritance;

//parent 1
interface Clothing{
    void mens_wear();
    void women_wear();

        }

//parent 2
interface jewels{
    void gold();
    void silver();

        }


//parent 3
interface cosmetic{
    void item1();
    void item2();

        }

 class Amazon_cart implements  Clothing,jewels,cosmetic{
     @Override
     public void mens_wear() {
         System.out.println(" men Clothing Interface");

     }

     @Override
     public void women_wear() {
         System.out.println("women Clothing Interface");

     }

     @Override
     public void item1() {
         System.out.println("item 1 ,cosmetic Interface");

     }

     @Override
     public void item2() {
         System.out.println("item 2 ,cosmetic Interface");

     }

     @Override
     public void gold() {
         System.out.println("gold, jewel Interface");

     }

     @Override
     public void silver() {
         System.out.println("silver ,jewel Interface");

     }
 }

public class sample_multiple {
    public static void main (String[] args){
        Amazon_cart a=new Amazon_cart();
        a.women_wear();
        a.mens_wear();
        a.item1();
        a.item2();
        a.gold();
        a.silver();

        }
    }

