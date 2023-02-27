public class MorseCodeDecoder {
        public static String decode(String morseCode) {
            // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
            String[] arrOfStr = morseCode.split(" ", 0);
            String decoder = "";
            String encoded = "";

            for (int i = 0; i < arrOfStr.length; i++)
            {
                String a = arrOfStr[i];
                encoded = MorseCode.get(a);
                if(encoded == null)
                {
                    encoded = " ";
                }
                decoder = decoder + encoded;
            }
            return decoder;
        }
    }
