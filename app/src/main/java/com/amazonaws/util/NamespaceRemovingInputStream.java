package com.amazonaws.util;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class NamespaceRemovingInputStream extends SdkFilterInputStream {
    private static final int BUFFER_SIZE = 200;
    private boolean hasRemovedNamespace;
    private final byte[] lookAheadData;

    public static final class StringPrefixSlicer {
        private String s;

        public StringPrefixSlicer(String str) {
            this.s = str;
        }

        public String getString() {
            return this.s;
        }

        public boolean removePrefix(String str) {
            if (!this.s.startsWith(str)) {
                return false;
            }
            this.s = this.s.substring(str.length());
            return true;
        }

        public boolean removePrefixEndingWith(String str) {
            int iIndexOf = this.s.indexOf(str);
            if (iIndexOf < 0) {
                return false;
            }
            this.s = this.s.substring(iIndexOf + str.length());
            return true;
        }

        public boolean removeRepeatingPrefix(String str) {
            if (!this.s.startsWith(str)) {
                return false;
            }
            while (this.s.startsWith(str)) {
                this.s = this.s.substring(str.length());
            }
            return true;
        }
    }

    public NamespaceRemovingInputStream(InputStream inputStream) {
        super(new BufferedInputStream(inputStream));
        this.lookAheadData = new byte[200];
        this.hasRemovedNamespace = false;
    }

    private int matchXmlNamespaceAttribute(String str) {
        StringPrefixSlicer stringPrefixSlicer = new StringPrefixSlicer(str);
        if (!stringPrefixSlicer.removePrefix("xmlns")) {
            return -1;
        }
        stringPrefixSlicer.removeRepeatingPrefix(" ");
        if (!stringPrefixSlicer.removePrefix("=")) {
            return -1;
        }
        stringPrefixSlicer.removeRepeatingPrefix(" ");
        if (stringPrefixSlicer.removePrefix("\"") && stringPrefixSlicer.removePrefixEndingWith("\"")) {
            return str.length() - stringPrefixSlicer.getString().length();
        }
        return -1;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        abortIfNeeded();
        int i2 = ((FilterInputStream) this).in.read();
        if (i2 != 120 || this.hasRemovedNamespace) {
            return i2;
        }
        this.lookAheadData[0] = (byte) i2;
        ((FilterInputStream) this).in.mark(this.lookAheadData.length);
        InputStream inputStream = ((FilterInputStream) this).in;
        byte[] bArr = this.lookAheadData;
        int i3 = inputStream.read(bArr, 1, bArr.length - 1);
        ((FilterInputStream) this).in.reset();
        int iMatchXmlNamespaceAttribute = matchXmlNamespaceAttribute(new String(this.lookAheadData, 0, i3 + 1, StringUtils.UTF8));
        if (iMatchXmlNamespaceAttribute <= 0) {
            return i2;
        }
        for (int i4 = 0; i4 < iMatchXmlNamespaceAttribute - 1; i4++) {
            ((FilterInputStream) this).in.read();
        }
        int i5 = ((FilterInputStream) this).in.read();
        this.hasRemovedNamespace = true;
        return i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = read();
            if (i5 == -1) {
                if (i4 == 0) {
                    return -1;
                }
                return i4;
            }
            bArr[i4 + i2] = (byte) i5;
        }
        return i3;
    }
}
