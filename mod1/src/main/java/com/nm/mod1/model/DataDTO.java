package com.nm.mod1.model;

import java.util.List;

public class DataDTO {

    private String firstName;
    private String lastNameToSearch;
    private int patient;
    private List<String> notesDTOs;
    //private NoteBean noteDTO;

    private String noteText;
    private String riskLevel;



    public DataDTO(String firstName, String lastNameToSearch, int patient,
                   List<String> notesDTOs, String noteText, String riskLevel) {
        this.firstName = firstName;
        this.lastNameToSearch = lastNameToSearch;
        this.patient = patient;
        this.notesDTOs = notesDTOs;
        this.noteText = noteText;
        this.riskLevel = riskLevel;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNameToSearch() {
        return lastNameToSearch;
    }

    public void setLastNameToSearch(String lastNameToSearch) {
        this.lastNameToSearch = lastNameToSearch;
    }

    public int getPatient() {
        return patient;
    }

    public void setPatient(int patient) {
        this.patient = patient;
    }
}
