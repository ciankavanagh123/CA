/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biodiversityapp;

/**
 *
 * @author adamk
 */
public class AnimalRecord extends BiodiversityRecord {
    private String species, habitat;
    public AnimalRecord(String id, String name, String location, String observer,
                        String species, String habitat) {
        super(id, name, location, observer);
        this.species = species;
        this.habitat = habitat;
    }
    @Override
    public String getRecordType() { return "Animal"; }
}
