import javax.swing.JOptionPane;
class Cipher {
    public static void main(String[] args) {
 
        String str = JOptionPane.showInputDialog("Enter the text");
        
        String encode = Cipher.encode( str, 12 );
        String decode = Cipher.decode( Cipher.encode( str, 12), 12 );
        
        JOptionPane.showMessageDialog(null,"The Encryption Of Text : " +encode+"\n"+"The Text After Dycription Is : " +decode );
 
        //System.out.println( Cipher.encode( str, 12 ));
        //System.out.println( Cipher.decode( Cipher.encode( str, 12), 12 ));
    }
 
    public static String decode(String enc, int offset) {
        return encode(enc, 26-offset);
    }
 
    public static String encode(String enc, int offset) {
        offset = offset % 26 + 26;
        StringBuilder encoded = new StringBuilder();
        for (char i : enc.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encoded.append((char) ('A' + (i - 'A' + offset) % 26 ));
                } else {
                    encoded.append((char) ('a' + (i - 'a' + offset) % 26 ));
                }
            } else {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }
}