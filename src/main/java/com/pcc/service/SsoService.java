package com.pcc.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.pcc.model.ssoUserTest;
import com.pcc.request.InsertDataRequest;
import com.pcc.repository.SsoRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class SsoService {

    private final SsoRepository ssoRepository;

    public SsoService(SsoRepository ssorepository) {
        this.ssoRepository = ssorepository;
    }

    public ssoUserTest InsertData(InsertDataRequest insertDataRequest) {

        ssoUserTest sso = ssoUserTest
                .builder()
                .requestDate(new Date())
                .ssotype(insertDataRequest.getSsoType())
                .systemid(insertDataRequest.getSystemId())
                .systemname(insertDataRequest.getSystemName())
                .systemtransactions(insertDataRequest.getSystemTransactions())
                .systemprivileges(insertDataRequest.getSystemPrivileges())
                .systemusergroup(insertDataRequest.getSystemUserGroup())
                .systemlocationgroup(insertDataRequest.getSystemLocationGroup())
                .userid(insertDataRequest.getUserId())
                .userfullname(insertDataRequest.getUserFullName())
                .userrdofficecode(insertDataRequest.getUserRdOfficeCode())
                .userofficecode(insertDataRequest.getUserOfficeCode())
                .clientlocation(insertDataRequest.getClientLocation())
                .locationmachinenumber(insertDataRequest.getLocationMachineNumber())
                .tokenid(insertDataRequest.getTokenId())
                .build();

        return ssoRepository.save(sso);
    }

}
