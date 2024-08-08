public class RemoveSpecialCharacterInString {
    public static void main(String[] args) {
        String str="This#string%contains^special*characters&.";
        String regex="[^a-zA-Z0-9]";
        String str1=str.replaceAll(regex," ");
        System.out.println(str1);

    }
}
