package ru.batov.wbmain.models.wbJsons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Products {
    List<ProductSkillet> products;

}
