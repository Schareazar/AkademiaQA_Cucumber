package pl.akademiaqa.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Getter
@RequiredArgsConstructor
public class AccountDTO {
    private final String accountName;
    private final BigDecimal accountBalance;


}
