package io.realm;

import io.realm.internal.Keep;
import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public enum RealmFieldType {
    INTEGER(0),
    BOOLEAN(1),
    STRING(2),
    BINARY(4),
    UNSUPPORTED_TABLE(5),
    UNSUPPORTED_MIXED(6),
    UNSUPPORTED_DATE(7),
    DATE(8),
    FLOAT(9),
    DOUBLE(10),
    OBJECT(12),
    LIST(13),
    LINKING_OBJECTS(14);

    private static final RealmFieldType[] typeList = new RealmFieldType[15];
    private final int nativeValue;

    static {
        RealmFieldType[] realmFieldTypeArrValues = values();
        for (int i2 = 0; i2 < realmFieldTypeArrValues.length; i2++) {
            typeList[realmFieldTypeArrValues[i2].nativeValue] = realmFieldTypeArrValues[i2];
        }
    }

    RealmFieldType(int i2) {
        this.nativeValue = i2;
    }

    public static RealmFieldType fromNativeValue(int i2) {
        RealmFieldType realmFieldType;
        if (i2 >= 0) {
            RealmFieldType[] realmFieldTypeArr = typeList;
            if (i2 < realmFieldTypeArr.length && (realmFieldType = realmFieldTypeArr[i2]) != null) {
                return realmFieldType;
            }
        }
        throw new IllegalArgumentException("Invalid native Realm type: " + i2);
    }

    public int getNativeValue() {
        return this.nativeValue;
    }

    public boolean isValid(Object obj) {
        switch (this.nativeValue) {
            case 0:
                return (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte);
            case 1:
                return obj instanceof Boolean;
            case 2:
                return obj instanceof String;
            case 3:
            case 6:
            case 11:
            default:
                throw new RuntimeException("Unsupported Realm type:  " + this);
            case 4:
                return (obj instanceof byte[]) || (obj instanceof ByteBuffer);
            case 5:
                return obj == null || (obj instanceof Object[][]);
            case 7:
                return obj instanceof Date;
            case 8:
                return obj instanceof Date;
            case 9:
                return obj instanceof Float;
            case 10:
                return obj instanceof Double;
            case 12:
            case 13:
            case 14:
                return false;
        }
    }
}
