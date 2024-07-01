package com.exemple;

import com.exemple.controller.CompanyShareController;
import com.exemple.controller.CompanyShareControllerImpl;
import com.exemple.entity.CompanyShare;
import com.exemple.model.ResponseModel;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CrudGenericsDemo {
    public static void main(String[] args) {
        CompanyShare companyShare = CompanyShare.builder()
                .companyName("ัมละ")
                .ticker("sbr")
                .cost(BigDecimal.valueOf(300))
                .date(LocalDateTime.now().minusDays(1))
                .build();

        CompanyShareController controller = new CompanyShareControllerImpl();
        ResponseModel<CompanyShare> companyShareResponseModel = controller.create(companyShare);
        System.out.println(companyShareResponseModel.getData());
        System.out.println(companyShareResponseModel.getCreateDate());

    }
}
