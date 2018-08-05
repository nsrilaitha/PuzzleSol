import java.io.BufferedReader;

import java.io.File;

import java.io.FileReader;

import java.io.IOException;

public class Main

{
 
public static void main(String[] args) throws IOException {

        
try {

            
File f = new File(".//hosts_access_log_00.txt");

            
BufferedReader b = new BufferedReader(new FileReader(f));

            
String readLine = "";

            
System.out.println("Reading file using Buffered Reader");

            
while ((readLine = b.readLine()) != null) {
                
//Getting number of words in currentLine
                 
int sum=0;
                
String[] words = readLine.split(" ");
                
{
                    
for(int i=0;i<=7;i++)
                    
{
                        
                    
if(words[6]>=5000)
                    
{
                        
                        
sum=sum+words[6];
                    
}
                    
                    
System.out.println("sum of bytes greater than 5000:", sum);
                    
}
                
}
                
                
                
System.out.println(readLine);
            
}

        
} 
catch (IOException e) 
{
            
e.printStackTrace();
        
}

    
}

}
