public class Main{
   public static void main(String[] args) {
       product p = new product();
       p.id =101;
       p.title = "iphone15";
       p.price =1895;
       p.description="perfect product with best image quality ";
       p.category = "phone";
       System.out.println("id :"+ p.id);
       System.out.println("title :"+ p.title);
       System.out.println("price:" + p.price);
       System.out.println("description:"+p.description);
       System.out.println("category:" + p.category);
    }
}