package org.simpleframework.xml.stream;

import java.io.InputStream;
import java.io.Reader;

/* JADX INFO: loaded from: classes2.dex */
public interface Provider {
    EventReader provide(InputStream inputStream);

    EventReader provide(Reader reader);
}
