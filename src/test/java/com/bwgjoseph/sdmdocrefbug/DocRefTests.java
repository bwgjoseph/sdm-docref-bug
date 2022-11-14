package com.bwgjoseph.sdmdocrefbug;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@DataMongoTest(excludeAutoConfiguration = EmbeddedMongoAutoConfiguration.class)
// @Import(MongoConfig.class)
public class DocRefTests {
    @Autowired
    private CInfoRepository cInfoRepository;

    @Test
    void test1() {
        CInfo cInfo = CInfo.builder().cinfo("cinfo").build();
        CInfo createdCInfo = this.cInfoRepository.insert(cInfo);

        log.info("{}", createdCInfo);
    }
}
