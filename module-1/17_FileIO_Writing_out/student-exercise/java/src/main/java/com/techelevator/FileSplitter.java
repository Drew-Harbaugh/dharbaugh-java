package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileSplitter {

	public static void main(String[] args) {
		try (Scanner userInput = new Scanner(System.in)) {
			System.out.print("Where is the input file (please include the path to the file)? ");
			String filePath = userInput.nextLine();
			try {
				File readingFile = pathFile(filePath);
				System.out.print("How many lines of text (max) should there be in the split files? ");
				int lines = 0;
				boolean value = false;
				while (!value) {
					try {
						lines = userInput.nextInt();
						if (lines > 0) {
							value = true;
						}
					} catch (InputMismatchException ex) {
						System.out.println("That was not a valid number. Try again.");
					} finally {
						userInput.nextLine();
					}
				}
				try (Scanner fileInput = new Scanner(readingFile)) {
					int fileCount = 1;
					while (fileInput.hasNextLine()) {
						String splitFileName = getNextFileName(readingFile, fileCount);
						File outputFile = new File(readingFile.getParentFile(), splitFileName);
						try (PrintWriter fileOutput = new PrintWriter(outputFile)) {
							for (int i = 0; i < lines; i++) {
								if (fileInput.hasNextLine()) {
									fileOutput.println(fileInput.nextLine());
								} else {
									break;
								}
							}
						}
						fileCount++;
					}
				}
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
				System.exit(1);
			}
		}
	}

	private static File pathFile(String filePath) throws IOException {
		File fileResult = new File(filePath);
		if (!fileResult.exists()) {
			throw new FileNotFoundException("There was no file at " + filePath);
		}
		if (!fileResult.isFile()) {
			throw new IOException(filePath + " is not a file.");
		}
		return fileResult;
	}

	private static String getNextFileName(File inputFile, int count) {
		String fileName = inputFile.getName();
		String extension = fileName.substring(fileName.lastIndexOf('.'));
		String name = fileName.substring(0, fileName.lastIndexOf('.'));

		return name + "-" + count + extension;
	}

}