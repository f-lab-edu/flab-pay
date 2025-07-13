package org.flab.flab.service;

import org.flab.flab.service.dto.PayReadyRequest;
import org.flab.flab.service.dto.PayReadyResponse;

public interface PayClient {

    PayReadyResponse payReady(PayReadyRequest request);

}



// PayReady, PayApproval