package org.flab.flab.client.kakao;

import lombok.Getter;
import lombok.Setter;
import org.flab.flab.client.core.FLabClientProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter()
@Setter()
@ConfigurationProperties("flab.client.kakao")
public class KakaoClientProperties extends FLabClientProperties {

}
