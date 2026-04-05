package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.model.TopicConfiguration;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers;
import com.amazonaws.transform.StaxUnmarshallerContext;

/* JADX INFO: loaded from: classes.dex */
public class TopicConfigurationStaxUnmarshaller extends NotificationConfigurationStaxUnmarshaller<TopicConfiguration> {
    private static TopicConfigurationStaxUnmarshaller instance = new TopicConfigurationStaxUnmarshaller();

    private TopicConfigurationStaxUnmarshaller() {
    }

    public static TopicConfigurationStaxUnmarshaller getInstance() {
        return instance;
    }

    @Override // com.amazonaws.services.s3.model.transform.NotificationConfigurationStaxUnmarshaller
    public TopicConfiguration createConfiguration() {
        return new TopicConfiguration();
    }

    @Override // com.amazonaws.services.s3.model.transform.NotificationConfigurationStaxUnmarshaller
    public boolean handleXmlEvent(TopicConfiguration topicConfiguration, StaxUnmarshallerContext staxUnmarshallerContext, int i2) {
        if (!staxUnmarshallerContext.testExpression("Topic", i2)) {
            return false;
        }
        topicConfiguration.setTopicARN(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext));
        return true;
    }
}
