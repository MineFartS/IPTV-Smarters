package com.facebook.ads.redexgen.X;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class J2 {
    public static String A00(String str) {
        int iIndexOf = str.indexOf(58);
        return iIndexOf == -1 ? str : str.substring(iIndexOf + 1);
    }

    public static String A01(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if (xmlPullParser.getAttributeName(i2).equals(str)) {
                return xmlPullParser.getAttributeValue(i2);
            }
        }
        return null;
    }

    public static String A02(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if (A00(xmlPullParser.getAttributeName(i2)).equals(str)) {
                return xmlPullParser.getAttributeValue(i2);
            }
        }
        return null;
    }

    public static boolean A03(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean A04(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 3;
    }

    public static boolean A05(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return A04(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean A06(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return A03(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean A07(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return A03(xmlPullParser) && A00(xmlPullParser.getName()).equals(str);
    }
}
