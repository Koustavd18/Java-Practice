public class Loops
{
    public static void main (String args[])
    {
        System.out.println("LOOPS");


//While LOOP
        int i = 0;
        while(i<=1)
        {
            System.out.println("Loop while i is less than equal to 5, i : "+i);
            int j = 1;

            while(j<=2)
            {
                System.out.println("Inner Block, j : " +j);
                j++;
            }
            i++;
        }

        i=4;


// Do-While LOOP
        do {
            System.out.println("Do while " +i);
            i++;
        }
         while(i<= 3);

//For LOOP

        for(int k = 0; k<=5; k++)
        {
            System.out.println("For Looping, k : " +k);

            for(int z=1; z<=9;z++)
            {
                System.out.println("   "+(z+9));
            }
        }

    }
}