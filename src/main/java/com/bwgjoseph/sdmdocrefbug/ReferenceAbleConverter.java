package com.bwgjoseph.sdmdocrefbug;

import org.bson.Document;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.WritingConverter;
import org.springframework.data.mongodb.core.mapping.DocumentPointer;

@WritingConverter
public class ReferenceAbleConverter implements Converter<ReferenceAble, DocumentPointer<Document>> {

    @Override
    public DocumentPointer<Document> convert(ReferenceAble source) {
        return source::toReference;
    }

}
