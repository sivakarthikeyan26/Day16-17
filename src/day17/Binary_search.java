package day17;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;



public class Binary_search {

	public static void main(String[] args) throws IOException {
		String line;
		Binary_func tree=new Binary_func();

		try (
		    InputStream fis = new FileInputStream("the_file_name");
		    InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
		    BufferedReader br = new BufferedReader(isr);
		) {
		    while ((line = br.readLine()) != null) {
		        String[] words = line.split(" ");
		        for (int i=0; i<words.length;i++) {
		        	tree.insert(words[i]);
		        }
		    }
		}
        
        
        tree.inorder();
        tree.searchNode(tree.root,"was");

	}

}
