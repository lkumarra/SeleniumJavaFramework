package com.guru99demobank.utilities;

import java.io.File;

import org.zeroturnaround.zip.NameMapper;
import org.zeroturnaround.zip.ZipUtil;

public class FileUtilities {

	/**
	 * Zipped all execution artifacts into one directory after execution.
	 * 
	 * @param srcPath  : Path of socurce directory.
	 * @param destPath : Path of destination directory.
	 */
	public static synchronized void zipAllExecutionArtifacts(String srcPath, String destPath) {
		ZipUtil.pack(new File(srcPath), new File(destPath), new NameMapper() {
			public String map(String name) {
				return "foo/" + name;
			}
		});
	}

	/**
	 * Moves files from one source to another.
	 * 
	 * @param srcPath  : Path of source directory.
	 * @param destPath : Path of destination directory.
	 */
	public static synchronized void moveAllFiles(String srcPath, String destPath) {
		File file = new File(srcPath);

		// renaming the file and moving it to a new location
		if (file.renameTo(new File(destPath))) {
			// if file copied successfully then delete the original file
			//file.delete();
			System.out.println("File moved successfully");
		} else {
			System.out.println("Failed to move the file");
		}
	}
	
	/**
	 * Moves files from one source to another.
	 * 
	 * @param srcPath  : Path of source directory.
	 * @param destPath : Path of destination directory.
	 */
	public static synchronized void deleteFile(String destPath) {
		File file = new File(destPath);
	    file.delete();
	}

}
