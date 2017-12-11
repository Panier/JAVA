import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.EmptyStackException;

import javax.imageio.IIOException;


public class Main {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		PrintWriter o=null;
		int SIZE=0;
		try{
			o = new PrintWriter(new FileWriter("e.txt"));
			
			for(int i=0;i<=SIZE;i++){
				System.out.println("i");
			}
			if(SIZE == 0)
			{
				throw new EmptyStackException();
			}
		}catch(IIOException e){
			System.out.println("Got IandO");
		}catch(IndexOutOfBoundsException e){
			System.out.println("Got IofBE");
		}catch(NullPointerException e){
			System.out.println("Got NPE");
		}catch(Exception e){
			System.out.println("Got Exce");
		}finally{
			if(o!= null)
				o.close();
		}
		

	}

}
