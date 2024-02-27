package com.pcc.service;

import org.springframework.stereotype.Service;

import com.pcc.model.Sso;
import com.pcc.request.InsertDataRequest;
import com.pcc.repository.SsoRepository;

import jakarta.persistence.EntityManager;
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
                .requestDate(insertDataRequest.getRequestDate())
                .systemtype(insertDataRequest.getSystemtype())
                .systemid(insertDataRequest.getSystemid())
                .systemname(insertDataRequest.getSystemname())
                .systemtransactions(insertDataRequest.getSystemtransactions())
                .systemprivileges(insertDataRequest.getSystemprivileges())
                .systemusergroup(insertDataRequest.getSystemusergroup())
                .systemlocationgroup(insertDataRequest.getSystemlocationgroup())
                .userid(insertDataRequest.getUserid())
                .userfullname(insertDataRequest.getUserfullname())
                .userrdofficecode(insertDataRequest.getUserrdofficecode())
                .userofficecode(insertDataRequest.getUserofficecode())
                .clientlocation(insertDataRequest.getClientlocation())
                .locationmachinenumber(insertDataRequest.getLocationmachinenumber())
                .tokenid(insertDataRequest.getTokenid())
                .build();

        return ssoRepository.save(sso);
    }

}
