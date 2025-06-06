// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.security.keyvault.secrets.implementation.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Reflects the deletion recovery level currently in effect for secrets in the current vault. If it contains
 * 'Purgeable', the secret can be permanently deleted by a privileged user; otherwise, only the system can purge the
 * secret, at the end of the retention interval.
 */
public final class DeletionRecoveryLevel extends ExpandableStringEnum<DeletionRecoveryLevel> {
    /**
     * Denotes a vault state in which deletion is an irreversible operation, without the possibility for recovery. This
     * level corresponds to no protection being available against a Delete operation; the data is irretrievably lost
     * upon accepting a Delete operation at the entity level or higher (vault, resource group, subscription etc.).
     */
    @Generated
    public static final DeletionRecoveryLevel PURGEABLE = fromString("Purgeable");

    /**
     * Denotes a vault state in which deletion is recoverable, and which also permits immediate and permanent deletion
     * (i.e. purge). This level guarantees the recoverability of the deleted entity during the retention interval (90
     * days), unless a Purge operation is requested, or the subscription is cancelled. System wil permanently delete it
     * after 90 days, if not recovered.
     */
    @Generated
    public static final DeletionRecoveryLevel RECOVERABLE_PURGEABLE = fromString("Recoverable+Purgeable");

    /**
     * Denotes a vault state in which deletion is recoverable without the possibility for immediate and permanent
     * deletion (i.e. purge). This level guarantees the recoverability of the deleted entity during the retention
     * interval (90 days) and while the subscription is still available. System wil permanently delete it after 90 days,
     * if not recovered.
     */
    @Generated
    public static final DeletionRecoveryLevel RECOVERABLE = fromString("Recoverable");

    /**
     * Denotes a vault and subscription state in which deletion is recoverable within retention interval (90 days),
     * immediate and permanent deletion (i.e. purge) is not permitted, and in which the subscription itself cannot be
     * permanently canceled. System wil permanently delete it after 90 days, if not recovered.
     */
    @Generated
    public static final DeletionRecoveryLevel RECOVERABLE_PROTECTED_SUBSCRIPTION
        = fromString("Recoverable+ProtectedSubscription");

    /**
     * Denotes a vault state in which deletion is recoverable, and which also permits immediate and permanent deletion
     * (i.e. purge when 7 &lt;= SoftDeleteRetentionInDays &lt; 90). This level guarantees the recoverability of the
     * deleted entity during the retention interval, unless a Purge operation is requested, or the subscription is
     * cancelled.
     */
    @Generated
    public static final DeletionRecoveryLevel CUSTOMIZED_RECOVERABLE_PURGEABLE
        = fromString("CustomizedRecoverable+Purgeable");

    /**
     * Denotes a vault state in which deletion is recoverable without the possibility for immediate and permanent
     * deletion (i.e. purge when 7 &lt;= SoftDeleteRetentionInDays &lt; 90).This level guarantees the recoverability of
     * the deleted entity during the retention interval and while the subscription is still available.
     */
    @Generated
    public static final DeletionRecoveryLevel CUSTOMIZED_RECOVERABLE = fromString("CustomizedRecoverable");

    /**
     * Denotes a vault and subscription state in which deletion is recoverable, immediate and permanent deletion (i.e.
     * purge) is not permitted, and in which the subscription itself cannot be permanently canceled when 7 &lt;=
     * SoftDeleteRetentionInDays &lt; 90. This level guarantees the recoverability of the deleted entity during the
     * retention interval, and also reflects the fact that the subscription itself cannot be cancelled.
     */
    @Generated
    public static final DeletionRecoveryLevel CUSTOMIZED_RECOVERABLE_PROTECTED_SUBSCRIPTION
        = fromString("CustomizedRecoverable+ProtectedSubscription");

    /**
     * Creates a new instance of DeletionRecoveryLevel value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public DeletionRecoveryLevel() {
    }

    /**
     * Creates or finds a DeletionRecoveryLevel from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DeletionRecoveryLevel.
     */
    @Generated
    public static DeletionRecoveryLevel fromString(String name) {
        return fromString(name, DeletionRecoveryLevel.class);
    }

    /**
     * Gets known DeletionRecoveryLevel values.
     * 
     * @return known DeletionRecoveryLevel values.
     */
    @Generated
    public static Collection<DeletionRecoveryLevel> values() {
        return values(DeletionRecoveryLevel.class);
    }
}
