package com.fdmgroup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterSyntaxExample {

	public void writeLineToFile(String line) {
		String filename = "example.text";
		try {
			Writer writer = new FileWriter(filename, true);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write(line);
			bufferedWriter.newLine();
			bufferedWriter.close();
			
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();

			
		}

	}

}
