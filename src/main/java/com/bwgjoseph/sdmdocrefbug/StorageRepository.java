package com.bwgjoseph.sdmdocrefbug;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StorageRepository extends MongoRepository<Storage, String> {

}
