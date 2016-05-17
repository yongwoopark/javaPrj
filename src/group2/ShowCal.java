package group2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ShowCal extends GregorianCalendar{
	private int width;
	private String[] calDate;
	private int startDay;
	private int lastDay;
	private int syear;
	private int smonth;
	private int sday;
	private int today;

	public ShowCal() {
		calDate = new String[50];
		width = 7;
		sday = 1;
	}
	
	public void makeCal() {
		syear = get(Calendar.YEAR);
		smonth = get(Calendar.MONTH)+1; /// month 출력 확인하기 지금 은 2월 달로 나옴
		today = get(Calendar.DAY_OF_MONTH);
		try {
			this.makeCal(syear, smonth, today);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void makeCal(int Y, int M) throws Exception {
		this.makeCal(Y, M, 0);
	}

	public void makeCal(int Y, int M, int D) throws Exception {
		if (M < 1 || M > 12 || D<0 || D>32) {
			System.out.println("입력에러");
			throw new Exception();
		} else {
				set(Calendar.YEAR, Y);
	            set(Calendar.MONTH, M-1);
	            set(Calendar.DATE, 1);
	            startDay = get(Calendar.DAY_OF_WEEK); // 월 시작 요일 
	            lastDay = getActualMaximum(Calendar.DATE); // 월 마지막 날짜
	            // 2차 배열에 날짜 입력
	            for(int i=0; sday<=lastDay; i++){
	                if(i+1<startDay) 
	                	calDate[i]=""; // 시작 요일이 오기전에는 공백 대입
	                else{
	                    // 날짜 배열에 입력
	                    calDate[i]=Integer.toString(sday);
	                    sday++;
	                }      
	            }
	           
		}
		sday =1;
		printCal(Y,M,D);
	}
	
	public void printCal(int Y,int M , int D) {
		System.out.println("─────────────────────────────────────────");
		System.out.println("\t\t\t\t\t\t<Q's Calendar>");
		System.out.println("─────────────────────────────────────────");
		System.out.println("\t\t\t\t\t\t<"+Y+"년"+M+"월>");
		System.out.println("─────────────────────────────────────────");
		System.out.print("\t일\t\t월\t\t화\t\t수\t\t목\t\t금\t\t토\n");
	
		for (int j = 0; j < lastDay + startDay; j++) {		
			
			if(calDate[j]==null)
				break;
			else if(calDate[j].compareTo(Integer.toString(D))==0 && D!=0)
			{				
				System.out.print("\t"+"("+calDate[j]+")" + "\t");
			}
			else
				System.out.print("\t"+calDate[j] + "\t");

			if ( j % width == width - 1) {
				System.out.println();
			}
		}
		System.out.println("\n─────────────────────────────────────────");
	}
}
