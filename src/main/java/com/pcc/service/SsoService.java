package com.pcc.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.pcc.model.Sso;
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

    public Sso InsertData(InsertDataRequest insertDataRequest) {

        Sso sso = Sso
                .builder()
                .requestDate(new Date())
                .ssoType(insertDataRequest.getSsoType())
                .systemId(insertDataRequest.getSystemId())
                .systemName(insertDataRequest.getSystemName())
                .systemTransactions(insertDataRequest.getSystemTransactions())
                .systemPrivileges(insertDataRequest.getSystemPrivileges())
                .systemUserGroup(insertDataRequest.getSystemUserGroup())
                .systemLocationGroup(insertDataRequest.getSystemLocationGroup())
                .userId(insertDataRequest.getUserId())
                .userFullName(insertDataRequest.getUserFullName())
                .userRdOfficeCode(insertDataRequest.getUserRdOfficeCode())
                .userOfficeCode(insertDataRequest.getUserOfficeCode())
                .clientLocation(insertDataRequest.getClientLocation())
                .locationMachineNumber(insertDataRequest.getLocationMachineNumber())
                .tokenId(insertDataRequest.getTokenId())
                .build();

        return ssoRepository.save(sso);
    }

}
