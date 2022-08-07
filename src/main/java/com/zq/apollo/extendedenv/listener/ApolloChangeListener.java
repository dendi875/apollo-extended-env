package com.zq.apollo.extendedenv.listener;

import com.ctrip.framework.apollo.model.ConfigChange;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ApolloChangeListener {

    private static final Logger logger = LoggerFactory
            .getLogger(ApolloChangeListener.class);

    @ApolloConfigChangeListener
    public void  onChange(ConfigChangeEvent changeEvent) {
        logger.info("ApolloChangeListener onChange");

        for (String key : changeEvent.changedKeys()) {
            ConfigChange cc = changeEvent.getChange(key);
            logger.info("\t {}.{} from '{}' to '{}'", cc.getNamespace(),
                    cc.getPropertyName(), cc.getOldValue(), cc.getNewValue());
        }
    }

}