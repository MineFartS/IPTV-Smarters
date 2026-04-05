package com.amplifyframework.util;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class Casing {

    /* JADX INFO: renamed from: com.amplifyframework.util.Casing$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$amplifyframework$util$Casing$CaseType;

        static {
            int[] iArr = new int[CaseType.values().length];
            $SwitchMap$com$amplifyframework$util$Casing$CaseType = iArr;
            try {
                iArr[CaseType.SCREAMING_SNAKE_CASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amplifyframework$util$Casing$CaseType[CaseType.CAMEL_CASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amplifyframework$util$Casing$CaseType[CaseType.PASCAL_CASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum CaseType {
        SCREAMING_SNAKE_CASE,
        CAMEL_CASE,
        PASCAL_CASE
    }

    public static final class CasingSource {
        private final CaseType sourceCasing;

        private CasingSource(CaseType caseType) {
            this.sourceCasing = caseType;
        }

        public /* synthetic */ CasingSource(CaseType caseType, AnonymousClass1 anonymousClass1) {
            this(caseType);
        }

        public CasingTarget to(CaseType caseType) {
            return new CasingTarget(this.sourceCasing, caseType, null);
        }
    }

    public static final class CasingTarget {
        private CaseType sourceCasing;
        private CaseType targetCasing;

        private CasingTarget(CaseType caseType, CaseType caseType2) {
            this.sourceCasing = caseType;
            this.targetCasing = caseType2;
        }

        public /* synthetic */ CasingTarget(CaseType caseType, CaseType caseType2, AnonymousClass1 anonymousClass1) {
            this(caseType, caseType2);
        }

        public String convert(String str) {
            if (str == null || str.length() == 0) {
                return str;
            }
            int i2 = AnonymousClass1.$SwitchMap$com$amplifyframework$util$Casing$CaseType[this.sourceCasing.ordinal()];
            if (i2 == 1) {
                return Casing.fromScreamingSnakeCase(str, this.targetCasing);
            }
            if (i2 == 2) {
                return Casing.fromCamelCase(str, this.targetCasing);
            }
            if (i2 == 3) {
                return Casing.fromPascalCase(str, this.targetCasing);
            }
            throw new IllegalStateException("Unknown source casing = " + this.sourceCasing);
        }
    }

    private Casing() {
    }

    private static String camelToPascal(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.substring(0, 1).toUpperCase(Locale.getDefault()) + str.substring(1);
    }

    public static String capitalize(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.substring(0, 1).toUpperCase(Locale.getDefault()) + str.substring(1).toLowerCase(Locale.getDefault());
    }

    public static String capitalizeFirst(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.substring(0, 1).toUpperCase(Locale.getDefault()) + str.substring(1);
    }

    public static CasingSource from(CaseType caseType) {
        caseType.getClass();
        return new CasingSource(caseType, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String fromCamelCase(String str, CaseType caseType) {
        caseType.getClass();
        if (str == null) {
            return null;
        }
        int i2 = AnonymousClass1.$SwitchMap$com$amplifyframework$util$Casing$CaseType[caseType.ordinal()];
        if (i2 == 1) {
            return toScreamingSnake(str);
        }
        if (i2 == 2) {
            return str;
        }
        if (i2 == 3) {
            return camelToPascal(str);
        }
        throw new IllegalStateException("No such casing = " + caseType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String fromPascalCase(String str, CaseType caseType) {
        caseType.getClass();
        if (str == null) {
            return null;
        }
        int i2 = AnonymousClass1.$SwitchMap$com$amplifyframework$util$Casing$CaseType[caseType.ordinal()];
        if (i2 == 1) {
            return toScreamingSnake(str);
        }
        if (i2 == 2) {
            return pascalToCamel(str);
        }
        if (i2 == 3) {
            return str;
        }
        throw new IllegalStateException("No such casing = " + caseType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String fromScreamingSnakeCase(String str, CaseType caseType) {
        int i2;
        caseType.getClass();
        if (str == null || str.length() == 0 || (i2 = AnonymousClass1.$SwitchMap$com$amplifyframework$util$Casing$CaseType[caseType.ordinal()]) == 1) {
            return str;
        }
        if (i2 == 2) {
            return screamingSnakeToCamel(str);
        }
        if (i2 == 3) {
            return screamingSnakeToPascal(str);
        }
        throw new IllegalStateException("Unknown target casing = " + caseType);
    }

    private static String pascalToCamel(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.substring(0, 1).toLowerCase(Locale.getDefault()) + str.substring(1);
    }

    private static String screamingSnakeToCamel(String str) {
        return (str == null || str.length() == 0) ? str : pascalToCamel(screamingSnakeToPascal(str));
    }

    private static String screamingSnakeToPascal(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        String[] strArrSplit = str.split("_");
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrSplit) {
            sb.append(capitalize(str2));
        }
        return sb.toString();
    }

    private static String toScreamingSnake(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            char upperCase = charArray[i2];
            if (Character.isLetterOrDigit(upperCase)) {
                if (Character.isLowerCase(upperCase)) {
                    upperCase = Character.toUpperCase(upperCase);
                } else if (i2 != 0) {
                    sb.append("_");
                }
                sb.append(upperCase);
            } else {
                sb.append("_");
            }
        }
        return sb.toString();
    }
}
