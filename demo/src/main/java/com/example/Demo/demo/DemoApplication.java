package com.example.Demo.demo;

import com.aspose.cells.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		try {
			// Load the XML file
			Workbook workbook = new Workbook("input.xml");

           File output = new File("output.xlsx");
		   output.createNewFile();
			// Save the output Excel file
			workbook.save("output.xlsx", SaveFormat.XLSX);

			System.out.println("XML file has been converted to Excel successfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}