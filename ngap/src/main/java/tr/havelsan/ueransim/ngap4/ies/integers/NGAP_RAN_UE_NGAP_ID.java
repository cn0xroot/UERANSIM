package tr.havelsan.ueransim.ngap4.ies.integers;

import tr.havelsan.ueransim.ngap4.core.*;
import tr.havelsan.ueransim.ngap4.pdu.*;
import tr.havelsan.ueransim.utils.bits.*;
import tr.havelsan.ueransim.utils.octets.*;
import tr.havelsan.ueransim.ngap4.ies.bit_strings.*;
import tr.havelsan.ueransim.ngap4.ies.octet_strings.*;
import tr.havelsan.ueransim.ngap4.ies.printable_strings.*;
import tr.havelsan.ueransim.ngap4.ies.sequences.*;
import tr.havelsan.ueransim.ngap4.ies.sequence_ofs.*;
import tr.havelsan.ueransim.ngap4.ies.choices.*;
import tr.havelsan.ueransim.ngap4.ies.integers.*;
import tr.havelsan.ueransim.ngap4.ies.enumerations.*;

import java.util.List;

public class NGAP_RAN_UE_NGAP_ID extends NGAP_Integer {

    public NGAP_RAN_UE_NGAP_ID(long value) {
        super(value);
    }

    public NGAP_RAN_UE_NGAP_ID(Octet value) {
        super(value);
    }

    public NGAP_RAN_UE_NGAP_ID(Octet2 value) {
        super(value);
    }

    public NGAP_RAN_UE_NGAP_ID(Octet3 value) {
        super(value);
    }

    public NGAP_RAN_UE_NGAP_ID(Octet4 value) {
        super(value);
    }

    @Override
    public String getAsnName() {
        return "RAN-UE-NGAP-ID";
    }

    @Override
    public String getXmlTagName() {
        return "RAN-UE-NGAP-ID";
    }
}
