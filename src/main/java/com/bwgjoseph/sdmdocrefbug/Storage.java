package com.bwgjoseph.sdmdocrefbug;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder(toBuilder = true)
@TypeAlias("storage")
@Document("storage")
public class Storage {
    @Id
    private String id;
    private String name;
    @DocumentReference(lookup = "{ '_id' : new ObjectId('?#{id}') }", collection = "?#{ref}", lazy = true)
    private ReferenceAble cInfo;
}
