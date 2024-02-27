package com.pcc.request;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class InsertDataRequest {

    String requestDate;
    String systemtype;
    String systemid;
    String systemname;
    String systemtransactions;
    String systemprivileges;
    String systemusergroup;
    String systemlocationgroup;
    String userid;
    String userfullname;
    String userrdofficecode;
    String userofficecode;
    String clientlocation;
    String locationmachinenumber;
    String tokenid;

}
