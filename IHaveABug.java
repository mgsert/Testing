public class IHaveABug {

    public static int addSevenAndSix(){
        int seven=  7 ;
        int six=6;
        return six + seven ;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(addSevenAndSix());
    }
}