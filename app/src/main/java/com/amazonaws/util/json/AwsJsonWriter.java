package com.amazonaws.util.json;

import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public interface AwsJsonWriter {
    AwsJsonWriter beginArray();

    AwsJsonWriter beginObject();

    void close();

    AwsJsonWriter endArray();

    AwsJsonWriter endObject();

    void flush();

    AwsJsonWriter name(String str);

    AwsJsonWriter value();

    AwsJsonWriter value(double d2);

    AwsJsonWriter value(long j2);

    AwsJsonWriter value(Number number);

    AwsJsonWriter value(String str);

    AwsJsonWriter value(ByteBuffer byteBuffer);

    AwsJsonWriter value(Date date);

    AwsJsonWriter value(boolean z);
}
