// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The language codes supported for input text by SplitSkill.
 */
public final class SplitSkillLanguage extends ExpandableStringEnum<SplitSkillLanguage> {
    /**
     * Amharic.
     */
    @Generated
    public static final SplitSkillLanguage AM = fromString("am");

    /**
     * Bosnian.
     */
    @Generated
    public static final SplitSkillLanguage BS = fromString("bs");

    /**
     * Czech.
     */
    @Generated
    public static final SplitSkillLanguage CS = fromString("cs");

    /**
     * Danish.
     */
    @Generated
    public static final SplitSkillLanguage DA = fromString("da");

    /**
     * German.
     */
    @Generated
    public static final SplitSkillLanguage DE = fromString("de");

    /**
     * English.
     */
    @Generated
    public static final SplitSkillLanguage EN = fromString("en");

    /**
     * Spanish.
     */
    @Generated
    public static final SplitSkillLanguage ES = fromString("es");

    /**
     * Estonian.
     */
    @Generated
    public static final SplitSkillLanguage ET = fromString("et");

    /**
     * Finnish.
     */
    @Generated
    public static final SplitSkillLanguage FI = fromString("fi");

    /**
     * French.
     */
    @Generated
    public static final SplitSkillLanguage FR = fromString("fr");

    /**
     * Hebrew.
     */
    @Generated
    public static final SplitSkillLanguage HE = fromString("he");

    /**
     * Hindi.
     */
    @Generated
    public static final SplitSkillLanguage HI = fromString("hi");

    /**
     * Croatian.
     */
    @Generated
    public static final SplitSkillLanguage HR = fromString("hr");

    /**
     * Hungarian.
     */
    @Generated
    public static final SplitSkillLanguage HU = fromString("hu");

    /**
     * Indonesian.
     */
    @Generated
    public static final SplitSkillLanguage ID = fromString("id");

    /**
     * Icelandic.
     */
    @Generated
    public static final SplitSkillLanguage IS = fromString("is");

    /**
     * Italian.
     */
    @Generated
    public static final SplitSkillLanguage IT = fromString("it");

    /**
     * Japanese.
     */
    @Generated
    public static final SplitSkillLanguage JA = fromString("ja");

    /**
     * Korean.
     */
    @Generated
    public static final SplitSkillLanguage KO = fromString("ko");

    /**
     * Latvian.
     */
    @Generated
    public static final SplitSkillLanguage LV = fromString("lv");

    /**
     * Norwegian.
     */
    @Generated
    public static final SplitSkillLanguage NB = fromString("nb");

    /**
     * Dutch.
     */
    @Generated
    public static final SplitSkillLanguage NL = fromString("nl");

    /**
     * Polish.
     */
    @Generated
    public static final SplitSkillLanguage PL = fromString("pl");

    /**
     * Portuguese (Portugal).
     */
    @Generated
    public static final SplitSkillLanguage PT = fromString("pt");

    /**
     * Portuguese (Brazil).
     */
    @Generated
    public static final SplitSkillLanguage PT_BR = fromString("pt-br");

    /**
     * Russian.
     */
    @Generated
    public static final SplitSkillLanguage RU = fromString("ru");

    /**
     * Slovak.
     */
    @Generated
    public static final SplitSkillLanguage SK = fromString("sk");

    /**
     * Slovenian.
     */
    @Generated
    public static final SplitSkillLanguage SL = fromString("sl");

    /**
     * Serbian.
     */
    @Generated
    public static final SplitSkillLanguage SR = fromString("sr");

    /**
     * Swedish.
     */
    @Generated
    public static final SplitSkillLanguage SV = fromString("sv");

    /**
     * Turkish.
     */
    @Generated
    public static final SplitSkillLanguage TR = fromString("tr");

    /**
     * Urdu.
     */
    @Generated
    public static final SplitSkillLanguage UR = fromString("ur");

    /**
     * Chinese (Simplified).
     */
    @Generated
    public static final SplitSkillLanguage ZH = fromString("zh");

    /**
     * Creates a new instance of SplitSkillLanguage value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public SplitSkillLanguage() {
    }

    /**
     * Creates or finds a SplitSkillLanguage from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SplitSkillLanguage.
     */
    @Generated
    public static SplitSkillLanguage fromString(String name) {
        return fromString(name, SplitSkillLanguage.class);
    }

    /**
     * Gets known SplitSkillLanguage values.
     * 
     * @return known SplitSkillLanguage values.
     */
    @Generated
    public static Collection<SplitSkillLanguage> values() {
        return values(SplitSkillLanguage.class);
    }
}
