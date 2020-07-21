/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "NGAP-IEs"
 * 	found in "asn/NGAP-IEs.asn"
 * 	`asn1c -fcompound-names -findirect-choice -fno-include-deps -gen-PER -no-gen-OER -no-gen-example -D ngap -pdu=all`
 */

#ifndef	_NGAP_TAICancelledNR_Item_H_
#define	_NGAP_TAICancelledNR_Item_H_


#include <asn_application.h>

/* Including external dependencies */
#include "NGAP_TAI.h"
#include "NGAP_CancelledCellsInTAI-NR.h"
#include <constr_SEQUENCE.h>

#ifdef __cplusplus
extern "C" {
#endif

/* Forward declarations */
struct NGAP_ProtocolExtensionContainer;

/* NGAP_TAICancelledNR-Item */
typedef struct NGAP_TAICancelledNR_Item {
	NGAP_TAI_t	 tAI;
	NGAP_CancelledCellsInTAI_NR_t	 cancelledCellsInTAI_NR;
	struct NGAP_ProtocolExtensionContainer	*iE_Extensions;	/* OPTIONAL */
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} NGAP_TAICancelledNR_Item_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_NGAP_TAICancelledNR_Item;
extern asn_SEQUENCE_specifics_t asn_SPC_NGAP_TAICancelledNR_Item_specs_1;
extern asn_TYPE_member_t asn_MBR_NGAP_TAICancelledNR_Item_1[3];

#ifdef __cplusplus
}
#endif

#endif	/* _NGAP_TAICancelledNR_Item_H_ */
#include <asn_internal.h>