package com.dimple.blog.service.entity;

import com.dimple.common.core.web.entity.BaseEntity;
import lombok.Data;

/**
 * BlogLink
 *
 * @author Dimple
 * @date 3/10/2023 11:26 AM
 */
@Data
public class BlogLink extends BaseEntity {
    private Long id;
    private String title;
    private String headerImage;
    private String description;
    private String url;
    private Integer linkStatus;
    private Long visitCount;
    private String email;

    private String emailContent;
}
