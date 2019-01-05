public class AddOne {
    public int[] addOne(int[] origArray) {
        for (int i = origArray.length - 1; i >= 0 ; i--) {
            // Current digit is not a nine, add one and return
            if (origArray[i] != 9) {
                origArray[i]++;
                return origArray;
            }
            // Current digit is nine, set to 0 and carry to next digit
            else if (origArray[i] == 9 && i != 0) {
                origArray[i] = 0;
            }
            // First digit is a nine, create new array larger and carry the one
            else {
                int[] newArray = new int[origArray.length + 1];
                newArray[0] = 1;

                return newArray;
            }
        }
        return null;
    }
}
