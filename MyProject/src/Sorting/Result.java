package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Result {

    /*
     * Complete the 'minTime' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY files
     *  2. INTEGER numCores
     *  3. INTEGER limit
     */

    public static long minTime(List<Integer> files, int numCores, int limit) {
        // Write your code here
        long sum = 0l;
        if(limit==1){
            for(Integer i : files){

                sum = sum +i;
            }

        }else{
            int currentIndex = 0;

            for(int index = currentIndex; index < files.size(); index++){
                if(numCores == 1){
                    sum = sum + files.get(index);
                }else if(files.get(index) % numCores == 0){
                    if(files.get(index)>numCores){
                        int number = files.get(index)/numCores;
                        int mod = files.get(index) % numCores;
                        sum = sum + number+mod;
                    }else {
                        sum = sum + 1;
                    }
                }else{
                    if(files.get(index)>numCores){
                        int number = files.get(index)/numCores;
                        int mod = files.get(index) % numCores;
                        sum = sum + number+mod;
                    }else{
                    sum = sum +files.get(index);
                     }
                }
                currentIndex = index;
            }
        }

        return sum;

    }


    public static void main(String[] args) {
        List<Integer> file = new ArrayList<>();
        file.add(130291875);
        file.add(474356040);file.add(1);file.add(8);

        int numCores = 5;
                int limt = 3;
        minTime(file,numCores,limt);
    }

}