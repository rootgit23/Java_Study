package com.im.array;

import java.util.Scanner;

public class Array_ex3 {

	public static void main(String[] args) {
		// 학교 성적 프로그램
		// 1. 학생정보 입력(학생의 수를 입력 이름,번호,국어,영어,수학 입력후 계산해서 총점과 평균도 계산)  
		// 2. 학생정보 조회(모든 학생의 이름,번호,총점,평균 출력)
		// 3. 학생의 정보 검색(검색할 학생의 번호를 입력 해당 학생의 모든 정보 출력 일치하는 번호 없으면 없는 학생이다 출력)
		// 4. 학생의 정보를 삭제(삭제할 학생의 번호 입력한 번호와 일치하는 학생의 정보를 삭제 배열 마이너스 없으면 없는 학생이다 출력)
		// 5. 학생정보를 추가(학생의 정보 추가 배열 플러스)
		// 6. 프로그램 종료
		Scanner sc = new Scanner(System.in);
		boolean c = true;
		System.out.println("학생수를 입력하세요");
		int num = sc.nextInt();
		String [] a = new String[num];
		int [] b = new int [num];
		int [] kor = new int [num];
		int [] eng = new int [num];
		int [] math = new int [num];
		int [] total = new int [num];
		double [] avg = new double [num];
		for (int i = 0; i < a.length; i++) {
			System.out.println(i+1 + "번째 학생의 이름을 입력하세요");
			a[i] = sc.next();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " 학생의 번호를 입력하세요");
			b[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " 학생의 국어점수를 입력하세요");
			kor[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " 학생의 영어점수를 입력하세요");
			eng[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " 학생의 수학점수를 입력하세요");
			math[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			total[i] = kor[i] + eng[i] + math[i];
			System.out.println(a[i] + " 학생의 총점 : " + total[i]);
		}
		for (int i = 0; i < a.length; i++) {
			avg[i] = total[i] / 3.0;
			System.out.println(a[i] + " 학생의 평균 : " + avg[i]);
		}
		while (c) {
			System.out.println("2. 학생정보 조회, 3. 학생의 정보 검색, 4. 학생의 정보를 삭제, 5. 학생정보를 추가, 6. 프로그램 종료");
			int select = sc.nextInt();
			switch(select) {
			case 2:
				for(int i = 0; i < a.length; i++) {
					System.out.println(a[i] + "," + b[i] + "," + total[i] + "," + avg[i] );
				}
				break;
			case 3:
				System.out.println("검색할 학생의 번호를 입력하세요");
				int n = sc.nextInt();
				boolean flag = true;
				for(int i=0; i<a.length; i++) {
						if (b[i] == n) {
							System.out.println(a[i] + "," + b[i] + "," + kor[i] + "," + eng[i] + "," + math[i] + "," +  total[i] + "," + avg[i]);
							flag = !flag;
							break;
						}
					}
				if(flag) {
				System.out.println("해당 번호의 학생은 존재하지 않습니다");
				}
				break;
			case 4:	
					System.out.println("삭제할 학생 번호 입력");
					select = sc.nextInt();
					boolean flag1=false;
					String [] namesCopy = null; //학생 이름 배열
					int [] numsCopy = null;     //학생 번호 배열 
					int [] korsCopy = null;     //국어 점수 배열
					int [] engsCopy = null;     //수학 점수 배열
					int [] mathsCopy = null;    //영어 점수 배열
					int [] totalsCopy = null;    //총점 배열
					double [] avgsCopy = null;    //평균 배열
					int i=0;
					for(i=0;i<a.length;i++) {
						if(select == b[i]) {
							flag1=!flag1;
							break;
						}
					}
					
					
					if(flag1){
						namesCopy = new String [a.length-1];
						numsCopy = new int[namesCopy.length];
						korsCopy = new int[namesCopy.length];
						engsCopy = new int[namesCopy.length];
						mathsCopy = new int[namesCopy.length];
						totalsCopy = new int[namesCopy.length];
						avgsCopy = new double[namesCopy.length];
						int index=0;
						for(int j=0;j<a.length;j++) {
							if(j==i) {
								continue;
								
							}
							namesCopy[index]=a[j];
							numsCopy[index]=b[j];
							korsCopy[index]=kor[j];
							engsCopy[index]=eng[j];
							mathsCopy[index]=math[j];
							totalsCopy[index]=total[j];
							avgsCopy[index]=avg[j];
							index++;
						}
						
						a=namesCopy;
						b=numsCopy;
						kor=korsCopy;
						eng=engsCopy;
						math=mathsCopy;
						total=totalsCopy;
						avg=avgsCopy;
						
						
					}else {
						System.out.println("일치하는 학생 정보 없음");
					}
					System.out.println("====== 학생 삭제 끝 ======");
					break;
			case 5:
				String [] a1 = new String[a.length+1];
				int [] b1 = new int [a.length+1];
				int [] kor1 = new int [a.length+1];
				int [] eng1 = new int [a.length+1];
				int [] math1 = new int [a.length+1];
				int [] total1 = new int [a.length+1];
				double [] avg1 = new double [a.length+1];
				for(int j=0; j<a.length; j++) {
					a1[j] = a[j];
					b1[j] = b[j];
					kor1[j] = kor[j];
					eng1[j] = eng[j];
					math1[j] = math[j];
					total1[j] = total[j];
					avg1[j] = avg[j];
				}
				for (int j = a.length; j < a.length+1; j++) {
					System.out.println(j+1 + "번째 학생의 이름을 입력하세요");
					a1[j] = sc.next();
				}
				for (int j = a.length; j < a.length+1; j++) {
					System.out.println(a1[j] + " 학생의 번호를 입력하세요");
					b1[j] = sc.nextInt();
				}
				for (int j = a.length; j < a.length+1; j++) {
					System.out.println(a1[j] + " 학생의 국어점수를 입력하세요");
					kor1[j] = sc.nextInt();
				}
				for (int j = a.length; j < a.length+1; j++) {
					System.out.println(a1[j] + " 학생의 영어점수를 입력하세요");
					eng1[j] = sc.nextInt();
				}
				for (int j = a.length; j < a.length+1; j++) {
					System.out.println(a1[j] + " 학생의 수학점수를 입력하세요");
					math1[j] = sc.nextInt();
				}
				for (int j = a.length; j < a.length+1; j++) {
					total1[j] = kor1[j] + eng1[j] + math1[j];
					System.out.println(a1[j] + " 학생의 총점 : " + total1[j]);
				}
				for (int j = a.length; j < a.length+1; j++) {
					avg1[j] = total1[j] / 3.0;
					System.out.println(a1[j] + " 학생의 평균 : " + avg1[j]);
				}
				a = a1;
				b = b1;
				kor = kor1;
				eng = eng1;
				math = math1;
				total = total1;
				avg = avg1;
				System.out.println("추가되었습니다");
				break;
			case 6:
				System.out.println("종료되었습니다");
				c = false;
			}
		}
	}

}



/*package com.im.array;

import java.util.Scanner;

public class Array_ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check=true;
		
		String [] names = null; //학생 이름 배열
		int [] nums = null;     //학생 번호 배열 
		int [] kors = null;     //국어 점수 배열
		int [] engs = null;     //수학 점수 배열
		int [] maths = null;    //영어 점수 배열
		int [] totals = null;    //총점 배열
		double [] avgs = null;    //평균 배열
		while(check) {
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 조회");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 삭제");
			System.out.println("5. 학생 정보 추가");
			System.out.println("6. 프로 그램 종료");
			int select = sc.nextInt();
			if(select==1) {
				//1. 학생 정보 입력
				//   - 학생 수를 입력
				//	 - 이름, 번호, 국어, 영어, 수학 입력 후 계산 총점, 평균
				System.out.println("학생수 입력");
				select = sc.nextInt();
				names = new String [select];
				nums = new int[names.length];
				kors = new int[names.length];
				engs = new int[names.length];
				maths = new int[names.length];
				totals = new int[names.length];
				avgs = new double[names.length];
				
				for(int i=0;i<names.length;i++) {
					System.out.println(i+1+" 번째 학생 이름 입력");
					names[i]=sc.next();
					System.out.println(i+1+" 번째 학생 번호 입력");
					nums[i]=sc.nextInt();
					System.out.println(i+1+" 번째 학생 국어 입력");
					kors[i]=sc.nextInt();
					System.out.println(i+1+" 번째 학생 영어 입력");
					engs[i]=sc.nextInt();
					System.out.println(i+1+" 번째 학생 수학 입력");
					maths[i]=sc.nextInt();
					totals[i]=kors[i]+engs[i]+maths[i];
					avgs[i]=totals[i]/3.0;
				}//for 끝
				System.out.println("====== 입력 끝 ======");
			}else if(select==2) {
				//2. 학생 정보 조회
				//   - 모든 학생의 이름, 번호, 총점, 평균 출력
				if(names != null) {//
					System.out.println("Name\tNum\tTotal\tAvg");
					for(int i=0;i<names.length;i++) {
						System.out.println(names[i]+"\t"+nums[i]+"\t"+totals[i]+"\t"+avgs[i]);
					}
					System.out.println("====== 전체 출력 끝 ======");	
				}else {
					System.out.println("학생정보가 없습니다");
					System.out.println("====== 입력 끝 ======");
				}
				
			}else if(select==3) {
				//3. 학생 정보 검색
				//   - 검색할 학생의 번호를 입력	
				//   - 입력한 번호와 일치하는 학생의 모든 정보 출력
				//   - 일치하는 번호가 없으면 없는 학생이다 출력
				System.out.println("검색할 학생 번호 입력");
				select = sc.nextInt();
				boolean flag=false;
				for(int i=0;i<names.length;i++) {
					if(select == nums[i]) {
						System.out.println("Name\tNum\tKor\tEng\tMath\tTotal\tAvg");
						System.out.println(names[i]+"\t"+nums[i]+"\t"+kors[i]+"\t"+engs[i]+"\t"+maths[i]+"\t"+totals[i]+"\t"+avgs[i]);
						flag=!flag;
						break;
					}
				}
				
				if(flag) {
					System.out.println("일치하는 학생 정보 없음");
				}
				System.out.println("====== 검색 출력 끝 ======");
				
			}else if(select==4) {
				//4. 학생 정보 삭제
				//   - 삭제할 학생의 번호를 입력
				//   - 입력한 번호와 일치하는 학생의 정보 삭제(배열을 한칸 삭제)
				//   - 일치하는 번호가 없으면 없는 학생이다 출력	
				System.out.println("삭제할 학생 번호 입력");
				select = sc.nextInt();
				boolean flag=false;
				String [] namesCopy = null; //학생 이름 배열
				int [] numsCopy = null;     //학생 번호 배열 
				int [] korsCopy = null;     //국어 점수 배열
				int [] engsCopy = null;     //수학 점수 배열
				int [] mathsCopy = null;    //영어 점수 배열
				int [] totalsCopy = null;    //총점 배열
				double [] avgsCopy = null;    //평균 배열
				int i=0;
				for(i=0;i<names.length;i++) {
					if(select == nums[i]) {
						flag=!flag;
						break;
					}
				}
				
				if(flag){
					namesCopy = new String [names.length-1];
					numsCopy = new int[namesCopy.length];
					korsCopy = new int[namesCopy.length];
					engsCopy = new int[namesCopy.length];
					mathsCopy = new int[namesCopy.length];
					totalsCopy = new int[namesCopy.length];
					avgsCopy = new double[namesCopy.length];
					int index=0;
					for(int j=0;j<names.length;j++) {
						if(j==i) {
							//index--;
							continue;
							
						}
						namesCopy[index]=names[j];
						numsCopy[index]=nums[j];
						korsCopy[index]=kors[j];
						engsCopy[index]=engs[j];
						mathsCopy[index]=maths[j];
						totalsCopy[index]=totals[j];
						avgsCopy[index]=avgs[j];
						index++;
					}
					
					names=namesCopy;
					nums=numsCopy;
					kors=korsCopy;
					engs=engsCopy;
					maths=mathsCopy;
					totals=totalsCopy;
					avgs=avgsCopy;
					
					
				}else {
					System.out.println("일치하는 학생 정보 없음");
				}
				System.out.println("====== 학생 삭제 끝 ======");
				
			}else if(select==5) {
				//5. 학생 정보 추가
				//	 - 이름, 번호, 국어, 영어, 수학 입력 후 계산 총점, 평균 추가
				String [] namesCopy = new String [names.length+1]; //학생 이름 배열
				int [] numsCopy = new int [namesCopy.length];     //학생 번호 배열 
				int [] korsCopy = new int [namesCopy.length];     //국어 점수 배열
				int [] engsCopy = new int [namesCopy.length];     //수학 점수 배열
				int [] mathsCopy = new int [namesCopy.length];    //영어 점수 배열
				int [] totalsCopy = new int [namesCopy.length];    //총점 배열
				double [] avgsCopy = new double [namesCopy.length];    //평균 배열
				
				for(int i=0;i<names.length;i++) {
					namesCopy[i]=names[i];
					numsCopy[i]=nums[i];
					korsCopy[i]=kors[i];
					engsCopy[i]=engs[i];
					mathsCopy[i]=maths[i];
					totalsCopy[i]=totals[i];
					avgsCopy[i]=avgs[i];
				}
				
				System.out.println("추가 학생 이름 입력");
				namesCopy[names.length]=sc.next();
				System.out.println("추가 학생 번호 입력");
				numsCopy[names.length]=sc.nextInt();
				System.out.println("추가 학생 국어 입력");
				korsCopy[names.length]=sc.nextInt();
				System.out.println("추가 학생 영어 입력");
				engsCopy[names.length]=sc.nextInt();
				System.out.println("추가 번째 학생 수학 입력");
				mathsCopy[names.length]=sc.nextInt();
				totalsCopy[names.length]=korsCopy[names.length]+engsCopy[names.length]+mathsCopy[names.length];
				avgsCopy[names.length]=totalsCopy[names.length]/3.0;
				
				names=namesCopy;
				nums=numsCopy;
				kors=korsCopy;
				engs=engsCopy;
				maths=mathsCopy;
				totals=totalsCopy;
				avgs=avgsCopy;
				System.out.println("====== 학생 삭제 끝 ======");
				
			}else {
				break;
			}
		//학교 성적프로그램
		//1. 학생 정보 입력
		//   - 학생 수를 입력
		//	 - 이름, 번호, 국어, 영어, 수학 입력 후 계산 총점, 평균		
		//2. 학생 정보 조회
		//   - 모든 학생의 이름, 번호, 총점, 평균 출력
		//3. 학생 정보 검색
		//   - 검색할 학생의 번호를 입력	
		//   - 입력한 번호와 일치하는 학생의 모든 정보 출력
		//   - 일치하는 번호가 없으면 없는 학생이다 출력
		//4. 학생 정보 삭제
		//   - 삭제할 학생의 번호를 입력
		//   - 입력한 번호와 일치하는 학생의 정보 삭제(배열을 한칸 삭제)
		//   - 일치하는 번호가 없으면 없는 학생이다 출력		
		//5. 학생 정보 추가
		//	 - 이름, 번호, 국어, 영어, 수학 입력 후 계산 총점, 평균 추가	
		//6. 프로그램  종료
		}//while 끝

		
		System.out.println("프로그램을 종료 합니다");
	}
}
*/
