/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biodiversityapp;

/**
 *
 * @author adamk
 */
public interface ReportProcessable {
    void addReport(String report);
    String processNextReport();
    boolean hasReports();
    int getReportCount();
}
