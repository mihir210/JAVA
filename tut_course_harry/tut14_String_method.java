public class tut14_String_method {
    public static void main(String[] args) {
        String a = new String("mihir");
        int length = a.length();    //find the length of string
        System.out.println(length);


        String n = a.toLowerCase();   // to lower case character
        System.out.println(n);

        String b = a.toUpperCase();    // to upper case character
        System.out.println(b);

        String nottrim = "         mihir     ";
        System.out.println(nottrim);

        String trim = nottrim.trim();          // to remove extra space in string
        System.out.println(trim);

        System.out.println(trim.substring(1, 3));   // begin to last index


        System.out.println(trim.replace('r', 'p'));   // replace char

        System.out.println(trim.startsWith("mih"));

        System.out.println(trim.charAt(4));    // char at 4 index

        System.out.println(trim.indexOf('m'));   // index of char
    }
}
