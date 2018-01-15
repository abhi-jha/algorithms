import java.io.*;

class Link


{


  public int coeff;
 

  public int exp;
 

  Link next;
  

  public Link(int a,int b)
{

   coeff=a;exp=b;

}
  

   public int retcof(){

    return coeff;

}
  

   public int retexp() {

    return exp;

}
  

   public void displayLink(){

   System.out.print(coeff+"x^"+exp);

}




}


                                                                         

 class LinkList{
  

 

 Link first;
  

 

public LinkList(){

           ;

}
  

  public void insertfirst(int x,int y)
{

  Link newLink=new Link(x,y);
  

  newLink.next=first;
   

  first=newLink;

}
 

public void displayList()

{

  Link x=first;int flag=0,flag1=0,flag2=0;

   while(x!=null)

   {

       if(flag==0)

       {

        if(x!=null&&x.retcof()!=0) {x.displayLink();flag=1;flag1=1;x=x.next;}

        else if(x!=null&&x.retcof()==0) {x=x.next;}

       }

       if(x!=null&&x.retcof()>0&&flag1==1)

          { System.out.print("+");x.displayLink();flag2=1;x=x.next;} 

       else if(x!=null&&x.retcof()<0&&flag1==1)

         {x.displayLink();x=x.next;}

       else if(x!=null&&x.retcof()==0&&flag1==1)

          x=x.next;

           

        if(x!=null&&x.next==null)

          {

           if(x.retcof()>0&&(flag1==1||flag2==1))

             {System.out.print("+");x.displayLink();x=x.next;}

           else if(x.retcof()<0)

             {x.displayLink();x=x.next;}

           else if(x.retcof()==0)

              {x=x.next;}

          }   

    }



}





public void add(LinkList a,LinkList b)
{

Link current1=a.first;
 

  Link current2=b.first;


  LinkList qwe=new LinkList();

while (current1 != null || current2 != null) {       

   if (current1 == null&&current2!=null)    

       {qwe.insertfirst(current2.retcof(),current2.retexp());current2 = current2.next;}

    if (current2 == null&&current1!=null)   

      {qwe.insertfirst(current1.retcof(),current1.retexp());  current1 = current1.next;}   

    if ((current1 != null && current2 != null)&&(current1.retexp() > current2.retexp()))  

     {qwe.insertfirst(current1.retcof(),current1.retexp()); current1 = current1.next;}            

    else if ((current1 != null && current2 != null)&&(current1.retexp() < current2.retexp()))   

       {qwe.insertfirst(current2.retcof(),current2.retexp()); current2 = current2.next;}   

    else if((current1 != null && current2 != null)&&(current1.retexp() == current2.retexp()))    

       {qwe.insertfirst(current2.retcof()+current1.retcof(),current2.retexp()); current1 = current1.next; current2 = current2.next;}       

    }

    qwe.displayList();

   }

}


  class poly{


  

  public static void main(String [] args)throws IOException
{



   int degree1,degree2,num1,itr;


 

    LinkList wow=new LinkList();


  

    LinkList wow1=new LinkList();


  

  System.out.println("Enter the degree of the first polynomial "+" ");


  

  DataInputStream X=new DataInputStream(System.in);


  

  String s=X.readLine();

  

  degree1=Integer.parseInt(s);


  

  itr=degree1;

 
 

  while(!(itr<0)){ 


  System.out.print("enter the coeff of x^"+itr+" : ");
 

   s=X.readLine();

   num1=Integer.parseInt(s);

   wow.insertfirst(num1,itr);
 

   itr--;


  } 
 

  wow.displayList();


  

  System.out.println("\n"+"Enter the degree of the second polynomials "+" ");


  

  s=X.readLine();

  

  degree2=Integer.parseInt(s);

  

  itr=degree2;


  

  while(!(itr<0))
{


  System.out.print("enter the coeff of x^"+itr+" : ");
 

  s=X.readLine();

  num1=Integer.parseInt(s);

  wow1.insertfirst(num1,itr);
 itr--;

  
}

  wow1.displayList();

  System.out.println("\n");



  System.out.print("First polynomial is : ");

  wow.displayList();


  System.out.println("\n");


  System.out.print("Second polynomial is : ");

  wow1.displayList();

  System.out.println("\n");


  System.out.print("Sum of both polynomial is : ");

  wow.add(wow,wow1);


  System.out.println("\n");


}


}




