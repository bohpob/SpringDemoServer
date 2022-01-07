package cz.cvut.fit.tjv.poberboh.server.dto;

import java.util.List;

public class OwnerDTO {

    private String username;
    private String firstname;
    private String lastname;
    private List<StartupDTO> startupList;

    public OwnerDTO(String firstname, String lastname, List<StartupDTO> startupList) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.startupList = startupList;
    }

    public OwnerDTO(String username, String firstname, String lastname, List<StartupDTO> startupList) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.startupList = startupList;
    }

    public OwnerDTO() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<StartupDTO> getStartupList() {
        return startupList;
    }

    public void setStartupList(List<StartupDTO> startupList) {
        this.startupList = startupList;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
