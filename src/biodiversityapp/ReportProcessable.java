/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biodiversityapp;

/**
 *
 * @author adamk
 */


import java.util.List;

public interface ReportProcessable {
    void addReport(String report);
    String processNextReport();
    boolean hasReports();
    int getReportCount();

    List<String> readAllReports();
    boolean updateReport(String oldReport, String newReport);
    boolean deleteReport(String report);
}
       
