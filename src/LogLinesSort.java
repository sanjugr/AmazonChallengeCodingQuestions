import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// CLASS BEGINS, THIS CLASS IS REQUIRED
public class LogLinesSort
{
    public List<String> reorderLines(int logFileSize, List<String> logLines) {
        LinkedList<String> letters = new LinkedList<String>();
        LinkedList<String> numbers = new LinkedList<String>();
        for(String str : logLines){
            String logDiv[];
            int index = str.indexOf(" ");
            index++;
            char c= str.charAt(index);
            if(c >= 'a' && c <= 'z') {
                if(letters.size()== 0){
                    letters.addFirst(str);
                    continue;
                }
                logDiv = getallStrings(str,index);
            }else{
                numbers.addLast(str);
                continue;
            }
            //comparing the 2nd part of the logs
            int counter = 0;
            boolean inserted= false;
            while(counter < letters.size()){
                String temp = letters.get(counter);
                index = temp.indexOf(" ");index++;
                String[] llogDiv = getallStrings(temp,index);
                int compResult = llogDiv[1].compareTo(logDiv[1]);

                if(compResult > 0){
                    letters.add(counter,str);
                    inserted = true;
                }else if(compResult < 0){
                    if(counter+1 == letters.size()){
                        letters.addLast(str);
                        inserted = true;
                    }
                }else // if 2nd part is same -then comparing the identifier
                    {
                    int compareSup = llogDiv[0].compareTo(logDiv[0]);
                    if(compareSup > 0) {
                        letters.add(counter,str);
                        inserted = true;
                    }else {
                        if(counter+1 == letters.size()){
                            letters.addLast(str);
                            inserted = true;
                        }
                    }
                }
                if(inserted) break;
                counter++;
            }
        }
        String[] finalResult = new String[letters.size()+numbers.size()];
        int count = 0;
        for(String let : letters){
            finalResult[count++] = let;
        }
        for(String dig : numbers){
            finalResult[count++] = dig;
        }
        List <String> strList = new ArrayList<String>();
        
        for (int i =0; i<finalResult.length;i++){
            strList.add(finalResult[i]);
        }
        return strList;
    }

    public String[] getallStrings(String str,int index) {
        String supLog = str.substring(0, index);
        String subLog = str.substring(index);
        return new String[]{supLog,subLog};
    }
}
//  SIGNATURE ENDS
