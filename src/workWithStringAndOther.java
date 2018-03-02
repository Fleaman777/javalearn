public class workWithStringAndOther {

    static String example = " here something is written";

    static String exam = example.substring(3,10);
    static int index = example.indexOf("t");
    static int index2 = example.lastIndexOf("t");
    static boolean yesOrNo = example.startsWith(" here");
    static boolean yesOrNo2 = example.endsWith(" here");
    static String repEaxmp = example.replace("here", "is");
    static float d = Float.parseFloat("3124");
    static String s = "" + 213;
    static String ss = String.valueOf(920L);
    static String intStrin = Integer.toString(100);







    public static void main(String[] args) {
        System.out.println(exam);
        System.out.println(index);
        System.out.println(index2);
        System.out.println(yesOrNo);
        System.out.println(yesOrNo2);
        System.out.println(example.charAt(12));
        System.out.println(repEaxmp);
        System.out.println(d);
        System.out.println(s);
        System.out.println(example.toUpperCase());
        System.out.println(example.concat(exam));
        System.out.println(intStrin);





    }

}