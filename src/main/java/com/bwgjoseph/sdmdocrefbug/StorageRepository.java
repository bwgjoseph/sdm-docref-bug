package com.bwgjoseph.sdmdocrefbug;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StorageRepository extends MongoRepository<Storage, String> {

}
