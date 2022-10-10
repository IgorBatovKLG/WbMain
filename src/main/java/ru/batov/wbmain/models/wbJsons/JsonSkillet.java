package ru.batov.wbmain.models.wbJsons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JsonSkillet {
    private String state;
    private String version;
    private Products data;
}
