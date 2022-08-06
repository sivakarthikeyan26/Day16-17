package day17;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;



public class Binary_search {

	public static void main(String[] args) throws FileNotFoundException {
		String line;
		Binary_func tree=new Binary_func();

		try (
		    InputStream fis = new FileInputStream("D:\\Bridge\\test.txt");
		    InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
		    BufferedReader br = new BufferedReader(isr);
		) {
		    while ((line = br.readLine()) != null) {
		        String[] words = line.split(" ");
		        System.out.println(words.length);
		        for (int i=0; i<words.length;i++) {
		        	System.out.println(words[i]);
		        	tree.insert(words[i]);
		        }
		    }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        tree.inorder();
        tree.searchNode(tree.root,"is");

	}

}
