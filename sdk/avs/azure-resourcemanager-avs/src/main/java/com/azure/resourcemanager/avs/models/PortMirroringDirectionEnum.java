// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Port Mirroring Direction.
 */
public final class PortMirroringDirectionEnum extends ExpandableStringEnum<PortMirroringDirectionEnum> {
    /**
     * is ingress.
     */
    public static final PortMirroringDirectionEnum INGRESS = fromString("INGRESS");

    /**
     * is egress.
     */
    public static final PortMirroringDirectionEnum EGRESS = fromString("EGRESS");

    /**
     * is bidirectional.
     */
    public static final PortMirroringDirectionEnum BIDIRECTIONAL = fromString("BIDIRECTIONAL");

    /**
     * Creates a new instance of PortMirroringDirectionEnum value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PortMirroringDirectionEnum() {
    }

    /**
     * Creates or finds a PortMirroringDirectionEnum from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PortMirroringDirectionEnum.
     */
    public static PortMirroringDirectionEnum fromString(String name) {
        return fromString(name, PortMirroringDirectionEnum.class);
    }

    /**
     * Gets known PortMirroringDirectionEnum values.
     * 
     * @return known PortMirroringDirectionEnum values.
     */
    public static Collection<PortMirroringDirectionEnum> values() {
        return values(PortMirroringDirectionEnum.class);
    }
}
