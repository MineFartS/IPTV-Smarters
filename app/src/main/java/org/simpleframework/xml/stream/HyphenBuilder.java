package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
public class HyphenBuilder implements Style {

    public class Parser extends Splitter {
        private Parser(String str) {
            super(str);
        }

        @Override // org.simpleframework.xml.stream.Splitter
        public void commit(char[] cArr, int i2, int i3) {
            this.builder.append(cArr, i2, i3);
            if (i2 + i3 < this.count) {
                this.builder.append('-');
            }
        }

        @Override // org.simpleframework.xml.stream.Splitter
        public void parse(char[] cArr, int i2, int i3) {
            cArr[i2] = toLower(cArr[i2]);
        }
    }

    @Override // org.simpleframework.xml.stream.Style
    public String getAttribute(String str) {
        if (str != null) {
            return new Parser(str).process();
        }
        return null;
    }

    @Override // org.simpleframework.xml.stream.Style
    public String getElement(String str) {
        if (str != null) {
            return new Parser(str).process();
        }
        return null;
    }
}
