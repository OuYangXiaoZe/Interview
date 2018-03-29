package sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class BigDataSort {
    private static final int SPLIE_SIZE = 50000;
    private String inFile;
    private String outFile;
    private String path;
    private static final String PERFIX = "big-data";
    private static final String SUFFIX = ".txt";
    public int fileNum = 0;
    public static void main(String[] args){
    	
    }
    public void generateData(){
    	
    }
    public void splitFile() throws IOException{
    	int count = 0;
        String data;
			BufferedReader br = new BufferedReader(new FileReader(inFile));
		    SortedSet<Integer> set = new TreeSet<Integer>();
		do{
			data = br.readLine();
			if(data != null){
				set.add(Integer.valueOf(data));
				count++;
				if(count>=SPLIE_SIZE){
					System.out.println("+++++++++=文件分割");
					writeFile(path,set);
					fileNum++;
					count =0 ;
					
				}else{
					writeFile(path,set);
					fileNum++;
					count=0;
				}
				
			}
		}while((data = br.readLine()) != null);
    }
    private void writeFile(String path2,SortedSet<Integer> set) {
		File dir = new File(path);
		if(!dir.exists())
			dir.mkdirs();
		
		String fname = path + System.getProperty("file.separator"+PREFIX+filenum+SUFFIX);
		BufferedWriter bw = new BufferedWriter(new FileWriter(fname));
	    Iterator<Integer> iter = set.iterator();
	    while
    
    
    }
	public void internalSort(){
    	
    }
    public void mergeFile(){
    	
    }
}
