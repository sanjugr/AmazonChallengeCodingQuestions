public class EncodeString {

    private int count;

    public String Encode(String inputString){
        if(inputString == null && inputString.length()==0 )
            return "";
        else {

            StringBuilder result = new StringBuilder();

            char[] inputCharArray = inputString.toCharArray();
            char previous = 0;
            int count = 0;

            // iterating over each chars in the String
            for(char c : inputCharArray){
                if(c == previous)
                    count++;
                else if (previous !=0){
                    result.append(count).append(previous);
                }

                previous = c;
                count =1;
            }
            result.append(count).append(previous);

            return result.toString();
        }

    }

    public String EncodeWOrking (String inputStr){
        int n = inputStr.length();
        StringBuilder finalResult = new StringBuilder();

        for(int i=0; i<n;i++){
            int   count = 1;
            while(i<n-1 && inputStr.charAt(i) == inputStr.charAt(i+1)){
                    count++;
                    i++;
                }
                finalResult.append(inputStr.charAt(i));
                if(count !=1 ){ finalResult.append(count); }

        }
        return finalResult.toString();
    }
}
