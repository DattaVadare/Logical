import java.util.*;
class checkVowels {
    public static void main(String[] args) {
    
    String str="Datta birappa vadare";
    str=str.toLowerCase();
    int count=0;
    Set<Character> uniqueSet = new HashSet<>();
    char ch[]=str.toCharArray();
    
    for(int i=0;i<ch.length;i++){
        if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
             count++;
           uniqueSet.add(ch[i]);
              
           
        }
        
    }
    
    System.out.println("Number of  vowels: " + count);
        System.out.println("Unique vowels: " + uniqueSet); 
    
    
    }
}
