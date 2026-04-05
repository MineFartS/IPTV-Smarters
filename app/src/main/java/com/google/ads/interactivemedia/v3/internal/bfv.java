package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public abstract class bfv<T> {
    public final T fromJson(Reader reader) {
        return read(new bjj(reader));
    }

    public final T fromJson(String str) {
        return fromJson(new StringReader(str));
    }

    public final T fromJsonTree(bfl bflVar) {
        try {
            return read(new bhi(bflVar));
        } catch (IOException e2) {
            throw new bfm(e2);
        }
    }

    public final bfv<T> nullSafe() {
        return new bfu(this);
    }

    public abstract T read(bjj bjjVar);

    public final String toJson(T t) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void toJson(Writer writer, T t) {
        write(new bjl(writer), t);
    }

    public final bfl toJsonTree(T t) {
        try {
            bhk bhkVar = new bhk();
            write(bhkVar, t);
            return bhkVar.a();
        } catch (IOException e2) {
            throw new bfm(e2);
        }
    }

    public abstract void write(bjl bjlVar, T t);
}
