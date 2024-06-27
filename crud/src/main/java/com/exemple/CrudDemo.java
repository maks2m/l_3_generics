package com.exemple;

import com.exemple.controller.CompanyShareController;
import com.exemple.controller.CompanyShareControllerImpl;
import com.exemple.dto.CompanyShareFullDto;
import com.exemple.model.ResponseModel;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class CrudDemo {
    public static void main(String[] args) {

        CompanyShareFullDto dto1 = CompanyShareFullDto.builder()
                .cost(BigDecimal.valueOf(150.10))
                .date(LocalDate.now().minusDays(1))
                .companyName("СБЕР")
                .companyCode("sber")
                .build();

        CompanyShareFullDto dto2 = CompanyShareFullDto.builder()
                .cost(BigDecimal.valueOf(265.56))
                .date(LocalDate.now().minusDays(1))
                .companyName("Газпром")
                .companyCode("gzpm")
                .build();

        CompanyShareController controller = new CompanyShareControllerImpl();

        controller.create(dto1);
        controller.create(dto2);

        ResponseModel<List<CompanyShareFullDto>> model = controller.findAll();
        System.out.println(model.getData().size());
        System.out.println(model.getData().get(0));
        System.out.println(model.getData().get(1));
    }
}
