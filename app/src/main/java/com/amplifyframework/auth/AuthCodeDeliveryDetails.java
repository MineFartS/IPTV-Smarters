package com.amplifyframework.auth;

import a.i.q.d;
import com.amazonaws.regions.ServiceAbbreviations;

/* JADX INFO: loaded from: classes.dex */
public final class AuthCodeDeliveryDetails {
    private String attributeName;
    private DeliveryMedium deliveryMedium;
    private String destination;

    public enum DeliveryMedium {
        EMAIL(ServiceAbbreviations.Email),
        SMS("sms"),
        PHONE("phone"),
        UNKNOWN("unknown");

        private String value;

        DeliveryMedium(String str) {
            str.getClass();
            this.value = str;
        }

        public static DeliveryMedium fromString(String str) {
            for (DeliveryMedium deliveryMedium : values()) {
                if (deliveryMedium.getValue().equalsIgnoreCase(str)) {
                    return deliveryMedium;
                }
            }
            return UNKNOWN;
        }

        public String getValue() {
            return this.value;
        }
    }

    public AuthCodeDeliveryDetails(String str, DeliveryMedium deliveryMedium) {
        this(str, deliveryMedium, null);
    }

    public AuthCodeDeliveryDetails(String str, DeliveryMedium deliveryMedium, String str2) {
        str.getClass();
        this.destination = str;
        deliveryMedium.getClass();
        this.deliveryMedium = deliveryMedium;
        this.attributeName = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthCodeDeliveryDetails.class != obj.getClass()) {
            return false;
        }
        AuthCodeDeliveryDetails authCodeDeliveryDetails = (AuthCodeDeliveryDetails) obj;
        return d.a(getDestination(), authCodeDeliveryDetails.getDestination()) && d.a(getDeliveryMedium(), authCodeDeliveryDetails.getDeliveryMedium()) && d.a(getAttributeName(), authCodeDeliveryDetails.getAttributeName());
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public DeliveryMedium getDeliveryMedium() {
        return this.deliveryMedium;
    }

    public String getDestination() {
        return this.destination;
    }

    public int hashCode() {
        return d.b(getDestination(), getDeliveryMedium(), getAttributeName());
    }

    public String toString() {
        return "AuthCodeDeliveryDetails{destination='" + this.destination + "', deliveryMedium=" + this.deliveryMedium + ", attributeName='" + this.attributeName + "'}";
    }
}
