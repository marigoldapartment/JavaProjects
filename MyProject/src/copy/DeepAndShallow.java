package copy;

public class DeepAndShallow {
    public static void main(String[] args) {
        Emplpyee e = new Emplpyee(1,"Prity");

        Emplpyee e2 = new Emplpyee();
        e2.setName(e.getName());
        e2.setId(e.getId());
        e2.setName("Subhash");

        /*Emplpyee e1 = e;
        e1.setName("Subhash");*/
        //System.out.println(e.getId()+" " + e.getName());


        System.out.println(e.getId()+" " + e.getName());

    }
}
