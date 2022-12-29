class Marks extends Exception{
    Marks(String str)
    {
        super(str);
    }
    static String studnames[]={"harshadh","ravi","prema","jodha"};
    static int studid[]={12,13,14,15};
    static int attendper[]={89,90,94,54};
    static int marks[]={89,95,45,88};
}
class Students{
    public static void main(String...args){
        for(int i=0;i<Marks.studnames.length;i++)
        {
            try{
                System.out.println("Student name : "+Marks.studnames[i]+"\n"+"Student id : "+Marks.studid[i]+"\n"+"Student percentage : "+Marks.attendper[i]+"\n"+"Student mark : "+Marks.marks[i]);
                if(Marks.attendper[i]<60)
                {
                    throw new Marks(Marks.studnames[i]+" secured less than 60%");
                }
            }catch(Marks m){
                System.out.println(m.getMessage());
            }
        }
    }
}

		
	       
      