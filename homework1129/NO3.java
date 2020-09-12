package homework1129;

public class NO3 {
	public static void main(String[] args) {
		int allsec = 256559 ;
		
		System.out.println(allsec/86400+"天" + (allsec%86400)/3600+"時"+(((allsec%86400)%3600))/60+"分" +((((allsec%86400)%3600))%60)/60+"秒" );
		;
		
	}

}
