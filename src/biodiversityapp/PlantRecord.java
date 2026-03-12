/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biodiversityapp;

/**
 *
 * @author adamk
 */
public class PlantRecord extends BiodiversityRecord{
    private String species, flowerColor;
    public PlantRecord(String id, String name, String location, String observer,
                       String species, String flowerColor) {
        super(id, name, location, observer);
        this.species = species;
        this.flowerColor = flowerColor;
    }
    @Override
    public String getRecordType() { return "Plant"; }
}
