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


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReportManager implements ReportProcessable {
    private Queue<String> queue = new LinkedList<>();

    @Override
    public void addReport(String report) {
        queue.offer(report);
    }

    @Override
    public String processNextReport() {
        return queue.poll();
    }

    @Override
    public boolean hasReports() {
        return !queue.isEmpty();
    }

    @Override
    public int getReportCount() {
        return queue.size();
    }

    @Override
    public List<String> readAllReports() {
        return new ArrayList<>(queue);
    }

    @Override
    public boolean updateReport(String oldReport, String newReport) {
        List<String> temp = new ArrayList<>(queue);
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i).equals(oldReport)) {
                temp.set(i, newReport);
                queue.clear();
                queue.addAll(temp);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteReport(String report) {
        return queue.remove(report);
    }
}


