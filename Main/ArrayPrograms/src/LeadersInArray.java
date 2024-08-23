public class LeadersInArray {
    public static void main(String[] args) {
        LeadersInArray lead = new LeadersInArray();
        int arr[] = new int[]{16, 17, 4, 3, 5, 2};
        int n = arr.length;
        lead.leader(arr, n);
    }
    void leader(int[] arr,int n){
        int curr_lder=arr[n-1];
        System.out.print(curr_lder+" ");
        for (int i = n-2; i>=0; i--) {
            if (curr_lder<arr[i]) {
                curr_lder = arr[i];
                System.out.print(curr_lder + " ");
            }
        }
    }
}
