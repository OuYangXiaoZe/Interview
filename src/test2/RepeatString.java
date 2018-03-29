package test2;

import java.util.HashMap;  
public class RepeatString   
{  
	
//	思路如下：对一个字符串，从第一个字符开始，检查前两个字符组成的字符串，是否被它后面的子串包含。
//	如果没有包含，则从第二个字符开始同样的方法检查；如果包含则统计包含数量。方法是：
//	被检查的子串根据重复串下标削去重复的部分多次检查得到重复次数，最后将重复串和次数放入hashtable。
//	然后针对第二个字符，依次向后扩展可能的重复串，即检查前3个字符组成的串是否重复，同样的方法统计，
//	放入hashMap。然后移动到第三个字符，依次进行。可以看到需要处理的字符串是依次减少的
public static void main(String[] args)  
{  
    String str="abcdefghcdefaecdehkcdefdedehkcfa";  
    HashMap<String, Integer> map=new HashMap<>();  
      
    for(int i=0;i<str.length()-3;i++)//处理的字符串向后移动  
    {  
        int k=i;  
        String str1=str.substring(i,i+2);  
        String str2=str.substring(i+2);       
        while(str2.contains(str1))//后面的字串包含前面的  
        {  
            int cnt=1;  
            String strtemp=str2;  
            while(strtemp.contains(str1))  
            {  
                cnt++;  
                strtemp=strtemp.substring(strtemp.indexOf(str1)+str1.length());  
                //被查找的字符串更新  
            }  
            if(!map.containsKey(str1))  
                  map.put(str1,cnt);//放入HashMap  
              
            str1=str.substring(i,++k+2);//”可能的重复串“扩展  
            str2=str.substring(k+2);              
        }  
    }  
      
    int j=0;//以下程序为了格式化输出  
    for(Object key:map.keySet())  
    {     
      j++;  
      System.out.print(key+":"+map.get(key)+"\t");  
      if(j%5==0)  
      System.out.println();       
    }  
}  
      
}  