package com.runsim.backend.nas.impl;

import com.runsim.backend.nas.core.BitInputStream;
import com.runsim.backend.nas.core.BitOutputStream;
import com.runsim.backend.nas.core.values.NASValue;

public class PlainNASMessage extends NASValue {

    ExtendedProtocolDiscriminator extendedProtocolDiscriminator;
    SecurityHeaderType securityHeaderType;

    @Override
    public void encode(BitOutputStream stream) {
        // todo
    }

    @Override
    public void decode(BitInputStream stream) {
        // todo
    }

    @Override
    public String display() {
        // todo
        return null;
    }
}