 /*
  input: seaside the to sent be to ne2ds army ten of team a
output: a team of ten army needs to be sent to the seaside 
  */
 
 class MessageDecryptor {
    
    public static void main(String[] args) {
        String encryptedMessage = "seaside the to sent be to ne2ds army ten of team a";
        String decryptedMessage = decryptMessage(encryptedMessage);
        System.out.println("Decrypted Message: " + decryptedMessage);
    }
    
    public static String decryptMessage(String encryptedMessage) {
        String str = ""; 
        String[] strArr = encryptedMessage.split(" "); // Split the encrypted message into an array of words
        
        // Iterate over each word in reverse order
        for(int i = strArr.length-1; i >= 0; i--) {
            if(containsNumber(strArr[i])) { // If the word contains a number
                str+=" ";
                char[] cha = strArr[i].toCharArray(); // Convert the word to a character array
                for(int j = 0; j < cha.length; j++) {
                    if(Character.isDigit(cha[j])) { // If the character is a digit
                        char p = cha[j-1]; // Get the previous character
                        for(int k = 1; k < Character.getNumericValue(cha[j]); k++) {
                            str += p; // Append the previous character to the output string as many times as specified by the digit
                        }
                    } else {
                        str += cha[j]; // If the character is not a digit, append it directly to the output string
                    }
                }
            } else {
                str += " " + strArr[i]; // If the word doesn't contain a number, append it to the output string with a space
            }
        }
        
        return str.trim(); 
    }
    public static boolean containsNumber(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}
 