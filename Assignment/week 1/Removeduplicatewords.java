package seleniumSample1;

public class Removeduplicatewords {

	public static void main(String[] args) {
	
		  String text="We learn java basics as a part of java session in java week1";
		  String [] words=text.split(" ");
		  
		  for(int i=0;i<words.length;i++) {
		  
		
		  for(int j=i+1;j<words.length; j++) {
		  
		  if(words[i].equals(words[j])) {
		  
		  words[j]= " "; 
		
		  }
		  
		  }
		  System.out.println(words[i]);
  		  
		  }
		  System.out.println(" ======================================");
		 	
		  System.out.println("Method2 ");
		
		  String text1 = "We learn java basics as part of java sessions in java week1";

			int count = 0;

			String temp = "";

			String[] wordsArr = text1.split(" ");

			for (int i = 0; i < wordsArr.length - 1; i++) {
				for (int j = i; j < wordsArr.length - 1; j++) {
					if (wordsArr[i].equals(wordsArr[j])) {
						temp = wordsArr[i];
						count += 1;
					}
				}
			}

			if (count > 1) {
				System.out.println(text.replace(temp, ""));
			}

		  
		 }
		    
	
	}	
		