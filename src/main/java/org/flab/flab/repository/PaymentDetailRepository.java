package org.flab.flab.repository;

import org.flab.flab.domain.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentDetailRepository  extends JpaRepository<PaymentMethod, Long> {
}
