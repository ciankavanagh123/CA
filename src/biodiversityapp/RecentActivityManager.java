/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biodiversityapp;

import java.util.Stack;

/**
 *
 * @author adamk
 */


public class RecentActivityManager implements RecentActivity<BiodiversityRecord> {
    private Stack<BiodiversityRecord> stack = new Stack<>();

    @Override
    public void pushActivity(BiodiversityRecord record) { stack.push(record); }

    @Override
    public BiodiversityRecord popActivity() {
        return stack.isEmpty() ? null : stack.pop();
    }

    @Override
    public boolean hasActivity() { return !stack.isEmpty(); }

    @Override
    public int getActivityCount() { return stack.size(); }
}


