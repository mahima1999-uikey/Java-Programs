
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Grocery {


    private final String name;
    private final String quantity;
    private final int price;
    
    public Grocery(String name,String quantity,int price){
      this.name=name;
      this.quantity=quantity;
      this.price=price; 
    }
    public static void main(String[] args) {
        List<Grocery> groceryList=new ArrayList<>();

        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your budget : ");
        int budget=scan.nextInt();
        
        while(true){
            System.out.println("1.Add an item ");
            System.out.println("2. Exit");
            
            System.out.println("Enter your choice : ");

        
        int choice=scan.nextInt();
        switch(choice){
            case 1:
                System.out.print("Enter product name : ");
                String name=scan.next();
                scan.nextLine();
                
                
                System.out.print("Enter quantity : ");
                String quantity=scan.next();
                scan.nextLine();
                
                System.out.print("Enter Price : ");
                int price=scan.nextInt();
                System.out.println("");
                
        if(budget!=0 && budget>price) {     
        Grocery lp=new Grocery(name, quantity, price);
        groceryList.add(lp);
        budget=budget-price;
         
            System.out.println("Amount left : " + budget);
        }else{
                    
            System.out.println("Can't Buy the product ### (beacause budget left is "+ budget +")");         
                }
            break;
            
            case 2:
                System.out.println("GROCERY LIST IS :");
                for(Grocery g: groceryList){
                System.out.println(" " +g.name+"        "+g.quantity+"       "+g.price);
             
                
        }
    }
        }
       
    }}


   