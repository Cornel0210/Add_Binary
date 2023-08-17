public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("1010", "1011"));
    }
    private static String addBinary(String a, String b) {
        int remainder = 0;
        int aPos = a.length()-1;
        int bPos = b.length()-1;
        StringBuilder sb = new StringBuilder();
        while (aPos>=0 && bPos >=0){
            if (a.charAt(aPos) == '1' && b.charAt(bPos) == '1'){
                sb.append(remainder);
                remainder = 1;
            } else if (a.charAt(aPos) == '0' && b.charAt(bPos) == '1'){
                if (remainder == 1){
                    sb.append(0);
                } else {
                    sb.append(1);
                }
            } else if (a.charAt(aPos) == '1' && b.charAt(bPos) == '0'){
                if (remainder == 1){
                    sb.append(0);
                } else {
                    sb.append(1);
                }
            } else if (a.charAt(aPos) == '0' && b.charAt(bPos) == '0'){
                if (remainder == 0){
                    sb.append(0);
                } else {
                    sb.append(1);
                    remainder = 0;
                }
            }
            aPos--;
            bPos--;
        }
        while (aPos>=0){
            if (remainder == 0) {
                sb.append(a.charAt(aPos));
            } else {
                if (a.charAt(aPos) == '1'){
                    sb.append(0);
                } else {
                    sb.append(1);
                    remainder = 0;
                }
            }
            aPos--;
        }
        while (bPos>=0){
            if (remainder == 0) {
                sb.append(b.charAt(bPos));
            } else {
                if (b.charAt(bPos) == '1'){
                    sb.append(0);
                } else {
                    sb.append(1);
                    remainder = 0;
                }
            }
            bPos--;
        }
        if (remainder == 1){
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}
