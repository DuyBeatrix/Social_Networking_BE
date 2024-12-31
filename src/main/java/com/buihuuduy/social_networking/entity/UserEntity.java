package com.buihuuduy.social_networking.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserEntity extends AuditingEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
}
