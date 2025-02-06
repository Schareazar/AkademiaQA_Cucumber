package pl.akademiaqa.cucumber.transformers;

import io.cucumber.java.DataTableType;
import pl.akademiaqa.dto.AccountDTO;

import java.math.BigDecimal;
import java.util.Map;

public class AccountDataTable {

    @DataTableType
    public AccountDTO transform(Map<String,String> dataTable){
        return new AccountDTO(dataTable.get("account"), new BigDecimal(dataTable.get("balance")));
    }

}
