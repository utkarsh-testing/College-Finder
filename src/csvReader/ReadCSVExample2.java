package csvReader;
import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  
public class ReadCSVExample2  
{  
public static void main(String[] args)   
{  
String line = "";  
String splitBy = ",";  
try   
{  
//parsing a CSV file into BufferedReader class constructor  
BufferedReader br = new BufferedReader(new FileReader("josaa-cutoff.csv"));  
int j=0;

while ((line = br.readLine()) != null)   //returns a Boolean value  
{  
	String[] employee = line.split(splitBy);    // use semicolon as separator  
	j++;
for(int i=0;i<8;i++) {
System.out.println(employee[i]);  
} 
if(j==100) {
	break;
}
}
}   
catch (IOException e)   
{  
e.printStackTrace();  
}  

}
}
