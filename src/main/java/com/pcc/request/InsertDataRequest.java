package com.pcc.request;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class InsertDataRequest {

    String ssoType;
    String systemId;
    String systemName;
    String systemTransactions;
    String systemPrivileges;
    String systemUserGroup;
    String systemLocationGroup;
    String userId;
    String userFullName;
    String userRdOfficeCode;
    String userOfficeCode;
    String clientLocation;
    String locationMachineNumber;
    String tokenId;

}
