package org.example;

import java.util.List;

public class Main {

    
    public static void main(String[] args) {
        FileService<Company> companyFileService = new FileService<>();

        // đọc dữ liệu từ file
        List<Company> companies = companyFileService.readFile("C:\\Users\\quoch\\Desktop\\Workspace\\LabJava\\Lab15\\lab15x3\\src\\main\\java\\org\\example\\company.dat");
        System.out.println("List company in file: ");
        companyFileService.printList(companies);

        Company shoppe = new Company("Shoppe", "admin@shoppe.com", "0123456789",
                "5 Science Park Drive, Shopee Building", "118265", "Singapore");
        companies.add(shoppe);

        // ghi dữ liệu vào file
        companyFileService.writeFile("company.dat", companies);

        companies = companyFileService.readFile("company.dat");
        System.out.println("List company in file: ");
        companyFileService.printList(companies);

    }
}