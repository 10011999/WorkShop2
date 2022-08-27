public class Array {
    public static void main(String[] args) {
        int[] numArray ={10,20,30,40};
        int[] numArray1 ={20,20,30,40};
        boolean result = false;
        for (int i=0;i<numArray.length;i++){
            for (int j=0;j<numArray1.length;j++){
                if (numArray[i] == numArray1[j]){
                    result = true;
                }
            }
        }
        if (result == true){
            System.out.println("arrys are equal");
        }else {
            System.out.println("Not a equal");
        }
    }
}
