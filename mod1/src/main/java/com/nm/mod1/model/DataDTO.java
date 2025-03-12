package com.nm.mod1.model;

import java.util.List;

public class DataDTO {

    private String firstNameToSearch;
    private String lastNameToSearch;
    private String patient;
    private List<String> notesDTOs;
    //private NoteBean noteDTO;

    private String noteText;
    private String riskLevel;

    public DataDTO() {
    }

    public DataDTO(String firstNameToSearch, String lastNameToSearch, String patient,
                   List<String> notesDTOs, String noteText, String riskLevel) {
        this.firstNameToSearch = firstNameToSearch;
        this.lastNameToSearch = lastNameToSearch;
        this.patient = patient;
        this.notesDTOs = notesDTOs;
        this.noteText = noteText;
        this.riskLevel = riskLevel;
    }
}
