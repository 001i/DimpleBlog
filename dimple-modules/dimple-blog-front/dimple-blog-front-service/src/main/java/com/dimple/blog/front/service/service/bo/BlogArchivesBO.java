package com.dimple.blog.front.service.service.bo;

import lombok.Data;

import java.util.List;

/**
 * ArchivesVO
 *
 * @author Dimple
 * @date 2/28/2023 11:07 AM
 */
@Data
public class BlogArchivesBO {
    private Long count;

    private String dateStr;

    List<BlogArchiveItemBO> items;
}
