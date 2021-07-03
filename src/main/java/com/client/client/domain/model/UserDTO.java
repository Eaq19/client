package com.client.client.domain.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "userTable")
public class UserDTO {

    @Id
    @Column
    private long id;
    @Column
    private String name;
    @Column
    private String userName;

}
