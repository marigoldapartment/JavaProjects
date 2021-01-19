package overloading;

public class Sum {


    public String add(int x, int y){
        return x+y+"";
    }

    public int add(int x, int y, int z){
        return x+y+z;
    }

    public  int add(long k, int y){
        return Math.toIntExact(k + y);
    }

    public void print(int x, int y, int z){
        System.out.println(x+y+z);
    }

    public Sum(){
        System.out.println("Default Constructor");
    }

    public Sum(String s, String p){
        System.out.println("Two Parameter Constructor :" +s +p);
    }

    public Sum(String s){
        System.out.println("One Parameter Constructor :"+ s);
    }

}
