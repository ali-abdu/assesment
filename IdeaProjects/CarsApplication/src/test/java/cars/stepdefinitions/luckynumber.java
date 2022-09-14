package cars.stepdefinitions;

import org.junit.Assert;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class luckynumber {


    public static void main(String[] args) {
        int []a ={1,2,3,0,2,4,5,6,7,0,4,2,0,1,5};

        ArrayList<Integer> intg=new ArrayList<>();
        ArrayList<Integer> intg2=new ArrayList<>();
        intg.add(a[0]);
        intg.add(a[1]);
        intg.add(a[2]);
        intg2.add(a[a.length-1]);
        intg2.add(a[a.length-2]);
        intg2.add(a[a.length-3]);
        System.out.println("first 3 numbers "+intg);
        System.out.println("last 3 numbers "+intg2);

   int sumFirstThree= intg.get(0)+intg.get(1)+intg.get(2);
   int sumLastThree=intg2.get(0)+intg2.get(1)+intg2.get(2);

        System.out.println(sumFirstThree);
        System.out.println(sumLastThree);

        Assert.assertEquals(sumFirstThree,sumLastThree);

    }


}
