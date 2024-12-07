public class method {
    public static void allSubstring(String name) {
        for(int startIndex =0; startIndex<name.length(); startIndex++) {
            for(int endInd = startIndex+1; endInd<name.length(); endInd++) {
                System.out.println(name.substring(startIndex, endInd));
            }
        }
    }
    public static void main(String[] args) {
        String name = "babad";
        allSubstring(name);
    }
}   
