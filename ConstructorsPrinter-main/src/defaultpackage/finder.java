package defaultpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class finder {

	public static void findConstructors(File file){
	    Scanner word_reader = null;
		try {
			word_reader = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    List<String> keywords_of_exist = new ArrayList<>();
	    List<String> keywords_of_defaults =Arrays.asList("abstract","String","Scanner","continue", "for","new","switch","assert","default","goto","package","synchronized","boolean","do","if","private","this","break","double","implements","protected","throw","byte","else","import","public","throws","catch","extends","int","short","try","char","final","interface","static","void","class","finally","long","strictfp","volatile","const","float","native","super","while","AbstractAction");
	   
	    while(word_reader.hasNext()){
	        String fileTemp=word_reader.next();
	        if(fileTemp.contains(".")){
	            if(fileTemp.contains("()")){
	                fileTemp =fileTemp.split("\\.")[fileTemp.split("\\.").length-1];
	             fileTemp= fileTemp.split("\\(")[0];
	            if(!keywords_of_exist.contains(fileTemp)){
	                keywords_of_exist.add(fileTemp);
	            }
	            }else if(fileTemp.contains("(") && Character.isUpperCase(fileTemp.charAt(0))){
	                fileTemp= fileTemp.split("\\(")[0];
	                if(!keywords_of_exist.contains(fileTemp)){
	                    keywords_of_exist.add(fileTemp);
	                }
	            }
	        }
	        if(keywords_of_defaults.contains(fileTemp)){
	            if(fileTemp.equals("import") || fileTemp.equals("new")){
	                fileTemp = fileTemp +" "+ word_reader.next().split("\\;")[0];
	            }
	          
	        if(keywords_of_exist.isEmpty()){
	            keywords_of_exist.add(fileTemp);
	         
	        }else if(!keywords_of_exist.contains(fileTemp)){
	            keywords_of_exist.add(fileTemp);
	        }
	        }
	    }
	    word_reader.close();
	    for(int i = 0; i<keywords_of_exist.size();i++){
	        System.out.println(keywords_of_exist.get(i));
	    }
	} 
	
	public static void main(String args[]) {  
		File file = new File("./Course.java");
		findConstructors(file) ;
	}  
}
