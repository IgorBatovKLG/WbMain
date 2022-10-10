package ru.batov.wbmain.models.wbJsons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductSkillet {
    private String id;
    private String name;
    private String salePriceU;
    private String subjectId;
    private String feedbacks;
    private String rating;
    private String brandId;
    private String pics;
}
