package z38ShowHideFilesUsingJava8;

import java.io.File;
import java.io.FileFilter;

public class ShowHiddenFilesUsingJava8 {

	FileFilter fileFilter;
	
	public static void beforeJava8() {

		File[] hiddenFiles = new File("C://Users//LENOVO//Desktop")
				.listFiles(new FileFilter() {

					public boolean accept(File fileStatus) {
						return fileStatus.isHidden();
					}
				});
		for (File file : hiddenFiles) {
			System.out.println(file.getName());
		}
	}
	
	public static void usingMethodRef() {
		File[] hiddenFiles = new File("C://Users//LENOVO//Desktop")
				.listFiles(File::isHidden);
		for (File file : hiddenFiles) {
			System.out.println(file.getName());
		}
	}
	
	public static void main(String[] args) {
//		beforeJava8();
		usingMethodRef();
	}
}