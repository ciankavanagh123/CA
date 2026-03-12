/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biodiversityapp;

/**
 *
 * @author adamk
 */
public class GreenSpaceRecord extends BiodiversityRecord{
    private String type;
    private double area;
    public GreenSpaceRecord(String id, String name, String location, String observer,
                            String type, double area) {
        super(id, name, location, observer);
        this.type = type;
        this.area = area;
    }
    @Override
    public String getRecordType() { return "Green Space"; }
}
