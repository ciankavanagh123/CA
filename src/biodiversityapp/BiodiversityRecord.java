/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biodiversityapp;
import java.util.Date;
/**
 *
 * @author adamk
 */
public abstract class BiodiversityRecord {
    protected String id;
    protected String name;
    protected String location;
    protected String observer;
    protected Date dateRecorded;
    public BiodiversityRecord(String id, String name, String location, String observer) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.observer = observer;
        this.dateRecorded = new Date();
    }
    public abstract String getRecordType();
    public String getId() { return id; }
    public String getName() { return name; }
    public String getLocation() { return location; }
    public String getObserver() { return observer; }
    public Date getDateRecorded() { return dateRecorded; }
    public void setName(String n) { name = n; }
    public void setLocation(String l) { location = l; }
    @Override
    public String toString() {
        return getRecordType() + ": " + name + " at " + location;
    }
}

