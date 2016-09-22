package programming;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hi how are u doing";
String[] words=s.split(" ");
String replace="what";
for(int i=0;i<words.length;i++){
	String word=words[i];
	if(word=="are"){
	s.replaceAll(word, replace);
	break;
}
	
}
System.out.println(s);

	}

}
