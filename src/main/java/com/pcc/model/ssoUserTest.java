package com.pcc.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
public class ssoUserTest {

    @Id
    private Date requestDate;
    private String ssotype;
    private String systemid;
    private String systemname;
    private String systemtransactions;
    private String systemprivileges;
    private String systemusergroup;
    private String systemlocationgroup;
    private String userid;
    private String userfullname;
    private String userrdofficecode;
    private String userofficecode;
    private String clientlocation;
    private String locationmachinenumber;
    private String tokenid;

}
