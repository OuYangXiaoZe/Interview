package Test3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void plan1(List<UnilateralLine> lineList) {
         for(int i=0;i<lineList.size()-1;i++){
        	 for(int j=0;j<lineList.size()-1;j++){
        		 if(lineList.get(i).getSCen() == lineList.get(j).getECen()){
        			 if(lineList.get(i).getTType() == lineList.get(j).getTType())
        				 System.out.println("rule1:"+lineList.get(i).getId()+"+"+lineList.get(j).getId());
        		 }
        	 }
         }
	}

	public static void plan2(List<UnilateralLine> lineList) {
		for(int i=0;i<lineList.size()-1;i++){
			
       	 for(int j=0;j<lineList.size()-1;j++){
       		 if(lineList.get(i).getECen() == lineList.get(j).getSCen()){
       			 for(int k=0;k<lineList.size()-1;k++){
       				 if(lineList.get(j).getECen()==lineList.get(i).getSCen())
       					 if(lineList.get(i).getTType()==lineList.get(j).getTType()&&lineList.get(k).getTType()==lineList.get(j).getTType())
       					 System.out.println("rule2:"+lineList.get(i).getId()+"+"+lineList.get(j).getId()+"+"+lineList.get(k).getId());
       			 }
       		 }
       	 }
        }
	}

	public static void plan3(List<UnilateralLine> lineList) {
		for(int i=0;i<lineList.size()-1;i++){
			
	       	 for(int j=0;j<lineList.size()-1;j++){
	       		 if(lineList.get(i).getEPro()== lineList.get(j).getSCen()){
	       		    if(lineList.get(i).getSCen()==lineList.get(j).getECen()){
	       		    	if(lineList.get(i).getTType()==lineList.get(j).getTType())
	       		    		System.out.println("rule3:"+lineList.get(i).getId()+"+"+lineList.get(j).getId());
	       		    }
	       		 }
	       	 }
	        }
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<UnilateralLine> lineList = new ArrayList<UnilateralLine>();
		while (scanner.hasNextLine()) {
			String[] options = scanner.nextLine().split(";");
			if (options.length < 5) {
				break;
			}
			lineList.add(new UnilateralLine(options[0], options[1], options[2], options[3], options[4], options[5]));
		}
		scanner.close();

		// wirte your code here
		List<String> result = calculateUnilateral(lineList);

		plan1(lineList);
		plan2(lineList);
		plan3(lineList);
	}

	public static List<String> calculateUnilateral(List<UnilateralLine> lineList) {
		List<String> result = new ArrayList<String>();
		return result;
	}

	public static class UnilateralLine {
		private String id;
		private String sCen;// 出发分拨
		private String sPro;// 出发省
		private String eCen;// 到达分拨
		private String ePro;// 到达省
		// 9.6m/17.5m
		private String tType;// 车型

		public UnilateralLine(String id, String sCen, String sPro, String eCen, String ePro, String tType) {
			this.id = id;
			this.sCen = sCen;
			this.sPro = sPro;
			this.eCen = eCen;
			this.ePro = ePro;
			this.tType = tType;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getSCen() {
			return sCen;
		}

		public void setSCen(String ePro) {
			this.ePro = ePro;
		}

		public String getSPro() {
			return sPro;
		}

		public void setSPro(String sPro) {
			this.sPro = sPro;
		}

		public String getECen() {
			return eCen;
		}

		public void setECen(String eCen) {
			this.eCen = eCen;
		}

		public String getEPro() {
			return ePro;
		}

		public void setEPro(String ePro) {
			this.ePro = ePro;
		}

		public String getTType() {
			return tType;
		}

		public void setTType(String tType) {
			this.tType = tType;
		}
	}
}
