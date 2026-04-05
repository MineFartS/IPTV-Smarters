package com.amazonaws.util.json;

/* JADX INFO: loaded from: classes.dex */
public interface AwsJsonReader {
    void beginArray();

    void beginObject();

    void close();

    void endArray();

    void endObject();

    boolean hasNext();

    boolean isContainer();

    String nextName();

    String nextString();

    AwsJsonToken peek();

    void skipValue();
}
