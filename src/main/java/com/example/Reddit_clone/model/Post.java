package com.example.Reddit_clone.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.lang.Nullable;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;


@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @javax.persistence.Id
    @GeneratedValue(strategy = IDENTITY)
    private  Long postId;

   // @NotBlank(message='Post Name cannot be empty')
    private String postName;

    @Nullable
    private String url;

    @Nullable
    @Lob
    private String description;
    private Integer voteCount;

    @ManyToOne(fetch = FetchType.LAZY )
    @JoinColumn(name="id",referencedColumnName = "id")
    private  Subreddit subreddit;


}
