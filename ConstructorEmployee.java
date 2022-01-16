class ConstructorEmployee
{  
    int id;  
    String name;  
    // creating default constructor
      ConstructorEmployee()
   {
   }


    //creating a parameterized constructor  
    ConstructorEmployee(int i,String n){  
    id = i;  
    name = n;  
  }  
    
    public static void main(String args[]){  
    //creating objects and passing values  
    ConstructorEmployee e1 = new ConstructorEmployee();  
    ConstructorEmployee e2 = new ConstructorEmployee(1,"sai"); 
    System.out.println(e2.id);//prints 1
    System.out.println(e2.name);//prints sai
    
   
   }  
}  