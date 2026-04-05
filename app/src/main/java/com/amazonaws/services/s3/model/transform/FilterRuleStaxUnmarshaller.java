package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.model.FilterRule;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class FilterRuleStaxUnmarshaller implements Unmarshaller<FilterRule, StaxUnmarshallerContext> {
    private static FilterRuleStaxUnmarshaller instance = new FilterRuleStaxUnmarshaller();

    private FilterRuleStaxUnmarshaller() {
    }

    public static FilterRuleStaxUnmarshaller getInstance() {
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public FilterRule unmarshall(StaxUnmarshallerContext staxUnmarshallerContext) throws XmlPullParserException, IOException {
        int currentDepth = staxUnmarshallerContext.getCurrentDepth();
        int i2 = currentDepth + 1;
        if (staxUnmarshallerContext.isStartOfDocument()) {
            i2 += 2;
        }
        FilterRule filterRule = new FilterRule();
        while (true) {
            int iNextEvent = staxUnmarshallerContext.nextEvent();
            if (iNextEvent == 1) {
                return filterRule;
            }
            if (iNextEvent == 2) {
                if (staxUnmarshallerContext.testExpression("Name", i2)) {
                    filterRule.setName(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext));
                } else if (staxUnmarshallerContext.testExpression("Value", i2)) {
                    filterRule.setValue(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext));
                }
            } else if (iNextEvent == 3 && staxUnmarshallerContext.getCurrentDepth() < currentDepth) {
                return filterRule;
            }
        }
    }
}
