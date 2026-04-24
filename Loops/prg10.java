public class prg10{
	public static void main(String args[]){
	int n=5;
	int row=1;
	int num=1;
	while(row<=n){
	int count=n-row+1;
	for(int i=0;i<count;i++){
	System.out.println(num++);
	if(i<count-1){
	System.out.println(" ");
	}
}
	System.out.println();
	row++;
}
}
}
