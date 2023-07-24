class LoginTest {

	public int isMember(String id, String pwd) {
		int re = -1;
		if(id.equals("tiger")){
			if(pwd.equals("1234")) re=1;
			else re=0;
		}
		return re;
	}
}
