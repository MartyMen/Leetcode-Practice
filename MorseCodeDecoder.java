public class MorseCodeDecoder {
    public static String decode(String morseCode) {
      String[] arrOfStr = morseCode.split(" ", 0);
      String decoder = "";
      String encoded = "";    
      
        for (int i = 0; i < arrOfStr.length; i++)
          {
            String a = arrOfStr[i];
            encoded = MorseCode.get(a);
            if(encoded == null && MorseCode.get(arrOfStr[i+1]) == null)
              {
              encoded = "";
              }
            else if(encoded == null)
            {
              encoded = " ";
            }
            decoder = decoder + encoded;
          }
      System.out.print(decoder);
      
      return decoder;
    }
}
