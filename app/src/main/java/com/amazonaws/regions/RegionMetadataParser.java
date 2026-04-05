package com.amazonaws.regions;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class RegionMetadataParser {
    private static final String DOMAIN_TAG = "Domain";
    private static final String ENDPOINT_TAG = "Endpoint";
    private static final String HOSTNAME_TAG = "Hostname";
    private static final String HTTPS_TAG = "Https";
    private static final String HTTP_TAG = "Http";
    private static final String REGION_ID_TAG = "Name";
    private static final String REGION_TAG = "Region";
    private static final String SERVICE_TAG = "ServiceName";

    @Deprecated
    public RegionMetadataParser() {
    }

    private static void addRegionEndpoint(Region region, Element element, boolean z) {
        String childElementValue = getChildElementValue(SERVICE_TAG, element);
        String childElementValue2 = getChildElementValue(HOSTNAME_TAG, element);
        String childElementValue3 = getChildElementValue(HTTP_TAG, element);
        String childElementValue4 = getChildElementValue(HTTPS_TAG, element);
        if (!z || verifyLegacyEndpoint(childElementValue2)) {
            region.getServiceEndpoints().put(childElementValue, childElementValue2);
            region.getHttpSupport().put(childElementValue, Boolean.valueOf("true".equals(childElementValue3)));
            region.getHttpsSupport().put(childElementValue, Boolean.valueOf("true".equals(childElementValue4)));
        } else {
            throw new IllegalStateException("Invalid service endpoint (" + childElementValue2 + ") is detected.");
        }
    }

    private static String getChildElementValue(String str, Element element) {
        Node nodeItem = element.getElementsByTagName(str).item(0);
        if (nodeItem == null) {
            return null;
        }
        return nodeItem.getChildNodes().item(0).getNodeValue();
    }

    private static List<Region> internalParse(InputStream inputStream, boolean z) {
        try {
            try {
                Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream);
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
                NodeList elementsByTagName = document.getElementsByTagName(REGION_TAG);
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < elementsByTagName.getLength(); i2++) {
                    Node nodeItem = elementsByTagName.item(i2);
                    if (nodeItem.getNodeType() == 1) {
                        arrayList.add(parseRegionElement((Element) nodeItem, z));
                    }
                }
                return arrayList;
            } catch (IOException e2) {
                throw e2;
            } catch (Exception e3) {
                throw new IOException("Unable to parse region metadata file: " + e3.getMessage(), e3);
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    public static RegionMetadata parse(InputStream inputStream) {
        return new RegionMetadata(internalParse(inputStream, false));
    }

    private static Region parseRegionElement(Element element, boolean z) {
        Region region = new Region(getChildElementValue(REGION_ID_TAG, element), getChildElementValue(DOMAIN_TAG, element));
        NodeList elementsByTagName = element.getElementsByTagName(ENDPOINT_TAG);
        for (int i2 = 0; i2 < elementsByTagName.getLength(); i2++) {
            addRegionEndpoint(region, (Element) elementsByTagName.item(i2), z);
        }
        return region;
    }

    private static boolean verifyLegacyEndpoint(String str) {
        return str.endsWith(".amazonaws.com");
    }

    @Deprecated
    public List<Region> parseRegionMetadata(InputStream inputStream) {
        return internalParse(inputStream, false);
    }

    @Deprecated
    public List<Region> parseRegionMetadata(InputStream inputStream, boolean z) {
        return internalParse(inputStream, z);
    }
}
