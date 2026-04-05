package com.amazonaws.services.s3.model.transform;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.amazonaws.services.s3.model.NotificationConfiguration;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class NotificationConfigurationStaxUnmarshaller<T extends NotificationConfiguration> implements Unmarshaller<Map.Entry<String, NotificationConfiguration>, StaxUnmarshallerContext> {
    public abstract T createConfiguration();

    public abstract boolean handleXmlEvent(T t, StaxUnmarshallerContext staxUnmarshallerContext, int i2);

    @Override // com.amazonaws.transform.Unmarshaller
    public Map.Entry<String, NotificationConfiguration> unmarshall(StaxUnmarshallerContext staxUnmarshallerContext) throws XmlPullParserException, IOException {
        int currentDepth = staxUnmarshallerContext.getCurrentDepth();
        int i2 = currentDepth + 1;
        if (staxUnmarshallerContext.isStartOfDocument()) {
            i2++;
        }
        NotificationConfiguration notificationConfigurationCreateConfiguration = createConfiguration();
        String strUnmarshall = null;
        while (true) {
            int iNextEvent = staxUnmarshallerContext.nextEvent();
            if (iNextEvent == 1) {
                return null;
            }
            if (iNextEvent == 2) {
                if (!handleXmlEvent(notificationConfigurationCreateConfiguration, staxUnmarshallerContext, i2)) {
                    if (staxUnmarshallerContext.testExpression(JsonDocumentFields.POLICY_ID, i2)) {
                        strUnmarshall = SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext);
                    } else if (staxUnmarshallerContext.testExpression("Event", i2)) {
                        notificationConfigurationCreateConfiguration.addEvent(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext));
                    } else if (staxUnmarshallerContext.testExpression("Filter", i2)) {
                        notificationConfigurationCreateConfiguration.setFilter(FilterStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext));
                    }
                }
            } else if (iNextEvent == 3 && staxUnmarshallerContext.getCurrentDepth() < currentDepth) {
                return new AbstractMap.SimpleEntry(strUnmarshall, notificationConfigurationCreateConfiguration);
            }
        }
    }
}
