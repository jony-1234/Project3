package ArrayList;

import java.util.ArrayList;

public class UseArrayList {
    public static void main(String[]args){
        int [] jony={3,4,6,7,8,10};
        for(int i=0;i<jony.length;i++){
            System.out.println(jony[i]);
        }
        System.out.println("arraylist");
        ArrayList al = new ArrayList();
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al);
        System.out.println("Size of array:  "+ al.size());
        al.remove(5);
        al.remove(4);
        al.remove(2);
        System.out.println("size of arraylist after remove:  "+ al.size());
        System.out.println("remove list" + al);
        
    }



	}


