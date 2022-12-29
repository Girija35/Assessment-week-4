interface Func{
    static void display()
    {
        System.out.println("This collection of chocolates are in stock in this shop");
    }
    void arrays(String[] sweets);
    
}
class Main{
    public static void main(String...args)
    {
         String choco[]={"5-star","Diary milk","Milky bar","Kitkat"};
         Func.display();
         Func o=(String[] sweets)->{
             for(String x:sweets)
             {
                 System.out.println(x);
             }
         };
         o.arrays(choco);
    }
}
