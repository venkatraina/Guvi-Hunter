public class Encryption {
	public static String output1;
	public static void main(String[] args) {
		userMethod("Vennila");
		System.out.println(output1);
	}
	public static void userMethod( String input1 ) {
		String str=input1;
		String result="";		
		String s=str.toLowerCase();
		int key=(int)(s.charAt(s.length()-1))-96;
		for(int i=0;i<str.length()-1;i++){
			char ch=s.charAt(i);
			int c=(int)ch-96; 
		 int h=(c-key);                                  
			if(h<=0){
				h+=26;
			}			
			char sh=(char)(h+96);
			char r;
			if(Character.isUpperCase(str.charAt(i))){
				r=Character.toUpperCase(sh);
			}else{
				r=Character.toLowerCase(sh);
			}result+=r;
		}
		result+=(str.charAt(str.length()-1));		
		output1=result;
		}
}
