package com.bwgjoseph.sdmdocrefbug;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CInfoRepository extends MongoRepository<CInfo, String> {

}
