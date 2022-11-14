package com.bwgjoseph.sdmdocrefbug;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

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
@TypeAlias("cinfo")
@Document("cinfo")
public class CInfo implements ReferenceAble {
    @Id
    private String id;
    private String cinfo;

    @Override
    public org.bson.Document toReference() {
        return new org.bson.Document("id", this.getId()).append("ref", "cinfo");
    }
}
