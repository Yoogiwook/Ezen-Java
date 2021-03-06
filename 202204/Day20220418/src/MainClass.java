import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		int count=0;
		{
		File flie = new File("data/data1.txt");// 파일의 경로
		FileInputStream src = new FileInputStream(flie);// 파일의 내용 읽어오기
		Scanner sc = new Scanner(src);

		while(sc.hasNext()) {// 읽어올 데이터가 있으면 트루 값을 저장 
			count++;
			String tmp = sc.next();// 데이터를 입력(nextLine 이면 한줄 통으로 읽어옴)
			System.out.printf("%s ", tmp);// 데이터 출력
		}
		System.out.println("\ncount = "+ count);
		
		sc.close();// 반드시 클로즈 해줘야함
		src.close();
		}
		int[] nums = new int[count]; 
		{
			// 배열 공간 data1.txt 내용 넣기
			File flie = new File("data/data1.txt");
			FileInputStream src = new FileInputStream(flie);
			Scanner sc = new Scanner(src);

			for(int i=0; i<count; i++) {
				String tmp = sc.next();
				nums[i] = Integer.parseInt(tmp);
			}
			System.out.println("nums : " + Arrays.toString(nums));
			
			sc.close();
			src.close();
		}
		
		//배열에서 특정 숫자를 찾기
		{
			//반복해서 찾아야 한다. 숫자 88이 몇번째에 있는지 출력
			int index = -1;
			for(int i=0; i<count; i++)
				if(88 == nums[i]) {
					index = i;
			break;
				}
			System.out.println("index : " + index);
		}
		
		//index 위치 변경 ==> 0 <--> 5 위치 교환
		{
			int tmp = 0;
			tmp = nums[0];
			nums[0] = nums[5];
			nums[5] = tmp;
			System.out.println("0 <--> 5 : " + Arrays.toString(nums));
		}
		
		//반복적으로 i <> i+1 을 교환
		{
			for(int i=0; i<count-1; i++) {
				int tmp;
				tmp = nums[i];
				nums[i]	= nums[i+1];
				nums[i+1] = tmp;
			Thread.sleep(1000);
			
			for(int j=0; j<30; j++)
				System.out.println();
			
			for(int j=0; j<count; j++) {
				if(j == i+1 || j ==i+0)
					System.out.printf("[%d] ", nums[j]);
				else
					System.out.printf("%d ", nums[j]);
			}
//			System.out.println("i <> i+1 : " + Arrays.toString(nums));
			}
		}
	}

}
