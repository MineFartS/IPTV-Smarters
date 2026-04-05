package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
public class CamelCaseBuilder implements Style {
    public final boolean attribute;
    public final boolean element;

    public class Attribute extends Splitter {
        private boolean capital;

        private Attribute(String str) {
            super(str);
        }

        @Override // org.simpleframework.xml.stream.Splitter
        public void commit(char[] cArr, int i2, int i3) {
            this.builder.append(cArr, i2, i3);
        }

        @Override // org.simpleframework.xml.stream.Splitter
        public void parse(char[] cArr, int i2, int i3) {
            if (CamelCaseBuilder.this.attribute || this.capital) {
                cArr[i2] = toUpper(cArr[i2]);
            }
            this.capital = true;
        }
    }

    public class Element extends Attribute {
        private boolean capital;

        private Element(String str) {
            super(str);
        }

        @Override // org.simpleframework.xml.stream.CamelCaseBuilder.Attribute, org.simpleframework.xml.stream.Splitter
        public void parse(char[] cArr, int i2, int i3) {
            if (CamelCaseBuilder.this.element || this.capital) {
                cArr[i2] = toUpper(cArr[i2]);
            }
            this.capital = true;
        }
    }

    public CamelCaseBuilder(boolean z, boolean z2) {
        this.attribute = z2;
        this.element = z;
    }

    @Override // org.simpleframework.xml.stream.Style
    public String getAttribute(String str) {
        if (str != null) {
            return new Attribute(str).process();
        }
        return null;
    }

    @Override // org.simpleframework.xml.stream.Style
    public String getElement(String str) {
        if (str != null) {
            return new Element(str).process();
        }
        return null;
    }
}
