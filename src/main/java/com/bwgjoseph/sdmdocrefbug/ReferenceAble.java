package com.bwgjoseph.sdmdocrefbug;

import org.bson.Document;

@FunctionalInterface
public interface ReferenceAble {
    Document toReference();
}
