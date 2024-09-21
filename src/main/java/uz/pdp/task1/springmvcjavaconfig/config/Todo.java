package uz.pdp.task1.springmvcjavaconfig.config;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Todo {
    private Integer id;
    private String name;
}
