
public class DeleteAllOccursChar {
	
	 public static String deleteCharIter(String str, char singleChar) {
	        StringBuilder resultStr = new StringBuilder();
	        char[] strArray = str.toCharArray();
	        
	        for(int i = 0; i < strArray.length; i++)
	        {
	            if(strArray[i] != singleChar)
	            {

	                resultStr.append(strArray[i]);
	            }
	        }
	        return resultStr.toString();
	 }
	 
	 public static String deleteChar(String str, char singleChar) {
		 return str.replace(String.valueOf(singleChar), "");
	 }
}
