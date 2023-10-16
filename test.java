
    class student {
        static int collegecode = 290;
        static int counter = 0;
    
        int counts()
        {
            return counter++;
        }
        static void m2()
        {
            collegecode = 300;
            System.out.println(collegecode);
        }
        
    }
    
    public class test{
        public static void main (String[] args)
        {
            student st1=new student();
            student st2=new student();
            System.out.println(st1.collegecode);
            System.out.println(student.collegecode);
            System.out.println(st1.counts());
            System.out.println(st2.counts());
            st1.m2();
            student.m2();
        }
    }

