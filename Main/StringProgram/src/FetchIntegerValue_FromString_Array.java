public class FetchIntegerValue_FromString_Array {
    public static void main(String[] args) {
        String str="200,201,404";
        String[] stringArray = str.split(",");
        for (int i = 0; i < stringArray.length; i++) {
            Integer num = Integer.parseInt(stringArray[i]);
            System.out.println(num+2);
        }
    }
}
