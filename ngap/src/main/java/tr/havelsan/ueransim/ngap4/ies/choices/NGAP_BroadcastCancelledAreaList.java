package tr.havelsan.ueransim.ngap4.ies.choices;

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

public class NGAP_BroadcastCancelledAreaList extends NGAP_Choice {

    public NGAP_CellIDCancelledEUTRA cellIDCancelledEUTRA;
    public NGAP_TAICancelledEUTRA tAICancelledEUTRA;
    public NGAP_EmergencyAreaIDCancelledEUTRA emergencyAreaIDCancelledEUTRA;
    public NGAP_CellIDCancelledNR cellIDCancelledNR;
    public NGAP_TAICancelledNR tAICancelledNR;
    public NGAP_EmergencyAreaIDCancelledNR emergencyAreaIDCancelledNR;

    @Override
    public String getAsnName() {
        return "BroadcastCancelledAreaList";
    }

    @Override
    public String getXmlTagName() {
        return "BroadcastCancelledAreaList";
    }

    @Override
    public String[] getMemberNames() {
        return new String[]{"cellIDCancelledEUTRA", "tAICancelledEUTRA", "emergencyAreaIDCancelledEUTRA", "cellIDCancelledNR", "tAICancelledNR", "emergencyAreaIDCancelledNR"};
    }

    @Override
    public String[] getMemberIdentifiers() {
        return new String[]{"cellIDCancelledEUTRA", "tAICancelledEUTRA", "emergencyAreaIDCancelledEUTRA", "cellIDCancelledNR", "tAICancelledNR", "emergencyAreaIDCancelledNR"};
    }
}
