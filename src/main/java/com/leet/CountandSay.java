package com.emc.mystic.manager.operation.core.factory.leet;

import java.util.ArrayList;
import java.util.List;

public class CountandSay {


    public static void main(String [] args){


        CountandSay c = new CountandSay();

        c.countAndSay(1);


    }


    public String countAndSay(int n) {


        List<Integer> cs = new ArrayList<Integer>();

        cs.add(1);

        while(n > 1){
            List<Integer> temp = new ArrayList<Integer>(cs);
            cs.clear();
            int count = 1;
            for(int i = 0 ;i < temp.size(); i ++){

                if( i + 1 < temp.size() && temp.get(i + 1).equals(temp.get(i))){
                    count ++;
                }
                else{
                    cs.add(count);
                    cs.add(temp.get(i));
                    count = 1;
                }
            }
            n--;
        }



        StringBuffer sb = new StringBuffer();

        for(Integer l : cs){
            sb.append(l);
        }

        return sb.toString();
    }


}
