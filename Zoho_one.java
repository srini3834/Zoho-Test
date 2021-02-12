package common;

import java.util.*;
import java.io.*;

public class Zoho_One {

public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str=s.next();
int len,mid,k=0;
char a[]=new char[100];
len=str.length();
mid=len/2;
   for(int i=mid;i<str.length();i++)
   a[k++]=str.charAt(i);
   for(int i=0;i<str.length();i++)
   a[k++]=str.charAt(i);
   
   
   for(int i=0;i<str.length();i++){
       k=0;
       for(int j=0;j<str.length();j++){
           if(j<len-1)
           System.out.print(" ");
           if(j>=len-1)
           System.out.print(a[k++]);
       }
       len--;
       System.out.println();
   }
//printStars(str,str.length());
}

}
