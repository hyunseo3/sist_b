public class BoardTest {
	 public String BoardTest(int a, int b) {
	        LocalDate date = LocalDate.of(2016, a, b);
	        DayOfWeek dayOfWeek = date.getDayOfWeek();
	        String result = dayOfWeek.toString();
		System.out.println("게시판 관리입니다.");
	        return result;
	    }
}
