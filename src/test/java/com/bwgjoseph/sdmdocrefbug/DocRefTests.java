package com.bwgjoseph.sdmdocrefbug;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.context.annotation.Import;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@DataMongoTest(excludeAutoConfiguration = EmbeddedMongoAutoConfiguration.class)
@Import(MongoConfig.class)
public class DocRefTests {
    @Autowired
    private CInfoRepository cInfoRepository;
    @Autowired
    private StorageRepository storageRepository;

    @Test
    void test1() {
        CInfo cInfo = SubCInfo.builder().cinfo("cinfo").subCInfo("subcinfo").build();
        CInfo createdCInfo = this.cInfoRepository.insert(cInfo);

        log.info("{}", createdCInfo);

        Storage storage = Storage.builder().name("StorageName").cInfo(createdCInfo).build();
        Storage createdStorage = this.storageRepository.insert(storage);

        log.info("{}", createdStorage);
        log.info("{}", createdStorage.getCInfo());

        Storage findStorage = this.storageRepository.findById(createdStorage.getId()).get();

        log.info("{}", findStorage);
        log.info("{}", findStorage.getCInfo());
    }
}
