package c.f.d;

import com.amazonaws.services.s3.model.InstructionFileId;
import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c implements c.f.d.d {
    private static final /* synthetic */ c[] $VALUES;
    public static final c IDENTITY;
    public static final c LOWER_CASE_WITH_DASHES;
    public static final c LOWER_CASE_WITH_DOTS;
    public static final c LOWER_CASE_WITH_UNDERSCORES;
    public static final c UPPER_CAMEL_CASE;
    public static final c UPPER_CAMEL_CASE_WITH_SPACES;

    public enum a extends c {
        public a(String str, int i2) {
            super(str, i2, null);
        }

        @Override // c.f.d.c, c.f.d.d
        public String translateName(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        IDENTITY = aVar;
        c cVar = new c("UPPER_CAMEL_CASE", 1) { // from class: c.f.d.c.b
            {
                a aVar2 = null;
            }

            @Override // c.f.d.c, c.f.d.d
            public String translateName(Field field) {
                return c.upperCaseFirstLetter(field.getName());
            }
        };
        UPPER_CAMEL_CASE = cVar;
        c cVar2 = new c("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: c.f.d.c.c
            {
                a aVar2 = null;
            }

            @Override // c.f.d.c, c.f.d.d
            public String translateName(Field field) {
                return c.upperCaseFirstLetter(c.separateCamelCase(field.getName(), " "));
            }
        };
        UPPER_CAMEL_CASE_WITH_SPACES = cVar2;
        c cVar3 = new c("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: c.f.d.c.d
            {
                a aVar2 = null;
            }

            @Override // c.f.d.c, c.f.d.d
            public String translateName(Field field) {
                return c.separateCamelCase(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_UNDERSCORES = cVar3;
        c cVar4 = new c("LOWER_CASE_WITH_DASHES", 4) { // from class: c.f.d.c.e
            {
                a aVar2 = null;
            }

            @Override // c.f.d.c, c.f.d.d
            public String translateName(Field field) {
                return c.separateCamelCase(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DASHES = cVar4;
        c cVar5 = new c("LOWER_CASE_WITH_DOTS", 5) { // from class: c.f.d.c.f
            {
                a aVar2 = null;
            }

            @Override // c.f.d.c, c.f.d.d
            public String translateName(Field field) {
                return c.separateCamelCase(field.getName(), InstructionFileId.DOT).toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DOTS = cVar5;
        $VALUES = new c[]{aVar, cVar, cVar2, cVar3, cVar4, cVar5};
    }

    private c(String str, int i2) {
    }

    public /* synthetic */ c(String str, int i2, a aVar) {
        this(str, i2);
    }

    public static String separateCamelCase(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static String upperCaseFirstLetter(String str) {
        int length = str.length() - 1;
        int i2 = 0;
        while (!Character.isLetter(str.charAt(i2)) && i2 < length) {
            i2++;
        }
        char cCharAt = str.charAt(i2);
        if (Character.isUpperCase(cCharAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(cCharAt);
        if (i2 == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i2) + upperCase + str.substring(i2 + 1);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    @Override // c.f.d.d
    public abstract /* synthetic */ String translateName(Field field);
}
