public class StringFunctions {

    public static void stringreverse()
    {
        String inputstring = "Rishabh";
        StringBuilder reversestring = new StringBuilder();
        reversestring.append(inputstring);
        reversestring.reverse();
        System.out.println(reversestring);
    }

    public static int stringsize()
    {
        String inputstring = "Rishabh";
        return inputstring.length();
    }
}
