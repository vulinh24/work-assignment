package model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class TestModel {
    private Integer id;
    private Integer test;
}
