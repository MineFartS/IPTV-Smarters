package minefarts.iptvsmarters.model.callback;

import minefarts.iptvsmarters.model.pojo.XMLTVProgrammePojo;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes2.dex */
@Root(name = "tv", strict = false)
public class XMLTVCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ElementList(inline = true, required = false)
    public List<XMLTVProgrammePojo> f25102a;

    public String toString() {
        return "ClassPojo [programmePojos= " + this.f25102a + "]";
    }
}
