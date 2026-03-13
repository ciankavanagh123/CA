/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biodiversityapp;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author adamk
 */


public class ReportManager implements ReportProcessable {
    private Queue<String> queue = new LinkedList<>();

    @Override
    public void addReport(String report) { queue.offer(report); }

    @Override
    public String processNextReport() { return queue.poll(); }

    @Override
    public boolean hasReports() { return !queue.isEmpty(); }

    @Override
    public int getReportCount() { return queue.size(); }
}


