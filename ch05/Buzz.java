public class Buzz {

    public static void baffle(String blimp) {
    /*4*/    System.out.println(blimp);
    /*5*/    zippo("ping", -5);
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) {
        /*6*/    System.out.println(quince + " zoop");
        } else {
        /*2*/    System.out.println("ik");
        /*3*/    baffle(quince);
            /*7*/System.out.println("boo-wa-ha-ha");
        }
    }

    public static void main(String[] args) {
        /*1*/zippo("rattle", 13);
    }

}

/*String blimp = "rattle"*/
/*
ik
rattle
ping zoop
boo-wa-ha-ha
*/