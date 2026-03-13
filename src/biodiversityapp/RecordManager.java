/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biodiversityapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adamk
 */

public class RecordManager implements Manageable<BiodiversityRecord> {
    private ArrayList<BiodiversityRecord> records = new ArrayList<>();

    @Override
    public void create(BiodiversityRecord record) { records.add(record); }

    @Override
    public BiodiversityRecord read(String id) {
        for (BiodiversityRecord r : records)
            if (r.getId().equals(id))
                return r;
        return null;
    }

    @Override
    public boolean update(String id, BiodiversityRecord item) {
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getId().equals(id)) {
                records.set(i, item);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(String id) {
        return records.removeIf(r -> r.getId().equals(id));
    }

    @Override
    public List<BiodiversityRecord> readAll() {
        return new ArrayList<>(records);
    }

    public List<BiodiversityRecord> searchByLocation(String keyword) {
        List<BiodiversityRecord> list = new ArrayList<>();
        for (BiodiversityRecord r : records)
            if (r.getLocation().toLowerCase().contains(keyword.toLowerCase()))
                list.add(r);
        return list;
    }
}


