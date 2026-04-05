package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.services.securitytoken.model.Tag;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class TagStaxUnmarshaller implements Unmarshaller<Tag, StaxUnmarshallerContext> {
    private static TagStaxUnmarshaller instance;

    public static TagStaxUnmarshaller getInstance() {
        if (instance == null) {
            instance = new TagStaxUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public Tag unmarshall(StaxUnmarshallerContext staxUnmarshallerContext) throws XmlPullParserException, IOException {
        Tag tag = new Tag();
        int currentDepth = staxUnmarshallerContext.getCurrentDepth();
        int i2 = currentDepth + 1;
        if (staxUnmarshallerContext.isStartOfDocument()) {
            i2 += 2;
        }
        while (true) {
            int iNextEvent = staxUnmarshallerContext.nextEvent();
            if (iNextEvent == 1) {
                break;
            }
            if (iNextEvent != 2) {
                if (iNextEvent == 3 && staxUnmarshallerContext.getCurrentDepth() < currentDepth) {
                    break;
                }
            } else if (staxUnmarshallerContext.testExpression("Key", i2)) {
                tag.setKey(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext));
            } else if (staxUnmarshallerContext.testExpression("Value", i2)) {
                tag.setValue(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext));
            }
        }
        return tag;
    }
}
