
// Java program to find profession of a person at  
// given level and position.  
class GFG{ 
/* Function to get no of set bits in binary  
representation of passed binary no. */
static int countSetBits(int n)  
{  
    int count = 0;  
    while (n!=0)  
    {  
    n &= (n-1) ;  
    count++;  
    }  
    return count;  
}  
  
// Returns 'e' if profession of node at given level  
// and position is engineer. Else doctor. The function  
// assumes that given position and level have valid values.  
static char findProffesion(int level, int pos)  
{  
    // Count set bits in 'pos-1'  
    int c = countSetBits(pos-1);  
  
    // If set bit count is odd, then doctor, else engineer  
    return (c%2 !=0)? 'd' : 'e';  
}  







  
// Driver code  
public static void main(String [] args)  
{  
    int level = 3, pos = 4;  
    String prof = (findProffesion(level, pos) == 'e')? "Engineer" 
                                    : "Doctor"  ;  
    System.out.print(prof); 
} 
}  






















// Java program to find  
// profession of a person  
// at given level and position 
import java.io.*; 
  
class GFG 
{ 
  
// Returns 'e' if profession  
// of node at given level 
// and position is engineer. 
// Else doctor. The function 
// assumes that given position 
// and level have valid values. 
static char findProffesion(int level,  
                           int pos) 
{ 
    // Base case 
    if (level == 1) 
        return 'e'; 
  
    // Recursively find parent's 
    // profession. If parent 
    // is a doctar, this node  
    // will be a doctal if it  
    // is at odd position and an 
    // engineer if at even position 
    if (findProffesion(level - 1, 
                      (pos + 1) / 2) == 'd') 
        return (pos % 2 > 0) ?  
                         'd' : 'e'; 
  
    // If parent is an engineer,  
    // then current node will be 
    // an enginner if at add  
    // position and doctor if even 
    // position. 
    return (pos % 2 > 0) ?  
                     'e' : 'd'; 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
    int level = 4, pos = 2; 
    if(findProffesion(level,  
                      pos) == 'e') 
    System.out.println("Engineer"); 
    else
    System.out.println("Doctor"); 
} 
} 