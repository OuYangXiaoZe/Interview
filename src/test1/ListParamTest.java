package test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListParamTest {
	public static void main(String[] args) {
	      List<Integer> dataList = new ArrayList<Integer>(Arrays.asList(10,20,30,null));
	      resetList(dataList);
	      setOne(dataList);
	      int sum = 0;
	      for(Integer v:dataList){
	         sum += v;
	      }
	      System.out.println(sum);
	   }
	   public static void resetList(List<Integer> dataList){
	      dataList.subList(2, 4).set(0,40);
	      dataList = new ArrayList<Integer>(dataList);
	      dataList.add(50);
	   }
	   public static void setOne(List<Integer> dataList){
	      dataList.set(3, 100);
	   }
	   
	}