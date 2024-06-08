package z5classicalExample;

import java.io.File;
import java.io.FileFilter;

public class z6ShowHiddenFiles {

//	FileFilter fileFilter;
	
	public static void main(String[] args) {
		
		File[] hiddenFiles = new File("C://Users//LENOVO//Desktop")
				.listFiles(new FileFilter() {
				
					public boolean accept(File fileStatus) {
						return fileStatus.isHidden();
					}
				});
		for (File file : hiddenFiles) {
			System.out.println(file.getName());
		}
		// foreach loop will fetch data from hiddenfiles
	}
}

// Console Output:
// desktop.ini
// Yfile.txt
