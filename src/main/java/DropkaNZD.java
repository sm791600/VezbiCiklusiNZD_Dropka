/*Напиши програма каде пто корисникот внесува броител и именител на една
дропка што тој ја замислил. Програмата треба да пресметува НЗД на броителот и
именителот и соодветно да изврши кратење на дропката. На екран да се испечати
НЗД на броевите и скратената дропка.*/
import java.util.Scanner;
public class DropkaNZD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int br, im, nzd=2;
		Scanner vnes = new Scanner(System.in);
		System.out.println("Vnesi broitel");
		br = vnes.nextInt();
		System.out.println("Vnesi imenitel");
		im = vnes.nextInt();
		System.out.println("Dropkata e "+br+"/"+im);
		int br2=br,im2=im;
		while(br!=im) {
			if(br>im) 
				br-=im;
			else im-=br;
		}
		nzd=br;
		
	
		System.out.println("NZD e "+nzd+" i skratenata dropka e "+br2/nzd+"/"+im2/nzd);
	}

}
