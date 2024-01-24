class Book {
    public static void main(String[] args) {
     Book[] obj = new Book[10];
  
    
    obj[0] = new Book(10,"Member1");  
obj[1] = new Book(20,"Member2");  
obj[2] = new Book(29,"Member3");  
obj[3] = new Book(11,"Member4");  
obj[4] = new Book(30,"Member5");  
 obj[5] = new Book(10,"Member6");  
obj[6] = new Book(21,"Member7");  
obj[7] = new Book(22,"Member8");  
obj[8] = new Book(15,"Member9");  
obj[9] = new Book(25,"Member10");  

System.out.println("Book Object 1:");  
obj[0].display();  
System.out.println("Book Object 2:");  
obj[1].display();  
System.out.println("Book Object 3:");  
obj[2].display();  
System.out.println("Book Object 4:");  
obj[3].display();  
System.out.println("Book Object 5:");  
obj[4].display();  
System.out.println("Book Object 6:");  
obj[5].display();  
System.out.println("Book Object 7:");  
obj[6].display();  
System.out.println("Book Object 8:");  
obj[7].display();  
System.out.println("Book Object 9:");  
obj[8].display();  
System.out.println("Book Object 5:");  
obj[9].display();  
    
    }
}
