import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class Suwon {

	public static void main(String[] args) throws IOException {
		
		int count=0;
		{
			File file = new File("data/Suwon.txt");
			FileInputStream infile = new FileInputStream(file);
			Scanner sc = new Scanner(infile);
			
			while(sc.hasNextLine()) { //읽어올 데이터가 있는지 확인
				sc.nextLine();
				count++;
			}
			count--;
			System.out.println("count : "+ count);
			sc.close();
			infile.close();
		}
	
		String[] region = new String[count];
	    String[] city = new String[count];
	    String[] district = new String[count];
	    String[] dong = new String[count];
	    int[] variety = new int[count];
	    String[] howmany = new String[count];
	    String[] owner = new String[count];
	    String[] office = new String[count];
	    String[] callnum = new String[count];
	    String[] data = new String[count];
	    {
	    	File file = new File("data/Suwon.txt");
			FileInputStream infile = new FileInputStream(file);
			Scanner sc = new Scanner(infile);
			int total = 0;
			sc.nextLine(); // 배열의 첫번째 라인이 글자라서 읽고 버리는 용도
			for(int i=0; i<count; i++) {
				String line = sc.nextLine();
				
				String[] tokens = line.split(",");
				region[i] = tokens[0];
				city[i] = tokens[1];
				district[i] = tokens[2];
				dong[i] = tokens[3];
				variety[i] = Integer.parseInt(tokens[4]);
				total += variety[i];
			}
			
			for(int i=0; i<count; i++) 
				System.out.printf("%s %s %s %s %d\n",
					region[i], city[i], district[i], dong[i], variety[i]);
			System.out.println("total = " + total);
	    }
	}

}
