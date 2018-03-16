package regex;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Program to display the files inside a folder and to know the total number of Files....
public class SearchingForFiles1 {
	  public static void main(String[] args) {
		    Pattern p = Pattern.compile("[a-zA-Z0-9]+[.](txt|dat|csv|xlsx)");

		    File file1 = new File("E:\\Hadoop\\Hadoop 2.0 Developer Course Content\\Input Files");

		    String fileList1[] = file1.list();

		    int counter = 0;

		    for(String file:fileList1)
		    {
		      Matcher m = p.matcher(file);

		      while(m.find())
		      {
		        System.out.println("File Name is:- " + m.group());
		        counter++;
		      }
		    }
		    System.out.println();
		    System.out.println("The Total number of files are:- " + counter);
		  }
}
