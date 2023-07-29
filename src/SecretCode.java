public class SecretCode {
    //Instance Fields
    private String inString;


    //Constructors
    public SecretCode() {
        new SecretCode(null);
    }
    public SecretCode(String inString) {
        super();
        this.inString = inString;
    }

    //Accessors
    public String getInString() {
        return inString;
    }

    public int getStringLen(String inString) {//Compute the number of characters inside inString, excluding whitespace(s)
        int stringLen = 0;
        for (int i=0; i< inString.length(); i++) {
            if (inString.charAt(i)!=' ')
                stringLen++;
        }

        return stringLen;
    }

    //Mutators
    public void setInString(String inString) {
        this.inString = inString;
    }


    //Method: check String validity
    public boolean checkStringValidity(String inString) {
        for (int i = 0; i < inString.length(); ++i) {
//	    	inString= inString.toLowerCase();
            if (!(inString.charAt(i) == 'b' || inString.charAt(i) == 'c' ||
                    inString.charAt(i) == 'd' || inString.charAt(i) == 'f' ||
                    inString.charAt(i) == 'g' || inString.charAt(i) == 'h' ||
                    inString.charAt(i) == 'j' || inString.charAt(i) == 'k' ||
                    inString.charAt(i) == 'l' || inString.charAt(i) == 'm' ||
                    inString.charAt(i) == 'n' || inString.charAt(i) == 'p' ||
                    inString.charAt(i) == 'q' || inString.charAt(i) == 'r' ||
                    inString.charAt(i) == 's' || inString.charAt(i) == 't' ||
                    inString.charAt(i) == 'v' || inString.charAt(i) == 'w' ||
                    inString.charAt(i) == 'x' || inString.charAt(i) == 'y' ||
                    inString.charAt(i) == 'z' || inString.charAt(i) == '1' ||
                    inString.charAt(i) == '2' || inString.charAt(i) == '3' ||
                    inString.charAt(i) == '4' || inString.charAt(i) == '5' ||
                    inString.charAt(i) == ' ' )) {					//validate character
                return false;
            }
        }
        return true;
    }

    //Method: shift Character
    public String shiftChr (String inString, int stringLen) {
        String alphabet = "1bcd2fgh3jklmn4pqrst5vwxyz ";
        StringBuilder cText = new StringBuilder();
        for(int i=0; i<inString.length(); i++) {
            int charIndex= alphabet.indexOf(inString.charAt(i));
            int newIndex= (charIndex + stringLen) % 27;
            char cipherChar = alphabet.charAt(newIndex);
            cText.append(cipherChar);
        }
        return cText.toString();
    }
}