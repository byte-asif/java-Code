public class LastOccurrenceWord {
    public static void main(String[] args) {
        String str = "He is the one and only one male person in our team";
        String word = "one";
        int lastindex = str.lastIndexOf(word);
        if (lastindex == -1) {
            System.out.println("The word not present in string.");
        } else {
            System.out.println("The last index of the searched word ==> " + word + " is "+ lastindex);
        }
    }
}
