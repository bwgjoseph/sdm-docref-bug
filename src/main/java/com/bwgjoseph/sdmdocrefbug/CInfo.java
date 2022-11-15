package com.bwgjoseph.sdmdocrefbug;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@SuperBuilder(toBuilder = true)
@Document("cinfo")
public abstract class CInfo implements ReferenceAble {
    @Id
    private String id;
    private String cinfo;

    @Override
    public org.bson.Document toReference() {
        return new org.bson.Document("id", this.getId()).append("ref", "cinfo");
    }
}
