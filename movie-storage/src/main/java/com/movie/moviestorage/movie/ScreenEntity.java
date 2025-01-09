package com.movie.moviestorage.movie;

import com.movie.moviestorage.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "screen")
public class ScreenEntity extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long theaterId;

    @Column(columnDefinition = "VARCHAR(10) NOT NULL COMMENT '싱영관 명'")
    private String name;

}
